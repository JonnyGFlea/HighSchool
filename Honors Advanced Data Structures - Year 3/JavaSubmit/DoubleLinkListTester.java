public class DoubleLinkListTester
{
	public static void main (String args[])
	{
		DoubleLinkList list = new DoubleLinkList();
		
		String item;
 		EasyReader console = new EasyReader();

		System.out.println("delete empty");				
		list.deleteItem("a");
		System.out.print("forwards: " + list + "\nbackwards: ");
		list.printBackwards();		
		System.out.println();

		System.out.println("delete front empty");				
		list.deleteFromFront();
		System.out.print("forwards: " + list + "\nbackwards: ");
		list.printBackwards();		
		System.out.println();

		System.out.println("delete back empty");				
		list.deleteFromBack();
		System.out.print("forwards: " + list + "\nbackwards: ");
		list.printBackwards();		
		System.out.println();
			
		System.out.println("add to front of empty list");	
		list.addToFront("b"); //add to front of empty list
		System.out.print("forwards: " + list + "\nbackwards: ");
		list.printBackwards();		
		System.out.println();
		
		System.out.println("delete from front one node list");	
		list.deleteFromFront();
		System.out.print("forwards: " + list + "\nbackwards: ");
		list.printBackwards();		
		System.out.println();

		System.out.println("add to back of empty list");	
		list.addToBack("t"); //add to front of empty list
		System.out.print("forwards: " + list + "\nbackwards: ");
		list.printBackwards();		
		System.out.println();

		System.out.println("delete from back one node list");	
		list.deleteFromBack();
		System.out.print("forwards: " + list + "\nbackwards: ");
		list.printBackwards();		
		System.out.println();

		System.out.println("add in order empty list");			
		list.addInOrder("a");
		System.out.print("forwards: " + list + "\nbackwards: ");
		list.printBackwards();		
		System.out.println();

		System.out.println("delete item from one node list");				
		list.deleteItem("a");
		System.out.print("forwards: " + list + "\nbackwards: ");
		list.printBackwards();		
		System.out.println();

		System.out.println("add to front of empty list");	
		list.addToFront("v"); //add to front of empty list
		System.out.print("forwards: " + list + "\nbackwards: ");
		list.printBackwards();		
		System.out.println();
		
		System.out.println("add to front one node list");	
		list.addToFront("c"); //add to front of nonempty list
		System.out.print("forwards: " + list + "\nbackwards: ");
		list.printBackwards();		
		System.out.println();

		System.out.println("delete non-existent non-empty list");				
		list.deleteItem("m");
		System.out.print("forwards: " + list + "\nbackwards: ");
		list.printBackwards();		
		System.out.println();
		
		System.out.println("delete from front two node list");	
		list.deleteFromFront();
		System.out.print("forwards: " + list + "\nbackwards: ");
		list.printBackwards();		
		System.out.println();

		System.out.println("delete from back one node list");	
		list.deleteFromBack();
		System.out.print("forwards: " + list + "\nbackwards: ");
		list.printBackwards();		
		System.out.println();

		System.out.println("add to back of empty list");	
		list.addToBack("t"); //add to front of empty list
		System.out.print("forwards: " + list + "\nbackwards: ");
		list.printBackwards();		
		System.out.println();

		System.out.println("add to back one node list");			
		list.addToBack("v");
		System.out.print("forwards: " + list + "\nbackwards: ");
		list.printBackwards();		
		System.out.println();

		System.out.println("delete from two-item list");				
		list.deleteItem("v");
		System.out.print("forwards: " + list + "\nbackwards: ");
		list.printBackwards();		
		System.out.println();
		
		System.out.println("add in order front");			
		list.addInOrder("a");
		System.out.print("forwards: " + list + "\nbackwards: ");
		list.printBackwards();		
		System.out.println();

		System.out.println("add in order back");			
		list.addInOrder("z");
		System.out.print("forwards: " + list + "\nbackwards: ");
		list.printBackwards();		
		System.out.println();
		
		System.out.println("add in order middle");			
		list.addInOrder("m");
		System.out.print("forwards: " + list + "\nbackwards: ");
		list.printBackwards();		
		System.out.println();
		
		System.out.println("delete non-existent multi-node list");				
		list.deleteItem("e");
		System.out.print("forwards: " + list + "\nbackwards: ");
		list.printBackwards();		
		System.out.println();
	
		System.out.println("delete middle");				
		list.deleteItem("m");
		System.out.print("forwards: " + list + "\nbackwards: ");
		list.printBackwards();		
		System.out.println();
	
		System.out.println("delete end");				
		list.deleteItem("z");
		System.out.print("forwards: " + list + "\nbackwards: ");
		list.printBackwards();		
		System.out.println();

		System.out.println("delete front");				
		list.deleteItem("a");
		System.out.print("forwards: " + list + "\nbackwards: ");
		list.printBackwards();		
		System.out.println();

	}		
}
