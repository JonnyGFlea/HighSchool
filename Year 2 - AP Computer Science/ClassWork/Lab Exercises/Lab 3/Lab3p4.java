import cs1.*;
/*
   Jonathan Rittmayer

   LAB 3 PART 4 
*/
public class Lab3p4 
{
	
	public static void main(String args[])
	{
		String bin = "";
		int num,curr;
		num = 0;
		curr = 0;
		
		System.out.print("Enter a number ");
		num = Keyboard.readInt();
		
		num = num + curr;
		System.out.print("Your Binary is ");
		while (num > 0)
		{
			
			curr = num%2;
			num = num/2;
			bin = curr + bin;
					
			
			
		
		}	
		
			System.out.println(bin);
	}
}	
