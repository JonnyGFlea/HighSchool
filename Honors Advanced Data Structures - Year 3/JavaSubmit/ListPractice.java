import java.util.*;

public class ListPractice
{
	public static int sum(List<Integer> a)
	{
      Iterator i = a.iterator();
      int sumNum = 0;
      while(i.hasNext())
      {
            sumNum += ((Integer)i.next());
	   }
      return sumNum;
	}
	public static Comparable findMax(List<Integer> a)
	{
		// precondition: a is non-empty
      Iterator i = a.iterator();
      int maxNum = ((Integer)i.next());
      
      while(i.hasNext())
      {
         int next = ((Integer)i.next());
         if(maxNum <= next)
         {
            maxNum = next;
	      }
      }
      return maxNum;
   }
	
	public static void main(String[] args)
	{
		List<Integer> test = new LinkedList<Integer>();
		Random randGen = new Random();
		
		for (int i = 0; i < 5; i++)
		{
			int num = (int)(Math.random() * 9) + 1;
			test.add ( num );
		}
		System.out.println(test);
		System.out.println("Sum is: " + sum(test)); 		
		System.out.println("Max is: " + findMax(test)); 
	}
	
}