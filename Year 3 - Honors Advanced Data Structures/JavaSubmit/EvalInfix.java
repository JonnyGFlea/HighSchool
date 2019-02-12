import java.util.*;
import cs1.*;


public class EvalInfix
{
   public static void main(String[] args)
   {
   System.out.print("Infix: ");
   String infix = Keyboard.readString();
   String postfix = Postfix.convert(infix);
   int answer = result(postfix);
   }
   public static int result(String postfix)
   {
   String opperands = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
   String postFix = "";
   String operators = "*/+-";
   int finalAns = -1;
   Stack<Integer> st = new Stack<Integer>();
   List<LetterVal> variables = new ArrayList<LetterVal>();
   
   System.out.println("postfix: " + postfix);
   // Perform ONE pass through the postfix expression:
   for(int k = 0; k < postfix.length(); k++)
      {
      String theChar = postfix.substring(k,k+1);
      // System.out.println("stack: " + st);
      // If the character is an operand,
      if(opperands.indexOf(theChar)!= -1)
         {// You will check to see if you have already encountered this operand.(a+b)/(c-b)
         boolean found = false;
         for(int r = 0; r < variables.size(); r++)
            {
            LetterVal temp = variables.get(r);
            if(theChar.equals(temp.getLetter())) 
               {
               found = true;
               st.push(temp.getValue());
               }
            } 
            if(!found)
            {// If you have not, you will prompt the user to enter a value for the operand
               System.out.print("The Value of " + theChar+ ": ");
               // You will instantiate an object of your variable class, and store the character with its value
               String letter = theChar;
               int number = Keyboard.readInt();
               variables.add(new LetterVal(letter,number));
               // You will push the value of the variable onto the stack
               st.push(number);
               System.out.println("here stack: " + st);
            }
      
         }
          // If the character is an operator, you will pop, pop, and apply the operator. Push the result onto the stack.  
      if(!st.isEmpty() && operators.indexOf(theChar)!= -1)
         {
           int opOne = st.pop();
           int opTwo = st.pop(); 
           int answer = -1;      
            if(theChar.equals("+"))
            {
            answer = opOne + opTwo;
            st.push(answer);
            }
            
            if(theChar.equals("-"))
            {
            answer = opTwo-opOne;
            st.push(answer);
            }

            if(theChar.equals("*"))
            {
            answer = opTwo*opOne;
            st.push(answer);
            }

            if(theChar.equals("/"))
            {
            answer = opTwo/opOne;
            st.push(answer);
            }
            
           }
           }
          // When you reach the end of the postfix string the value of the expression will be the only item on your stack.
          if(!st.isEmpty())
          {
          finalAns = st.pop();
          }
          else
          System.out.println("finalANS not found");
    
    
    // System.out.println(st);
    System.out.println(finalAns);
    return finalAns;
   }
   
   public static int result(List<String> postfix)
   {
      String opperands = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String operators = "*/+-";
      String theory = "()";
      //int finalAns = -1;
      Stack<Integer> st = new Stack<Integer>();
      
      System.out.println("postfix: " + postfix);
      System.out.println("stack: " + st);
      
      for(int k = 0; k < postfix.size(); k++)  
      {
         String theChar = postfix.get(k);
         if(theory.indexOf(theChar) == -1 && operators.indexOf(theChar) == -1)
            {
            //System.out.print("opperand push");
            st.push(Integer.valueOf(theChar));
            }
            // If the character is an operator, you will pop, pop, and apply the operator. Push the result onto the stack.  
         if(!st.isEmpty() && operators.indexOf(theChar)!= -1)
         {
            int opOne = st.pop();
            int opTwo = st.pop(); 
            int answer = -1;  
            //System.out.print("operator"); 
            //System.out.println("stack: " + st);   
            if(theChar.equals("+"))
            {
            answer = opOne + opTwo;
            //System.out.print("operator push");
            st.push(answer);
            }
            
            if(theChar.equals("-"))
            {
            answer = opTwo - opOne;
            //System.out.print("operator push");
            st.push(answer);
            }

            if(theChar.equals("*"))
            {
            answer = opTwo * opOne;
            //System.out.print("operator push");
            st.push(answer);
            }

            if(theChar.equals("/"))
            {
            answer = opTwo / opOne;
            //System.out.print("operator push");
            st.push(answer);
            }
            
         }
      }
          // When you reach the end of the postfix string the value of the expression will be the only item on your stack.
          //if(!st.isEmpty())
          //{
          //finalAns = st.pop();
          //}
          //else
          //System.out.println("finalANS not found");
    
    
    // System.out.println(st);
    //System.out.println(finalAns);
    System.out.println("stack: " + st);
    return st.peek();
      }
}
   
   