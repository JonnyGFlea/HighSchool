import cs1.*;
  /**
   *  Purpose: Demonstrate if statement
   */
public class Example2 {
	
	public static void main(String args[])
	{
		
		int evenCount, num;  // declare variables

		evenCount = 0;   // Initialize value of counter

		for (int i=1; i<=5; i++)
		{
			System.out.print("Enter a number : ");
			num = Keyboard.readInt();

			if ( num%2 == 0)
				evenCount += 1;    // same as evenCount = evenCount + 1;
				                   // same as evenCount++;

		}

		System.out.println("The number of even numbers entered is : " + evenCount);	
	
	}
}	
