	import cs1.*;
	public class TreeTester3
	{
	
	public static void main(String args[]) {
		
		Tree t = new Tree();

			t.levelInsert(new Integer(20));  
			t.levelInsert(new Integer(10));   
			t.levelInsert(new Integer(30));   
			t.levelInsert(new Integer(5));   
			t.levelInsert(new Integer(50));   
			t.PrintTree();
		
		System.out.println(" is BST " + t.isBST());
		
		System.out.println(" is Full " +t.isFull());
		
		t = new Tree();


			t.levelInsert(new Integer(20));   
			t.levelInsert(new Integer(18));   
			t.levelInsert(new Integer(30));   
			t.levelInsert(new Integer(10));   
			t.levelInsert(new Integer(19));   
			t.PrintTree();
		System.out.println(" is BST " + t.isBST());
		
		System.out.println(" is Full " +t.isFull());
		t.levelInsert(new Integer(21));   
		t.levelInsert(new Integer(25));   
		t.PrintTree();
		System.out.println(" is BST " + t.isBST());		
		System.out.println(" is Full " +t.isFull());
		
		TreeNode r = new TreeNode(30, new TreeNode(20, new TreeNode(10,null,null), new TreeNode(35,null,null) ), new TreeNode(50, new TreeNode(15,null,null),null));		
		t = new Tree(r);
		t.PrintTree();
		System.out.println(" is BST " + t.isBST());		
		System.out.println(" is Full " +t.isFull());


		r = new TreeNode(30, new TreeNode(20, new TreeNode(10,null,null), null ), new TreeNode(50,null, new TreeNode(15,null,null)) );
		t = new Tree(r);
		t.PrintTree();
		System.out.println(" is BST " + t.isBST());		
		System.out.println(" is Full " +t.isFull());

		r = new TreeNode(30, new TreeNode(20, new TreeNode(10,null,new TreeNode(15,null,null)),null), new TreeNode(50,null, new TreeNode(65,null,null)) );
		t = new Tree(r);
		t.PrintTree();
		System.out.println(" is BST " + t.isBST());		
		System.out.println(" is Full " +t.isFull());
		
		t.AddSiblings(99);
		System.out.println("After add siblings:");
		t.PrintTree();
		System.out.println(" is BST " + t.isBST());		
		System.out.println(" is Full " +t.isFull());

		
}



}