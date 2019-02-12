public class DogTest
{
	public static void main(String[] args)
	{
//Write code in your main method in DogTest 
//to instantiate two different Dog objects.	

		Dog dog1 = new Dog("Biscuit", "Chocolate Lab", 10);
		Dog dog2 = new Dog("Fido","Pug", 3);
		
//invoke your accessor methods in your main method,
// and be sure to
// print something that will allow you to test your program.			
		
		System.out.println("Dog 1 : " + dog1.getName() + 
							" " + dog1.getBreed() +
							" " + dog1.getAge() );
							
//print an object of your class to test it. 
// next line of code automatically invokes the toString method
// of the Dog class
		System.out.println(dog1);
		
//Create an array capable of storing 3 Dog objects.
		Dog[] doggys = new Dog[3];
		
// Fill your array with three Dog objects. 				
		doggys[0] = new Dog("Rover", "German Shepherd",2);
		doggys[1] = new Dog("Boolean", "Mutt", 4);
		doggys[2] = new Dog("Brutus", "Boxer", 3);
		
//Write a loop to print your Dog objects USING your toString method.
// (Remember, the toString method is automatically invoked when you print out an object of the class)

		for (int k = 0; k < doggys.length; k++)
			System.out.println(doggys[k]);
			
// Write another loop to make each Dog object get one year older.
	for (int k = 0; k < doggys.length; k++)
			doggys[k].increaseAge();

// Print each modified object, and check that the age increased correctly.			
	for (int k = 0; k < doggys.length; k++)
			System.out.println(doggys[k]);
											
		
	}	
	
	
}