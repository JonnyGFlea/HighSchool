public class LinkListTester
{
	public static void main (String args[])
	{
		LinkList list = new LinkList();
		
		String item;
 		EasyReader console = new EasyReader();

		System.out.println("delete empty");				
		list.remove("a");
		System.out.println(list);
				
		System.out.println("add in order empty");				
		list.addInOrder("a");
		System.out.println(list);
		
		System.out.println("delete non-existent one node list");				
		list.remove("b");
		System.out.println(list);
		
		System.out.println("delete one node list");				
		list.remove("a");
		System.out.println(list);
						
		System.out.println("add to back empty");				
		list.addToBack("d");
		System.out.println(list);
		
		System.out.println("add to back one node");				
		list.addToBack("m");
		System.out.println(list);
      
      System.out.println("add in order front");				
		list.addInOrder("a");
		System.out.println(list);
      
      System.out.println("add in order middle");				
		list.addInOrder("g");
		System.out.println(list);
      
      System.out.println("add in order end");				
		list.addInOrder("z");
		System.out.println(list);

      System.out.println("delete front list");				
		list.remove("a");
		System.out.println(list);
      
      System.out.println("delete middle list");				
		list.remove("g");
		System.out.println(list);
      
      System.out.println("delete end list");				
		list.remove("z");
		System.out.println(list);

      System.out.println("delete non-existent multi-node list");				
		list.remove("z");
		System.out.println(list);

      System.out.println("add to back multi-node list");				
		list.addToBack("x");
		System.out.println(list);
	}		
}
