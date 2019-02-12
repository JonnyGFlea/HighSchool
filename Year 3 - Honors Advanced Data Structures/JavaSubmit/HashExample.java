public class HashExample
{
	private ListNode[] hashTable;
	
	public HashExample(int tableSize)
	{
		// more code here	
      hashTable = new ListNode[tableSize];	

	}
	
	public void put(String item)
	{
		// more code here
      if(item == null)
         return;   
         
         
            
                
		// compute index using hashCode method of String class
      int index = item.hashCode()%hashTable.length;
		//	remember:  this might be a negative value
		// perform approriate arithmetic operation to ensure it is in range
      index = Math.abs(index);
		
		// check if this table entry is occupied - if not use it
      //if(hashTable[index] != null)
         hashTable[index] = new ListNode(item, hashTable[index]);
		//	otherwise 'chain' this item to existing item
			
	}	
	
	public int find(String item)
	{
		if(item == null)
         return -1;
      // more code here
      int index = item.hashCode()%hashTable.length;
      index = Math.abs(index);
      ListNode hashTemp = hashTable[index];
         while(hashTemp != null)
            {
            if(((String)hashTemp.getValue()).equals(item))
            {
               return index;
            }
            hashTemp = hashTemp.getNext();
            }
         return -1;	
	}
	public String toString()
	{
   String temp = "";
      for(int s = 0; s < hashTable.length ;s++)
       {
         ListNode hashTemp = hashTable[s];
         while(hashTemp != null)
		      {
            temp += "-->" + hashTemp.getValue();
            hashTemp = hashTemp.getNext();
            }
            temp += "\n";
         }
      return temp;
	}
	
	public static void main(String[] args)
	{
		EasyReader console = new EasyReader();
		System.out.print("Enter table size: ");
		
		int size = console.readInt();
		HashExample hash = new HashExample(size);
		
		String item = "";
		while (!item.equals("end"))
		{
			System.out.print("Enter item to insert(end to exit): ");

			item = console.readWord();
			if (!item.equals("end"))
			{
				hash.put(item);
				System.out.println(hash);
			}	
		}
		item="";
		while (!item.equals("end"))
		{
			System.out.print("Enter item to find(end to exit): ");

			item = console.readWord();
			if (!item.equals("end"))
			{
				if (hash.find(item)!=-1)
					System.out.println("In Table at location "+hash.find(item));
				else
					System.out.println("Not In Table");	
			}
		}
		
			
		
	}
		
}