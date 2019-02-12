public class DogTest
{
	public static void main(String[] args)
	{
//Write code in your main method in DogTest 
		Dog[] dog = new Dog[3];
//to instantiate two different Dog objects.	
// Create an array capable of storing 3 Dog objects.  Fill your array with three Dog objects. 
		dog[0] = new Dog("Biscuit", "Chocolate Lab", 10);
		dog[1] = new Dog("Fido","Pug", 3);
		dog[2] = new Dog("Puddles","Golden Retriever", 21);
		
//nvoke your accessor methods in your main method,
// and be sure to
// print something that will allow you to test your program.			
		
	//	System.out.println("Dog 1 : " + dog1.getName() + 
						//	" " + dog1.getBreed() +
						//	" " + dog1.getAge() );
							
//print an object of your class to test it. 
// next line of code automatically invokes the toString method
// of the Dog class

// Write a loop to print your Dog objects USING your toString method.
// (Remember, the toString method is automatically invoked when you print out an object of the class)

//	for(int i = 0; i < dog.length; i++)
//		System.out.println(dog[i]);
		
// make dog age
	for(int k = 0; k< dog.length; k++)
		dog[k].increaseAge();


// print modified dog
	for(int j = 0; j < dog.length; j++);
		System.out.println( dog[j] );
		
		
	}	
	
}