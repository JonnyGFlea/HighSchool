import java.util.*;
import cs1.*;

public class Postfix
{
   public static void main(String[] args)
   {

   System.out.print("Infix: ");
   String infix = Keyboard.readString(); //"a+b-c*((d-e)/(a+d)-f)+g";
   System.out.println( "Postfix: " + convert(infix)); // ab+cde-ad+/f-*-g+

   }

   public static String convert(String infix)
   {
   String opperands = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
   String postFix = "";
   String operators = "*/+-"; //precedence
   Stack<String> st = new Stack<String>(); //You will be using a stack to store the operators (and opening parentheses)


      for(int j = 0; j <infix.length(); j++)// Loop through the infix string
      {
         //System.out.println(st);
         String theChar = infix.substring(j, j+1);
         if(theChar.equals("("))
                  {
                     st.push(theChar); // Opening parentheses are always pushed onto the stack
                     //System.out.println("Made it to open p");
                  }
         else
         if(theChar.equals(")")) //Closing parentheses cause all operators above the most recent opening parentheses must be popped and appended to the postfix string.
                  {
                     while(!st.peek().equals("("))
                     {//You need to pop and append ALL operators that are above the most recent opening parentheses
                        postFix += st.pop(); //pops appends down to corresponding (
                     }
                     st.pop();//Pop and discard the (
                     //System.out.println("Made it to close p");
                  }
         else
         if(operators.indexOf(theChar) != -1)  // If the character is an operator
         {
            //System.out.println("Made it to operator checkpoint");
            if(theChar.equals("*") || theChar.equals("/"))
            {
               while(!st.isEmpty() && !st.peek().equals("(") && (st.peek().equals("*") ||st.peek().equals("/")))
               //AND that have precedence higher than or equal to the operator that you are processing
               {
                  postFix += st.pop();
               }
               st.push(theChar);
               //System.out.println("Made it to * checkpoint");
              }

            if(theChar.equals("+") || theChar.equals("-"))
            {
               while(!st.isEmpty() && !st.peek().equals("(") && operators.indexOf(theChar) <= operators.indexOf("-"))
               {
                 postFix += st.pop();
               }
               st.push(theChar);
               //System.out.println("Made it to +/- checkpoint");
            }
         }
         else
            {//If the character is an operand, append it to the postfix string
            postFix += theChar;
            //System.out.println("Made it to the opperands checkpoint");
            // When you are done looping through the infix string, the stack might still have some operators.  These need to be popped and appended to the postfix string.
            }
     }
     while(!st.isEmpty())
     {// When you are done looping through the infix string, the stack might still have some operators.  These need to be popped and appended to the postfix string.
       postFix += st.pop();
     }

   return postFix;
   }

}
