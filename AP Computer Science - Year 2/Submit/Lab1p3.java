/*
   Jonathan Rittmayer

   LAB 1 PART 3 
*/
import cs1.*;
public class Lab1p3 
{
	
	public static void main(String args[])
	{

		int howMany,sum;
		sum = 1;
		System.out.println("Enter the value for a: " + howMany);
		howMany = Keyboard.readInt();
		for (int i = 1; i <=howMany; i++)
		sum =sum * i;
			System.out.println(sum);	
		
	}
}	
