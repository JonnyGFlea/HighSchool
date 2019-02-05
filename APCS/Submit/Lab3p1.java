/*
   Jonathan Rittmayer

   LAB 3 PART 1 
*/
import cs1.*;
public class Lab3p1 {
	public static void main(String args[])
	{
		int num;
		System.out.print("Enter a five digit number! ");
		num = Keyboard.readInt(); 
		for(int i = 1; i <= 5; i++)
		
		{
		
		System.out.print(num%10);	// try printing num%10 here...the mod operator (%) finds the remainder, 
                // is the remainder when num is divided by 10, which will always result in the ONES digit

 		num = num / 10; //divide the number entered by 10, this will perform integer division, dropping the decimal portion
	

		}
	}
}	
