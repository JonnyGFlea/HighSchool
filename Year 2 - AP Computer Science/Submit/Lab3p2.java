/*
   Jonathan Rittmayer

   LAB 3 PART 2 
*/
public class Lab3p2 
{
	
	public static void main(String args[])
	{
		int num1,neg,zero,even;
		neg = 0;
		zero = 0;
		even = 0;
		double num2;
		System.out.println("Five random numbers shall now appear");
		
		for(int i = 1; i <=5; i++) 
		{
		
		num2 = Math.random();
		
		num1 = (int)(Math.random()*20)-10;
		System.out.println(num1);
		
		if(num1 < 0)
		neg+= 1;
	
		if(num1 == 0)
		zero+= 1;
		
		if(num1%2 == 0)
		even+= 1;
	}
		
	System.out.println("The number of negatives = " + neg);
	System.out.println("The number of evens = " + even);
	System.out.println("The number of zeros = " + zero);	
	}
}	
