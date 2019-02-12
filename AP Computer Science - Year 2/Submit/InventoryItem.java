//***************************************\\
//			Jonathan Rittmayer 			 \\
//					P2					 \\
//		   InventoryItem.java			 \\
//										 \\	
//										 \\
//***************************************\\

public class InventoryItem
{
	
	//create three pieces of instance data
	//(description, price, quantity)
	private String name;
	private double price;
	private int quantity;
	
	//Include three constructors for your class
	public InventoryItem(String d, double p,int q)
	{
		name = d;
		price = p;
		quantity = q;
	}
	//You need to provide three accessor methods:
	//getDesc and getPrice and getQty.
	public String getName()
	{
		return name;
	}
	public int getQty()
	{
		return quantity;
	}
	public double getPrice()
	{
		return price;
	}
	//Make a modifier method to cause quantity to decrease for outgoing shipments

	public void decreaseQuantity(int minus)
	{
		quantity -= minus;
	}
	//Make a modifier method to cause quantity to increase for incoming shipments

	public void increaseQuantity(int plus)
	{
		quantity += plus;
	}
	//Provide a toString method for your Inventory class.
	public String toString()
	{
		return "Item: " + name + "\t Quantity: " + quantity + "\t Price: " + price;
	}
}