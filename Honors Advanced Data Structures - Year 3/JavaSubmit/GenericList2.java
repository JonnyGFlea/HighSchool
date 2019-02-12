import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class GenericList2{
	
	private List<Integer> myList;
	
	public GenericList2()
	{
		myList = new LinkedList<Integer>();
	}
	
	public void fill(int numitems){
		for (int i = 0; i < numitems; i++)
			myList.add( (int)(Math.random()*100)-50 ); 
	}
	
	public String toString()
	{
		String retval = "";
		Iterator i = myList.iterator();
		while (i.hasNext())
			retval += "====>" + i.next();
		
		return retval;	
	}
	
	public void removeNegs1()
	{
		Iterator i = myList.iterator();
		while (i.hasNext())
			if (((Integer)i.next()).intValue() < 0)
				i.remove();
				
	}
	public void removeNegs2()
	{
		int j = 0;
		while (j < myList.size())
			if (myList.get(j) < 0)
				myList.remove(j);
			else
				j++;	
				
	}

	public static void main (String args[])
	{
		GenericList2 list = new GenericList2();

		list.fill(100000);  
		System.out.println("Generated List");
		list.removeNegs1();
		System.out.println("remove negs iterator");

		list.fill(100000);  
		System.out.println("Generated List");
		list.removeNegs2();
		System.out.println("remove negs no iterator");


	}		
}
		