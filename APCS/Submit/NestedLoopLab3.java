import cs1.*;
public class NestedLoopLab3
{
	public static void main(String[] args)
	{
		int num1, num2;
		System.out.print("How many lines of stars? ");
		num1 = Keyboard.readInt();
		System.out.print("How many stars per line? ");
		num2 = Keyboard.readInt();
		for (int outer = 1; outer <= num1; outer++)
		{
			for(int inner = 1; inner <= num2; inner++) 
			{
				System.out.print("*");
			}
			System.out.println();                  
		}
	}
}

