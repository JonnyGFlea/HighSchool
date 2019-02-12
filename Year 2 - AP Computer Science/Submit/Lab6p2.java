import cs1.Keyboard;
 
public class Lab6p2
{
    public static void main(String[] args)
    {
	int numItems, num, n;
	num = 0;
	n = 0;
	int[] list1, list2;            // you will want TWO lists
	
	System.out.print("How many items? ");    //using print instead println allows person to enter value
	                                        // on same line
	numItems = Keyboard.readInt();
	

	list1 = new int[numItems]; // now you can USE this value to give your arrays a size
	list2 = new int[numItems];
	
	
	
	
   	 if (numItems > 0)
   	 	for(int i = 1; i <= numItems; i++) // You need to loop and prompt the person to enter the items for list1.
   	 	{
   	 		System.out.print("Enter list 1, item "+i+" : ");
   	 		list1[i-1] = Keyboard.readInt();	//Use Keyboard.readInt() to enter the items
   		 }
   		 for(int i = 1; i <= numItems; i++) // You will need ANOTHER loop to enter the items for list2.
   	 	{
   	 		System.out.print("Enter list 2, item "+i+" : ");
   	 		list2[i-1] = Keyboard.readInt();
   		 }
	 	 for(int i = 0; i<list1.length; i++)	 // You will need ANOTHER loop to create the sums.  OUTPUT MUST BE AS SHOWN ON LAB.
	 	 {
		 	 num = list1[i]+list2[i];
		 	 System.out.print(list1[i]);
		 	 System.out.print(" + ");
		 	 System.out.print(list2[i]);
		 	 System.out.print(" = ");
		 	 System.out.println(num);
		 	
		 }
	}
}