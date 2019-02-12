//***************************************\\
//			Jonathan Rittmayer 			 \\
//					P2					 \\
//			  WordEntry.java			 \\
//										 \\	
//										 \\
//***************************************\\

public class WordEntry
{
	//create two pieces of instance data
	//(find and findempty)
	private String word;
	private int freq;
	
	//Include two constructors for your class
	public WordEntry(String w, int f)
	{
		word = w;
		freq = f;
	}
	
	public String getWord()
	{
		return word;
	}
	public int getFreq()
	{
		return freq;
	}
	
	public void increaseFreq()
	{
		freq++;
	}
	
}