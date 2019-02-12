import java.util.ArrayList;
import java.util.List;

public class ArrayListExample{
	
	public static void main (String args[])
	{
		// ArrayList implements the List interface
		List<String> list = new ArrayList<String>();
		
		String item;
		int pos;
		
 		EasyReader console = new EasyReader();
		
		int choice;
		do{		
		System.out.println("Enter choice:");
		System.out.println("1. Add item to list");
		System.out.println("2. Insert item in list");
		System.out.println("3. Delete item from speciific position");
		System.out.println("4. Modify item in list");
		System.out.println("5. Print list");
		System.out.println("6. Print list size");
		System.out.println("7. Exit");
		
		choice = console.readInt();
		
		if (choice == 1)
		{
			System.out.print("Enter item: ");
			item = console.readWord();
			list.add(item);
		}
		if (choice == 2)
		{
			System.out.print("Enter item: ");
			item = console.readWord();
			System.out.print("Enter position: ");
			pos = console.readInt();

			list.add(pos, item); 

		}
		if (choice == 3)
		{
			System.out.print("Enter position: ");
			pos = console.readInt();

			list.remove(pos); 

		}
		if (choice == 4)
		{
			System.out.print("Enter item: ");
			item = console.readWord();
			System.out.print("Enter position: ");
			pos = console.readInt();

			list.set(pos, item); 

		}
		if (choice == 5)
		{
			System.out.println("The list contains : " + list);
		}
		if (choice == 6)
		{
			System.out.println("The size of the list is : " + list.size());
		}
								
		}
		while (choice != 7);
		

}		
}
		