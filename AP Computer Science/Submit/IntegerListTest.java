// ****************************************************************
// IntegerListTest.java
//
// Provide a menu-driven tester for the IntegerList class.
//          
// ****************************************************************
import cs1.Keyboard;
public class IntegerListTest{

    //-------------------------------------------------------
    // Create a list, then repeatedly print the menu and do what the
    // user asks until they quit
    //-------------------------------------------------------
    public static void main(String[] args)
    {
    	int choice,loc,val;
    	IntegerList list;
    	list = new IntegerList(100);  //create a new list with 100 spots
    	
		do
		{
				System.out.println("\n   Menu   ");
				System.out.println("   ====");
				System.out.println("0: Quit");
				System.out.println("1: Add element to end of list");
				System.out.println("2: Find an element in the list using sequential search");
				System.out.println("3: Print the list");
				System.out.println("4: Add a new value to the list at a specified location");
				System.out.println("5: Remove an item from the list");
				System.out.print("\nEnter your choice: ");

	 			choice = Keyboard.readInt();
	 			
	 			switch(choice)
				{
					    case 0: 
						System.out.println("Bye!");
						break;
					    case 1:
						System.out.print("Enter new value: ");
						val = Keyboard.readInt();
						list.add(val);
						break;
					    case 2:
						System.out.print("Enter the value to look for: ");
						val = Keyboard.readInt();
						loc = list.search(val);
						if (loc != -1)
						    System.out.println("Found at location " + loc);
						else
						    System.out.println("Not in list");
						break;
					    case 3:
						System.out.println(list);//invokes the toString method
						break;
						case 4:
						System.out.print("Enter a new value: ");
						val=Keyboard.readInt();
						System.out.print("Enter its location: ");
						loc = Keyboard.readInt();
						list.add(loc, val);
						break;
						case 5:
						System.out.print("Enter a value that you would like to remove: ");
						val = Keyboard.readInt();
						boolean success= list.remove(val);
						if (success)
							System.out.println("Your value has been removed successfully!");
						else
							System.out.println("Your value does not exist!"); 
					
						break;
						
					    default:
						System.out.println("Sorry, invalid choice");
	    	}
	 	}
		while (choice != 0);
    }


}
