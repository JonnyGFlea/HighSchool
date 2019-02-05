import cs1.*;
/*
   Jonathan Rittmayer

   LAB 3 PART 3 
*/
public class Lab3p3 {
	
	public static void main(String args[])
	{
		int num,sum,dum;
		sum= 0;
		num = 0;
		
		System.out.println("Enter a number between 1 and " + Integer.MAX_VALUE);
		num = Keyboard.readInt();
		dum = num;
		
		while (num > 0)
	
		{
								// instead of printing num%10 here you will want to accumulate it into a sum variable
	 		sum = sum + num%10;
	 		num = num/10;
		
		
		}
		
		System.out.println("The sum of " + dum + " = " + sum);
	}
}	
