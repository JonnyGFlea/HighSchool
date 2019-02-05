import cs1.*;
  /**
   *  Purpose: First example of a Java program
   */
class Example1 {
	
	public static void main(String args[])
	{
		
		int i, sum, num;

		// Initialize value of sum

		sum = 0;

		for (i=1; i<=5; i++)
		{
			System.out.print("Enter a number : ");
			num = Keyboard.readInt();

			sum = sum + num;

		}

		System.out.println("The Sum is : " + sum);	
	
	}
}	
