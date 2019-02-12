


public class Talker
{
	/*
	 * This is instance data (also known as fields)
	 * Each OBJECT of this CLASS will contain this data
	 * These variables can be used in all methods of the class
	 */ 
	private String phrase;
	private int repeatFactor;
	
	/*
	 *This is a CONSTRUCTOR
	 *The purpose of a constructor is to give the instance data initial values
	 *IT CANNOT HAVE A RETURN TYPE
	 *Its name must match the class
	 *It has TWO parameters p, which is of type String, and rF, which is of type int
	 */
    public Talker(String p, int rF)
    {
    	phrase = p;
    	repeatFactor = rF;	
    }	
	
	public String toString()
	{
		String returnVal = "";
		for (int k = 0; k < repeatFactor; k++)
			returnVal += phrase + "\n";
		return returnVal;	
	} 
	//Add an accessor method to the class.  
	//An accessor method provides client code 
	//access to the instance data of the class.   
	public String getphrase()
	{
		return phrase;
	}
	
	public int getrepeatFactor()
	{
		return repeatFactor;
	}

}