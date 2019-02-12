
public class LinkListWS{


	private ListNode head;
	
	public void add(Object item){
		ListNode node = new ListNode(item,head);
		head = node;
	}
	

	public int size() 
	{
		return size(head);
	}
	
	public int size(ListNode head) //Question 10a & 10b
	{
                           //4loop\\
		//int total = 0;
      //for(ListNode curr = head; curr != null; curr = curr.getNext())
      //{
      //   total++;
      //}
      //return total;
                           //Recursion\\
      if(head!=null)
      {
         return(size(head.getNext())+1);
      } 
      return 0; 
	}
		
	public void rotate()
	{
		head = rotate(head);
	}
	
	public ListNode rotate(ListNode head)
	{
   if(head == null)
   {
      return null;
   }
   if(head.getNext() == null)
   {
         return head;
   }
   ListNode curr = head;
   ListNode temp = curr.getNext();
   
   while(curr.getNext() != null)
   {
      curr = curr.getNext();      
   }
   ListNode newTail = new ListNode(head.getValue(), null);
   curr.setNext(newTail);

   return temp;
	}			
	
	public String toString()
	{
		String result = "";
		for (ListNode curr = head; curr != null; curr = curr.getNext())
		{
			result += "--->"+curr.getValue();
		}
		result += "\n";
		return result;
	}
	

	public void makeList(String[] arr)
	{
      head = toLinkedList(arr);
	}

	public ListNode toLinkedList(String[] arr)
	{
   ListNode head = null;
   
   for(int k = arr.length-1; k >= 0; k--)
      {

         head = new ListNode(arr[k],head);
      }

   return head;
	}		
	public static void main (String args[])
	{
		LinkListWS list = new LinkListWS();
		list.add("c");
		list.add("b");
		list.add("a");
		System.out.println("original: " +list);
		list.rotate();		
		System.out.println("after rotate: "+list);
		list = new LinkListWS();		
		list.add("a");
		list.rotate();		
		System.out.println("\nOne node rotate"+list);
		list = new LinkListWS();

		list.rotate();		
		System.out.println("Empty rotate"+list);
		list = new LinkListWS();

				
 		String[] arr = {"this","is","a","test"};
		list.makeList(arr);
		System.out.println(list);
		System.out.println("Size: " + list.size() );
		


	}		
}
		