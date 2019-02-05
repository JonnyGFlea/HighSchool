public class IntegerListGrader
{
	public static void main(String[] args)
	{
		IntegerList theList = new IntegerList(100);
		
		theList.add(11);
		theList.add(22);
		theList.add(33);
		theList.add(44);
		System.out.println("33 is at "+theList.search(33));
		System.out.println(theList);// 11,22,33,44
		theList.remove(55); // list should be unchanged
		System.out.println(theList); //11,22,33,44
		theList.remove(22); // list should contain 11,33,44
		System.out.println(theList);
		theList.add(1,15); // list should contain 11,15,33,44
		System.out.println(theList);
		theList.add(0,10); // list shoudl contain 10,11,15,33,44
		System.out.println(theList);
			
		
	}	
	
}