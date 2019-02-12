import java.util.ArrayList;
import java.util.List;

public class Inventory 
{
	private List<InventoryItem> items;
	
	public Inventory()
	{
		items = new ArrayList<InventoryItem>();
	}
	public InventoryItem findItem(String itemName)
	{
		// find InventoryItem with name itemName - returns InventoryItem
		//                    or null if not found
		
			for (int k = 0; k < items.size(); k++)
				if (itemName.equals(items.get(k).getName()))		
					return items.get(k);		
			return null;						
	}
	
	public void inventoryMenu()
	{		
		String itemName;
		double itemPrice;
		int itemQuantity;
		
		EasyReader console = new EasyReader();
		
		int choice;
		do{
					
		System.out.println("Enter choice:");
		System.out.println("1. Add item to inventory");
		System.out.println("2. Process a shipment");
		System.out.println("3. Sell items");
		System.out.println("4. Print inventory");
		System.out.println("5. Exit");
		
		choice = console.readInt();
		
		if (choice == 1)
		{
			System.out.print("Enter item description: ");
			itemName = console.readWord();
			System.out.print("Enter item price: ");
			itemPrice = console.readDouble();
			System.out.print("Enter item quantity: ");
			itemQuantity = console.readInt();
			//more code here (Complete the menu choice #1)
			InventoryItem obj = new InventoryItem(itemName, itemPrice, itemQuantity);//invoke the constructor of your InventoryItem class,
			items.add(obj);	//put your newly created InventoryItem object into your inventory (stored in an ArrayList)
		}
		if (choice == 2)
		{
			System.out.print("Enter item description: ");
			itemName = console.readWord();
			System.out.print("How many more were received? ");
			int more = console.readInt(); // more code here
			InventoryItem obj = findItem(itemName); //invoked findItem
			if(obj != null)
				obj.increaseQuantity(more);
			else
				System.out.println("None of that Item was found in our Inventory list, so we decided to cancel the shipment!");				
		}
								
		if (choice == 3)
		{
			System.out.print("Enter item description: ");
			itemName = console.readWord();
			System.out.print("How many were sold? ");
			int sold = console.readInt(); // more code here
			InventoryItem obj = findItem(itemName); //invoked findItem
			if(obj != null)
				obj.decreaseQuantity(sold);
			else
				System.out.println("None of that Item was found in our Inventory list, so we had to cancel your order");			
		}
		if (choice == 4)
		{ // more code here ( Complete menu choice #4 )
			System.out.println("\nInventory List\n----------------------------------------------");
				for(int k = 0; k <items.size(); k++)
				 	System.out.println(items.get(k));	
		// check that you are correctly creating and adding items to your inventory

		}
								
		}
		while (choice != 5);

		
	}
	public static void main(String[] args)
	{
		Inventory theInventory = new Inventory();
		theInventory.inventoryMenu();
	}	
		

}