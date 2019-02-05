public class Lab6p3
{
	public static void main(String[] args)
	{
		/*  DO NOT CHANGE THE MAIN METHOD EXCEPT FOR TESTING PURPOSES!
		 *  All your thinking should happen in the reverse method
		 */
		
		Lab6p3 program = new Lab6p3();
		
		int i;
		int theValues[] = new int[6];
		theValues[0] = 1;
		theValues[1] = 2;
		theValues[2] = 4;
		theValues[3] = 5;
		theValues[4] = 6;
		theValues[5] = 8;
		
		for (i = 0; i < theValues.length; i++)
			System.out.print(theValues[i]+"   ");
		System.out.println();
		
		program.reverse(theValues);

		for (i = 0; i < theValues.length; i++)
			System.out.print(theValues[i]+"   ");
		System.out.println();
		
		
					
		
	}
	
	
	// Method name: reverse
	// Gets one parameter: a which contains an array of integers
	// Your objective:  When the code returns to the main method, the contents of a should be REVERSED
	public void reverse(int[] a)
	{
		int max, temp;
		max = a.length-1;
		
		
 		for(int i = 0; i < a.length/2; i++)
 		{
		temp = a[i];
		a[i] = a[max];
		a[max] = temp;
		max--;
		}
	// more code needed here!!				
			
	}

}
