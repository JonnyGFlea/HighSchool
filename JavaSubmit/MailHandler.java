import cs1.*;
import java.util.*;

public class MailHandler{

private List<Subscriber> subscribers; 

public MailHandler()
{
	subscribers = new ArrayList<Subscriber>();
}	

public Object findUser(String name)
{ 
      for(int k = 0; k < subscribers.size(); k++)
      {
         String found = subscribers.get(k).getName();// finds subscriber with given name
         if(found.equals(name))
         {
            Subscriber temp = subscribers.get(k);
            return temp;
         }
   	}
return null; // returns null if not found
}

public Object getUser(String name)
{
	Subscriber sub;
	
	sub = (Subscriber)findUser(name);
	if (sub == null)
	{
		sub = new Subscriber(name);
		subscribers.add(sub);
		System.out.println("added "+name);
	}	
	return sub;	
}
public void sendMessage(Subscriber sub)
{
	EasyReader console = new EasyReader();
   System.out.print("To: "); //Who the letter is to
   String name = Keyboard.readString();
   
   Object user = getUser(name); //adds them to subscribers if null
   Subscriber tempTwo = (Subscriber)user;  //holds onto the subscriber the mail is sent to
   
   System.out.print("Subject: ");//subject of the letter
   String subject = Keyboard.readString();
   
   System.out.print("Text: "); //body of the letter
   String text = Keyboard.readString();
   
   Message total = new Message(sub.getName(),name,subject,text); //combines the whole message
   tempTwo.receiveMessage(total); //stores the message under the correct user

}
public void processCommands(Subscriber sub)
{
	int choice;
	
	do
	{
		System.out.println("\nEnter choice:");
		System.out.println("1. Send message");
		System.out.println("2. Read message");
		System.out.println("3. Quit");
		
		choice = Keyboard.readInt();
		
		if (choice == 1)
		{
			sendMessage(sub);
		}
		
		if (choice == 2)
		{
			System.out.println(sub.readMail());
		}
	}
	while (choice != 3);
}


public static void main(String[] args)
{
	MailHandler postmaster = new MailHandler();
	
    String name;
    Subscriber s;
    
    for (;;) {
    System.out.print( "Username (or 'Q' to quit): ");
    name = Keyboard.readString();
    if (name.equals("Q")||name.equals("q"))
        break;
    s = (Subscriber)postmaster.getUser(name);
    if (s !=null) {
        System.out.println( "\nWelcome " + name);
        postmaster.processCommands(s);
    }
    }

	
}



}