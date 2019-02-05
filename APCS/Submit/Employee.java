public class Employee extends Person

{
	private double salary;
	
	public Employee(String firstn, String lastn, int age, double s)
	{ //invokes the super class constructor
    // allows instance data stored in the Person class
    // to get initialized
		super(firstn, lastn, age);	
	
		salary = s;
	}
	
	public String toString()
	{
		return super.toString() + "Salary: " + salary;
	}
	
	public static void main(String[] args)

	{

     Employee emp = new Employee ("Bob", "Marklet", 10, 20000); // invoke your constructor to create an instance of the Employee class

     System.out.println(emp);  //AUTOMATICALLY invokes the toString method

	}
}