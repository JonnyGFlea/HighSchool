public class Message{
	private String from;
	private String to;
	private String subject;
	private String message;

	Message(String f, String t, String s, String m)
	{
		from = f;
		to = t;
		subject = s;
		message = m;
	}

	public String toString()
	{
		return "From: " + from + "\n" + "To: " + to + "\n" +
			   "Subject: " + subject + "\n" +
			   "Message: " + message + "\n";
	}
}
