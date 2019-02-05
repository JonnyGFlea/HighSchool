public class Lab1part1Assign5
{
	public static void main(String[] args)
	{
		int sum = 0;
		
		for (int i = 1; i <= 5; i++)
		{
			System.out.println("sum = sum (which has a value "+ sum +") + i (which has a value " + i + ")" );
			sum = sum + i;	
			System.out.println("now the value of sum is " + sum);
			System.out.println();
		}	
			
	}
}