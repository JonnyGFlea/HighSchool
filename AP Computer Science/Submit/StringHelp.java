public class StringHelp
{
	public static void main(String[] args)
	{
		
		String tester = "this is a sample sentence for illustration";
		//index values   0123456789..........          
		//each character in the string is numbered with an index
		
		int loc = tester.indexOf("sample"); //loc will be the index of the where the 
		                                    // word "sample" starts in the String
		                                    
		System.out.println(loc);
		
		String part = tester.substring(loc + 3);
		
		System.out.println(part);
		
		int spaceloc = tester.indexOf(" ");
		
		System.out.println(spaceloc);
		
		System.out.println("sentence AFTER first space:"+tester.substring(spaceloc+1) );
		
		System.out.println("first word in sentence:"+tester.substring(0,spaceloc) );
	}
}                                    