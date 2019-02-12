public class Chick implements Animal
{
	private String myType;
    private String mySound;
    private String mySound2;
 
 
     public Chick(String type, String sound)
    {
        myType = type;
        mySound = sound;
    }
 

    public Chick(String type, String sound, String sound2)
    {
        myType = type;
        mySound = sound;
        mySound2 = sound2;
    }
 
    public String getSound() 
    {
    	return mySound;
    }
	
    public String getType()
    { 
    	return myType; 
    }
}