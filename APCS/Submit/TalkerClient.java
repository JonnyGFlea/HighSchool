public class TalkerClient
{
	public static void main(String[] args)
	{
		Talker t = new Talker("APCS is fun",5);
		//String answer = t.speak();
		//System.out.println(answer);
		//Change the main method to use your accessor method.  Be sure to test your code.
		System.out.println(t);
		
		int k = t.getrepeatFactor();
		System.out.println(k);
	}
	
	
}