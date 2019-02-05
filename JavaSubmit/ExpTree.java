import java.util.*;
import java.io.*;
import cs1.*;
//Create a new class, ExpTree.
public class ExpTree extends Tree{//This class should be inherited from your tree class.
   private TreeNode root; 
   public ExpTree(TreeNode t){//You will need to add a constructor to the Tree class that takes a TreeNode
      
      super(t);
		root = t;//as the parameter for the root.

	}

   public void printInOrderHelper(TreeNode root) {
      
      
      String value = (String)root.getValue();
	   String operators = "* /+-";
      if( root == null) return;
      if(operators.indexOf(value.substring(0,1)) != -1) //if left child is opperator put left parenthesis
         System.out.print("(");
      if (root.getLeft() != null)
      {
        TreeNode curr = root;
        printInOrderHelper(root.getLeft());
        curr = curr.getLeft();
      }
      if( root != null)
         System.out.print(root.getValue());
      if (root.getRight() != null)
      {
        TreeNode curr = root;
        printInOrderHelper(root.getRight());
        curr = curr.getRight();
        
      }
      if(operators.indexOf(value.substring(0,1)) != -1)
         System.out.print(")" );
   }

//Draw some expression trees by hand to discover what characteristics the nodes
//that contain operators have.  
//You will NOT be doing efficient parentheses – some non-essential parentheses may end up being inserted.
}