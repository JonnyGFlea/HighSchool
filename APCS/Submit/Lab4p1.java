// ****************************************************************
//   Lab4p2.java
//
//	 Jonathan Rittmayer
//
//   Fizz Buzz
//         
// ****************************************************************
import cs1.Keyboard;
 
public class Lab4p1
{
    public static void main(String[] args)
    {
      String personPlay;    //User's play -- "R", "P", or "S"
      String computerPlay="";  //Computer's play -- "R", "P", or "S"
      int computerInt;      //Randomly generated number used to determine
                            //computer's play
 		System.out.println("(Type in a R for rock, P for paper, S for scissors!");
 		System.out.print("          Rock...");
	    try {
	    Thread.sleep(500);                  //1000 milliseconds is one second.
		}catch(InterruptedException ex){
		Thread.currentThread().interrupt();
}
		System.out.print("Paper...");
	    try {
	    Thread.sleep(500);                  //1000 milliseconds is one second.
		}catch(InterruptedException ex){
		Thread.currentThread().interrupt();
}
		System.out.print("Scissors...");
	    try {
	    Thread.sleep(500);                  //1000 milliseconds is one second.
		}catch(InterruptedException ex){
		Thread.currentThread().interrupt();
}
		System.out.println("Shoot!");
      while(true)  //continue to play forever - this will make your testing easier!
      {
          //Get player's play -- note that this is stored as a string
          //Assume player's play is uppercase for ease of comparison
          personPlay = Keyboard.readString();  // you can refer to Lab 2 if you cannot remember how to read a String from the Keyboard

      
          //Generate computer's play (0,1,2)    You need to create a random number
			 computerInt = (int)(Math.random()*3);
			 if (computerInt == 0)
			 	computerPlay ="R";
			 if (computerInt == 1)
			 	computerPlay ="P";
			 if (computerInt == 2)
			 	computerPlay = "S"; 
          //Translate computer's randomly generated play to string You need to use if statements to do this
 			
 
 
          //Print computer's play
          System.out.println(computerPlay);
          //See who won.  Use nested ifs instead of && for better practice.  Watch indentation!
	     if (personPlay.equals(computerPlay)) //BIG idea here, to compare Strings for equality MUST use .equals
              System.out.println("It's a tie!");
          else
          {  
        	 if (personPlay.equals("R"))
             if (computerPlay.equals("S"))
                      System.out.println("Rock crushes scissors. You win!!");
                  else
             		  System.out.println("Paper covers rock. You lose!!");
             if (personPlay.equals("P"))
             if (computerPlay.equals("R"))
             		  System.out.println("Paper covers rock. You win!!");
             	  else
             	  	  System.out.println("Scissors cut paper. You lose!!");
			 if (personPlay.equals("S"))
             if (computerPlay.equals("P"))
             		  System.out.println("Scissors cut paper. You win!!");
             	  else
             	  	  System.out.println("Rock crushes scissors. You lose!!");
             	  
 
                //...  Fill in rest of code

           } // matches with else opening {
        
        }  // matches with while opening {
    }  // matches with main method opening {
}  // matches with class opening {