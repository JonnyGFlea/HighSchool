import java.util.*;
import cs1.*;

public class ConvertInfix2
{
   public static void main(String[] args)
   {
   System.out.print("Infix: ");
   String infix = Keyboard.readString();
   List<String> inF = new ArrayList<String>();
   inF.add(infix);
   System.out.println( "Postfix: " + convert(inF));
   }
   public static List<String> convert(List<String> infix)
   {
   String opperands = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
   String postFix = "";
   String operators = "*/+-"; 
   Stack<String> st = new Stack<String>(); 
   List<String> expression = new ArrayList<String>();

      for(int j = 0; j <infix.size(); j++)
      {
         String theChar = infix.get(j);
         if(theChar.equals("("))
                  {
                     st.push(theChar); 
                  }
         else
         if(theChar.equals(")"))
                  {
                     while(!st.peek().equals("("))
                     {
                        postFix = st.pop();
                        expression.add(postFix);
                     }
                     st.pop();
                     
                  }
         else
         if(operators.indexOf(theChar) != -1) 
         {
            if(theChar.equals("*") || theChar.equals("/"))
            {
               while(!st.isEmpty() && !st.peek().equals("(") && operators.indexOf(theChar) >= operators.indexOf("/"))
               {
                  postFix = st.pop();
                  expression.add(postFix);
               }
               st.push(theChar);
              }

            if(theChar.equals("+") || theChar.equals("-"))
            {
               while(!st.isEmpty() && !st.peek().equals("(") && operators.indexOf(theChar) <= operators.indexOf("-"))
               {
                 postFix = st.pop();
                 expression.add(postFix);
               }
               st.push(theChar);
            }
         }
         else
            {
            postFix = theChar;
            expression.add(postFix);

            }
     }
     while(!st.isEmpty())
     {
         postFix = st.pop();
         expression.add(postFix);
     }

   return expression;
   }

}