
public class Person  // CLASS NAME creates a data type
{
	
	// this is instance data, also sometimes referred to as fields
	// instance data is ALWAYS private.....it CANNOT be accessed outside
	// this class (for your purposes - this java file)
	private String firstName;
	private String lastName;
	private int age;
	
	
	// the following is a CONSTRUCTOR
	public Person(String f, String l, int a)
	{
		// a CONSTRUCTOR is a method
		//     the method name ALWAYS matches the CLASS NAME
		//     the method DOES NOT have a RETURN TYPE
		//     the PURPOSE of the constructor is TO GIVE THE INSTANCE DATA INITIAL VALUE
		
		
		firstName = f;
		lastName = l;
		age = a;
	}
	
	public String getLastName()  // this is an ACCESSOR method - it provides ACCESS to the values
	                             // stored in the instance data
	{
		return lastName;
	}
	
	public String getFirstName() // this is an ACCESSOR method - it provides ACCESS to the values
	                             // stored in the instance data
	{
		return firstName;
	}
	
	public int getAge()    // this is an ACCESSOR method - it provides ACCESS to the values
	                       // stored in the instance data
	{
		return age;
	}

		public void increaseAge()	//this is a MODIFIER method - it modifies the instance data
		{
			age++;
		}
	//automatically invoked when a Person object is printed
		public String toString()
		{
			return firstName + " " +lastName + " " + age + "\n" + "\t"
			;
		}
}
	