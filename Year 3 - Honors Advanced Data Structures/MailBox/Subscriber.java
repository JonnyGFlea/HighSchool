import java.util.*;

public class Subscriber
{
	private String name;
	private Queue<Message> mailbox;

	public Subscriber (String n)
	{
   name = n;
   mailbox = new LinkedList<Message>();
   }
	
	public String getName()
	{
		return name;
	}
	
	public void receiveMessage(Message mess)
	{
      mailbox.add(mess);   // stores message in mailbox
	}
	
	public String readMail()
	{



String total = "Mailbox Empty"; 

   if(mailbox.peek() != null)
   {
      total = "";
      total += mailbox.peek(); //  returns string form of oldest message
   }  
   return total; //  or 'Mailbox empty' if no messages


	}
	
	
}	 