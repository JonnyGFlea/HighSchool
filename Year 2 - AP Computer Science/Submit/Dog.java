public class Dog
{
//	Your class should have three pieces of instance data:
//	 a variable that holds the name of the dog, a variable
// that holds the breed of the dog, and a variable to hold the
// age of the dog.
	
	private String name;
	private String breed;
	private int age;
	
//Your constructor should initialize your instance data. 
	public Dog(String n, String b, int a)
	{
		name = n;
		breed = b;
		age = a;
	}	
//Make three accessor methods for your class.

	public String getName()
	{
		return name;
	}
	public String getBreed()
	{
		return breed;
	}	

	public int getAge()
	{
		return age;
	}	
	
//Make a modifier method to cause dogs age to increase

	public void increaseAge()
	{
		age++;
	}
// Write a toString() method

	public String toString()
	{
		return "Name: " + name + "\n Breed: " + breed + "\n  Age: " + age;
		
	}
}