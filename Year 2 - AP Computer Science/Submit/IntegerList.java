
// ****************************************************************
// IntegerList.java
//
// Define an IntegerList class with methods to create, fill,
// sort, and search in a list of integers.
//          
// ****************************************************************

import cs1.Keyboard;

public class IntegerList{
	 

    private int[] list; //values in the list
	private int size;   //number of values that have been used
    //-------------------------------------------------------
    //create a list of the given size
    //-------------------------------------------------------
    public IntegerList(int size)
    {
	list = new int[size];
	this.size = 0;	
		
    }
	//-------------------------------------------------------
	//   returns size
	//-------------------------------------------------------
	public int size()
	{
		return size;
	}
	//-------------------------------------------------------
	//insert a value at end 
	//-------------------------------------------------------
	public void add(int value)
	{
		list[size]=value;
		size = size + 1;
	}
    public int get(int loc)
    { 
    	return list[loc];
    }	

			
    //-------------------------------------------------------
    //return the index of the first occurrence of target in the list.
    //return -1 if target does not appear in the list
    //-------------------------------------------------------
    public int search(int target)
    {
	for(int k = 0; k < list.length; k++)
		if(target == list[k])
			return k;
	
		return -1;
    }
    
    // makes a stringized form of the list
    public String toString()
    {
    	String retVal = "";
    	for (int i =0; i<size; i++)
    		retVal+=i +":\t" + list[i] + "\n";	
    	
    	return retVal;
	}
	
	// OVERLOADED add method 
    public void add(int loc, int item)
    {
      for(int w = size; w > loc; w--)//Start at last item of list, loop to requested location
      	{
      	//if(loc == item)
      	list[w] = list[w-1];	//Make current list item equal to previous list item
		}
	  list[loc]=item;	//insert item at correct position	
	  size++;  		    //Increase size of list by one
		
			
    }
    
    
	
	 	
      public boolean remove(int item)
    {
    	int rem = search(item); //be sure to invoke search
    if (search(item) != -1)  
    	{
    	for(int p = rem; p < size; p++)
 			list[p] = list[p+1]; //remove item from list shifting all items up
	    size--; //decrements size, returns false if item is not in list, true otherwise
	 	return true;
	 	}
    else
    	return false; 	
   	}
   
    	
    	
    

}
