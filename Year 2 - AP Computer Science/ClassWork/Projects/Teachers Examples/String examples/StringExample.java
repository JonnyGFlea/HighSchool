public class StringExample{

public static void main(String[] args)
{	
	String s="",t="";
	
	s = "abcde";
	System.out.println("s : " + s);
	
	// substring is an OVERLOADED method in the string class
	// there are two versions which differ in the NUMBER of arguments
	// the folllowing line takes the portion of the string starting at
	// location 2 (strings are indexed starting with 0) and up to but
	// not including location 3
	
	System.out.println("s.substring(2,3): "+ s.substring(2,3));
	
	// the following line takes the portion of the string starting at
	// location 3 and takes the rest of the string
	System.out.println("s.substring(3): "+s.substring(3));
	
	// indexOf returns the starting location of the string "cd" in the
	// string s
	System.out.println("the index of \"cd\" in \"abcde\" is "+s.indexOf("cd"));
	
	// standard way to loop through a string, looking at one character at a time
	for (int i = 0; i < s.length(); i++)
	{
		t += s.substring(i,i+1);
		// prints each character on separate line
		System.out.println(s.substring(i,i+1));
	}	
		
	System.out.println(" s = " + s + " t = " + t);
	
	// demonstration of NOT being able to use == to check for equality of strings
	if (s == t) System.out.println("s equals t");
	
	if (s.equals(t)) System.out.println("s really = t");
}	
}	