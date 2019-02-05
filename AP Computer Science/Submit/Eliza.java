
public class Eliza
{
	public static String openingComment()
	{ // return a pleasant greeting
		return "Hello friend";
	}

	public static String youAreReply(String original)
	{
		// return "What makes you think I am" followed
		//       by ALL of the characters that follow "you are"
		int loc = original.indexOf("you are ");
		return "What makes you think I am" + original.substring(loc + 7);
	}	
	
	public static String iAmReply(String original)
	{  
	   // return "I am sorry to hear you are " followed by
	   //        ALL of the characters that follow "i am"
	   	int loc = original.indexOf("i am ");
		return "I am sorry to hear you are" + original.substring(loc + 4);

	}
	
	public static String youMeReply(String original)
	{
		// return "Why do you think I " + <bleep> + " you"
		
		// <bleep> should be all the text between
		//        "you" and "me" in the original String
		int loc = original.indexOf("you");
		int loc1 = original.indexOf("me");
		
		return "Why do you think I " + original.substring(loc + 4, loc1) + "you";


	}
	
	public static String myMeReply(String original)
	{
		// return "Tell me about your " + <singleword>
		
		// <singleword> is the ONE word following "my"
		int loc = original.indexOf("my");
		String temp = original.substring(loc + 3);
		int spaceloc = temp.indexOf(" ");        
		return "tell me more about your " + temp.substring(0,spaceloc);


	}
	
			
		
	public static void main(String[] args)
	{
	
		EasyReader console = new EasyReader();
		String sent,resp="";
		int iamFind;
		System.out.println(Eliza.openingComment());
		do{
			sent = console.readLine();
			sent = sent.toLowerCase();
			sent = " " + sent + " ";
			
			if (sent.indexOf(" you are ") != -1)
				System.out.println(Eliza.youAreReply(sent));
			else if (sent.indexOf(" i am ") != -1)
				System.out.println(Eliza.iAmReply(sent));
			else if(sent.indexOf(" you ") != -1 &&
					sent.indexOf(" me ") != -1 &&
					sent.indexOf(" you ")<sent.indexOf(" me "))
				System.out.println(Eliza.youMeReply(sent));
			else if(sent.indexOf(" my ") != -1 &&
					sent.indexOf(" me ") != -1 &&
					sent.indexOf(" my ")<sent.indexOf(" me "))
				System.out.println(Eliza.myMeReply(sent));
			else
				if ( !sent.equals(" bye ") )				
					System.out.println("tell me more");
			}
		while (!sent.equals(" bye "));
		
		System.out.println("See you later!");		
		
	}
}
