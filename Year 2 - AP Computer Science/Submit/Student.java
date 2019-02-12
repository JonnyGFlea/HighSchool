// Student is a SUBCLASS of Person
// A Student will have all of the data that is in Person
// (BUT it CANNOT access the instance data)
// The methods of Person are INHERITED (BUT NOT THE CONSTRUCTOR)

public class Student extends Person
{
	private int grade;
	
	public Student(String fn, String ln, int a, int g)
	{
		super(fn, ln, a);	
	
		grade = g;
	}
	
	public String toString()
	{
		return getFirstName() +" "+ getLastName() + " Grade: " + grade;
		
		
	}
	
			
}	