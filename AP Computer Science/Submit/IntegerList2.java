import cs1.Keyboard;
import java.util.ArrayList;
import java.util.List;

public class IntegerList2{

    private List<Integer> theList; //values in the list

    public IntegerList2()
    {
	theList = new ArrayList<Integer>();
    }
    
	public void fill()
	{   

		int num; 
    	for (int i = 0; i < 10; i++)
		{
			num = (int)(Math.random()*100);
			theList.add(num);
		}
	}	

	//-------------------------------------------------------
	//   Calculates and returns sum
	//-------------------------------------------------------
	public int sum()
	{
		int sumvals = 0;
		for (int i = 0; i < theList.size(); i++)
			sumvals += theList.get(i);
		return sumvals;				
	}
	
	//-------------------------------------------------------
	//   Calculates and returns maximum value
	//-------------------------------------------------------
	public int max()
	{ //more code here
		int maxvals = theList.get(0);
		for(int k = 0; k < theList.size(); k++)
		{
			if (maxvals < theList.get(k)) 
			maxvals = theList.get(k);
		}
		return maxvals;
	}
	
	//-------------------------------------------------------
	//   Calculates and returns minimum value
	//-------------------------------------------------------
	public int min()
	{	//more code here
		int minvals = theList.get(0);
		for(int w = 0; w < theList.size(); w++)
		{
			if (minvals > theList.get(w)) 
			minvals = theList.get(w);
		}
		return minvals;		
	}


    //-------------------------------------------------------
    //return the index of the first occurrence of target in the list.
    //return -1 if target does not appear in the list
    //-------------------------------------------------------
    public int search(int target)
    {   //more code 
    	for (int i = 0; i < theList.size(); i++)
			if (target == theList.get(i))
				return i;
		return -1;

    }
    public String toString()
    {
    	return theList.toString();  //ArrayList has a toString method
    }
	public static void main (String args[])
	{
		IntegerList2 intlist = new IntegerList2();
		int num;
		//fill with random values
		intlist.fill();
		
		System.out.println(intlist);
		System.out.println("Sum: "+intlist.sum());
		System.out.println("Max: "+intlist.max());
		System.out.println("Min: "+intlist.min());
	}	
}
