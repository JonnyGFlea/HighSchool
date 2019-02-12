public class PersonListExample2
{
	public static void main(String[] args)
	{
		// using Person objects
		
		
		// people is an ARRAY capable of holding 4 Person objects
		Person[] people = new Person[4];
		
		
		// Instantiate each individual Person
		//these lines of code envoke the instructor of the person class 
		people[0] = new Person("Mickey","Mouse",15);
		people[1] = new Person("Donald","Duck",20);
		people[2] = new Person("Daisy","Duck",12);
		people[3] = new Person("Captain","Hook",53);
		
		
	//	for (int i = 0; i < people.length; i++)
	//		System.out.println( people[i].getFirstName() + "\t" +
	//		                    people[i].getLastName() + "\t Age: " +
	//		                    people[i].getAge() );
			                    
			                    
// make people age
		for(int k = 0; k< people.length; k++)
			
			people[k].increaseAge();
// print modified people
		for(int k = 0; k<people.length; k++)
			System.out.println( people[k] );			    
                
			                    
			
	}
}		
		
		
		
	