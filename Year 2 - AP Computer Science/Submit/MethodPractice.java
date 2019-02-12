public class MethodPractice
{

	public static void makeRectangle(int width, int height, String fillChar)
	
	{ // this curly brace marks the beginning of this method
	
	/*  This method should print a Rectangle using the fillChar.  The width of the
	
	    rectangle is specified by the parameter width, and the height of the rectangle
	
	    is specified by the parameter height.
	*/
		for (int j = 0; j < 5; j++)
		{
			for (int i = 0; i < width; i++)
				System.out.print(fillChar);
			System.out.println();
		}
	
	// your code here
	
	}  //this curly brace marks the end of this method
	
	public static String randomNiceComment()
	
	{
	
	/*  This will choose a random number between 1 and 4.  The value of the random number will be
	
	    tested, and a random NICE comment will be returned.
	
	*/
	
		int num = (int)(Math.random()*4);
		 
		if (num == 1)
			return "Awesome!";
		else
		if (num == 2)
			return "Good Job!";
		else
		if (num == 3)
			return "Amazing!";
		else
			return "NICE!";
		
	}
	public static void main(String[] args)
	
	{
	     // client program
	     MethodPractice.makeRectangle(6,5,"$");
	     System.out.println(MethodPractice.randomNiceComment());
	     MethodPractice.makeRectangle(3,7,"#");
	     System.out.println(MethodPractice.randomNiceComment());
	}
}		