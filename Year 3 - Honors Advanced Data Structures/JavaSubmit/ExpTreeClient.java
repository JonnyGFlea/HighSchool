import java.util.*;
import java.io.*;
import cs1.*;

//Create a client program that allows the user to enter an infix expression.
//Call it ExpTreeClient
public class ExpTreeClient{
   
   public static void main(String[] args)
   {
   System.out.print("Enter an Equation: ");
   String infix = Keyboard.readString();
   //Convert the expression to a postfix expression using your code from the postfix lab.
   String pfix = Postfix.convert(infix);
   //System.out.println("Postfix: " + pfix); 
   //At the end, the reference to the root of the tree will be the only remaining element
   //on the stack
  // Tree jonny = new Tree(makeTree(pfix));
   TreeNode t = makeTree(pfix);
   //Instantiate an instance of the class ExpTree and
   //make its root be the reference on the top of the stack.
   ExpTree p = new ExpTree(t);
   
   //Use the provided methods to traverse the tree and output the expression
   //in prefix, postfix, and infix notation.
   System.out.println("Printed Tree");
   p.PrintTree();
   System.out.print("Prefix: ");
   p.printPreOrderHelper(t);
   System.out.println("");
   System.out.print("Infix: ");
   p.printInOrderHelper(t);
    System.out.println("");
   System.out.print("PostFix: ");
   p.printPostOrderHelper(t);
   System.out.println("");
   
   
   }
   
   public static TreeNode makeTree(String postfix){
   Stack<TreeNode>stackOfTrees = new Stack<TreeNode>();
   
   //Build a binary expression tree from the postfix expression using the following algorithm:
   String opperands = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
   String operators = "*/+-";
     for(int k = 0; k < postfix.length(); k++)//Going from left to right, take the next token:
      {
      String curr = postfix.substring(k,k+1);
      TreeNode nodeT = new TreeNode(curr, null, null); //Create a new node for the token.
         if(opperands.indexOf(curr) != -1)//If it is an operand:
            {
            //set the left and right children to null and
            //push the reference to the new node on a stack.
               nodeT.setLeft(null);
               nodeT.setRight(null);
               stackOfTrees.push(nodeT);
            }

         else //If it is an operator:
            {//pop a reference from the stack and
            nodeT.setRight(stackOfTrees.pop());//set the new node's right child to it.
            if(!stackOfTrees.isEmpty())
               {//Pop another reference from the stack and
               nodeT.setLeft(stackOfTrees.pop()); //set the new node's left child to it.
               }
            stackOfTrees.push(nodeT);//Push the reference to the new node on the stack.
            }
         }
        
      
   return stackOfTrees.pop();
   }


}