/**
*	file: Tree1.java
*
*	An implementation of a Binary Search Tree of ints in which
*	a value less than the value in the root will be in the left
*   subtree, and a value greater than the value in the root
*	will be in the right subtree. Some methods are to completed by
*	the user
*
*/

import java.util.*;
import java.io.*;
import cs1.*;


public class Tree {

	private TreeNode root;

	
	/**
	*	creates a Tree with the root == null
	*/
	public Tree(){
	
		root = null;

	}
		public Tree(TreeNode t){
	
		root = t;

	}
	/**
	*	creates a Tree with the root == to a Node with the
	*	num for a value
	*
	*	@param int num
	*/
	public Tree (Object num) {
		
		root = new TreeNode(num, null, null);
	}
	

	/**
	*	places the num into the appropriate position of a BST
	*
	*	@param int num
	*/
	public void insert(Object num) {
	
		if (root == null) {
			root = new TreeNode(num, null, null);
		} else {
			root = insertHelper(num, root);
		}
	}
	
		/**
		*	creates a Node with the value and inserts it
		*	into the appropriate position in the tree; if
		*	value < value of current node it will be inserted
		*	into the left subtree, and if value > current node, it will
		*	be inserted into the right subtree; it will not be inserted
		*	if the value is already in the tree
		*
		*	@param int value
		*	@param Node t
		*	@return Node
		*/
		public TreeNode insertHelper(Object value, TreeNode t) {
		
			if (t == null) {
				t = new TreeNode(value, null, null);
			} else {
				Comparable lhs = (Comparable)(value);
				
				Comparable rhs = (Comparable)(t.getValue());
				if (lhs.compareTo(rhs)< 0) {
				//if (value.compareTo(rhs)< 0) {  //this will break it - compiler error
					t.setLeft(insertHelper(value, t.getLeft()));
				} else if (lhs.compareTo(rhs) > 0) { // no duplicates!!
				//} else if (value.compareTo(rhs) > 0) { // no duplicates!!  //this will break it
					t.setRight(insertHelper(value, t.getRight()));
				}
			}
			return t;
		}
		
	/**
	*	prints the Tree using a PreOrder traversal of the tree
	*/
	public void printPreOrder() {
	
		System.out.print("{ ");
		if (root != null)
			printPreOrderHelper(root);
		System.out.println("}");		
	}
	
	
	/**
	*	Prints the value of this Node, the left subtree,
	*   	and the right subtree;
	*/
	public void printPreOrderHelper(TreeNode root) {
	
		// to be completed by user
      if( root == null) return;
      System.out.print(root.getValue() + " ");
      printPreOrderHelper(root.getLeft());
      printPreOrderHelper(root.getRight());
	}
	

	/**
	*	prints the Tree using an InOrder traversal of the tree
	*/
	public void printInOrder() {
	
		System.out.print("{ ");
		if (root != null)
			printInOrderHelper(root);
		System.out.println("}");		
	}
	
	
	/**
	*	Prints the left subtree, the value of this Node,
	*   and the right subtree;
	*/
	public void printInOrderHelper(TreeNode root) {
	   
      if( root == null) return;
      printInOrderHelper(root.getLeft());
      System.out.print(root.getValue() + " ");
      printInOrderHelper(root.getRight());
	
	}
	
	
	/**
	*	prints the Tree using a PostOrder traversal of the tree
	*/
	public void printPostOrder() {
	
		System.out.print("{ ");
		if (root != null)
			printPostOrderHelper(root);
		System.out.println("}");		
	}
	
	/**
	*	Prints the left subtree,
	*   the right subtree, and the value of this Node;
	*/
	public void printPostOrderHelper(TreeNode root) {
	
	
		// to be completed by user
      if( root == null) return;
      printPostOrderHelper(root.getLeft());
      printPostOrderHelper(root.getRight());
      System.out.print(root.getValue() + " ");
      
 	}
	
	
	/**
	*	indicates whether the tree has any nodes or not
	*
	*	@return boolean
	*/
	public boolean isEmpty() {
	
		return root == null;
	}
	
	/**
	*	returns the number of nodes in the tree
	*
	*	@return int
	*/
	public int size() {
	
		if (root != null) {	
			return sizeHelper(root);
		} else {
			return 0;
		}
	}
	
	/**
	*	returns 1 + the number of nodes in the
	*	left subtree + the number of nodes in the right
	*	subtree; if the tree is empty it returns 0
	*
	*	@param Node lt
	*	@return int
	*/
	public int sizeHelper(TreeNode t) {
   
		// to be completed by the user
      if (t == null)return 0;
         return 1 + sizeHelper(t.getLeft()) + sizeHelper(t.getRight()); 
	}

	/**
	*	returns the height of this tree (the number of edges in
	*	the longest path from the root to a leaf)
	*
	*	@return int
	*/
	public int height() {
	
		if (root != null) {
			return heightHelper(root);
		} else {
			return 0;
		}
	}
	

		/**
		*	returns 1 + the max of the number of nodes in the
		*	left subtree and the number of nodes in the right
		*	subtree; if the tree is empty it returns -1
		*
		*	@param Node lt
		*	@return int
		*/
		public int heightHelper(TreeNode t) {
		
			// to be completed by the user
			if (t == null) return -1;
         return 1 + Math.max(heightHelper(t.getLeft()),
                            heightHelper(t.getRight()));
		}
		
		public void PrintTree()
		{
			int h = height()+1;
			double maxcol = Math.pow(2,h);
			Object pic[][] = new Object[h][(int)maxcol];
			
			TreeToPic(root,0,(int)maxcol/2,(int)maxcol,pic);
			
			for (int r=0; r<h; r++)
			{
				for (int c=0; c<maxcol; c++)
					if (pic[r][c] != null)
						System.out.print(pic[r][c]);
					else
						System.out.print("  ");
				System.out.println();
			}
		}
		
		private void TreeToPic(TreeNode root, int row, int col, int width, Object[][] pic)
		{
			int subwidth;
			if(root != null)
			{
				pic[row][col] = root.getValue();
				subwidth = width/2;
				TreeToPic(root.getLeft(),row+1,col-subwidth/2,subwidth,pic);
				TreeToPic(root.getRight(),row+1,col+subwidth/2,subwidth,pic);
			}
		}
   	private boolean valsGreater(TreeNode t, Comparable obj)
      {
   	// returns true if t is null or all values stored in t
   	// are greater than obj
      Comparable temp = ((Comparable)obj);
      if(t == null)
         return true;
          
      if (temp.compareTo(t.getValue()) < 0) //good (value is greater than temp)
      {
         return valsGreater(t.getLeft(),obj) && valsGreater(t.getRight(),obj);
   	} 
      
      return false; //bad
   
   	}
   	private boolean valsLess(TreeNode t, Comparable obj){
   	// returns true if t is null or all values stored in t
   	// are less than obj
   	Comparable temp = ((Comparable)obj);
      
      if(t == null)
         return true;   
      
      
      if (temp.compareTo(t.getValue()) > 0) //good (value is less than temp)
      {
            return valsLess(t.getLeft(),obj) && valsLess(t.getRight(),obj);  
		} 
     return false; //bad

   
   	}
   	public boolean isBST()
   	{
   		return isBSTHelper(root);
   	}
   
   	private boolean isBSTHelper(TreeNode t)
   	{
      //if everything left is less
      //if everything right is greater
      //if everything less is binary
      //if everything right is binary
      if(t == null)
         return true;
      Comparable temp = (Comparable)(t.getValue());
      return valsLess(t.getLeft(), temp) && valsGreater(t.getRight(), temp) && isBSTHelper(t.getLeft()) && isBSTHelper(t.getRight());
       
       }
      7
   
   
   	public void AddSiblings(Object o)
   	{
   		AddSiblings(root, o);
   	}
   	
   	private void AddSiblings(TreeNode t, Object o)
   	{
         if(t == null)
         {
            return;
         }
         TreeNode a = new TreeNode(o, null,null);
         if(t.getLeft() == null && t.getRight() != null)
              t.setLeft(a);
          //  t = t.getRight();
                    
         if(t.getRight() == null && t.getLeft() != null)
             t.setRight(a);
         AddSiblings(t.getRight(), o);
         AddSiblings(t.getLeft(), o);
             
                          		
   	}
      
	public boolean isFull()
	{
		return isFullHelper(root);
	}
	
	public boolean isFullHelper(TreeNode t)
	{
   
   if(t == null)
   {
      return true;
   }
   
   return heightHelper(t.getLeft()) == heightHelper(t.getRight()) && isFullHelper(t.getLeft()) && isFullHelper(t.getRight());   

	
   }
	public void levelInsert(Object o)
	{
		if (root == null) 
			root = new TreeNode(o, null, null);
		else 
			root = levelInsertHelper(o, root);
	}
	
	public TreeNode levelInsertHelper(Object o, TreeNode root)
	{
   if(root == null)
      return new TreeNode(o,null,null);
      
      root.setLeft(levelInsertHelper(o,root.getLeft()));
      root.setRight(levelInsertHelper(o,root.getRight()));
      
   return root;
	}

	public static void main(String args[]) {
		
		Tree t = new Tree();
		int num;
//		Random r = new Random();
//		System.out.println("Original Values: ");
		for (int i = 0; i < 3; i++) {

// ***code to fill with random values
//			num = r.nextInt() % 100;
//			System.out.print(num + " ");

// *** code to enter values from keyboard			
			num = Keyboard.readInt();

			t.insert(new Integer(num));  // use wrapper
		}
      t.PrintTree();  //
      System.out.println("Level Insert Tree");
      t.levelInsert(42);
      if(t.isBST())
         System.out.println("tree is binary");
         
         
      t.AddSiblings(new Integer("6"));
      t.PrintTree();  //
        if(t.isBST())
         System.out.println("tree is binary");
         
/*
   
		System.out.println();
		System.out.println();
		t.PrintTree();  // will not work without Height correct
		System.out.println("Tree in order: ");
		t.printInOrder();
      System.out.println("Tree in preOrder: ");
		t.printPreOrder();
      System.out.println("Tree in postOrder: ");
		t.printPostOrder();
		System.out.println("Tree size: " + t.size());
      System.out.println("Tree height: " + t.height());
  */    
}				

}