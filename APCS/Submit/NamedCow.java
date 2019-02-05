//Finally, it also came to pass that the cows get a personal name, like Elsie.
public class NamedCow extends Cow // Create a new class, NamedCow, that extends the cow class,
{
	private String name;
	
	public NamedCow(String type, String sound, String n) // adding a constructor (pay attention to the order of the parameters),
	{
		super(type, sound);	
	
		name = n; // a field for the Cow's name,
	}
	public String getName() //and a new method: getName().
	{ 
//Remember, since NamedCow will be a subclass of Cow you should only include
// the instance data that makes a NamedCow different from a Cow.
		return name;
	}
	public String toString()
	{
		return getType() + " " + getSound() + " " + "Named: " + getName();
	}
	
}	



// After you invoke your superclass constructor in the NamedCow constructor
// you will need to give your other piece of instance data (stored in NamedCow) a value.