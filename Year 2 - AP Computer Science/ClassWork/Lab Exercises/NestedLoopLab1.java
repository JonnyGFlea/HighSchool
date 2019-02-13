public class NestedLoopLab1
{
	public static void main(String[] args)
	{
		int outerCount = 0;
		int innerCount = 0;
		int totalCount = 0;
		
		for (int outer = 1; outer <= 3; outer++)
		{
			outerCount++;
			innerCount = 0;  //reset innerCount
			for(int inner = 1; inner < 8; inner++) 
			{
				innerCount++;
				totalCount++;
			}
			                   
		}
		System.out.println("The outer loop executes " + outerCount + " times");
		System.out.println("Each time the outer loop executes, the inner loop "+
			                   "executes " + innerCount + " times");
		System.out.println("Therefore, the total number of times the inner loop "+
							"executes is "+totalCount + " times");
	}
}