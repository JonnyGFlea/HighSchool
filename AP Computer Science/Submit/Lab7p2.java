// ****************************************************************
//   Lab7p2.java
//
//	 Jonathan Rittmayer
//
//   Pascal's Triangle
//         
// ****************************************************************
import cs1.*;
public class Lab7p2
{
     public static void main(String[] args)
     {
          
          int[] prev;   // the previous row
          int[] curr;   // the current row you are generating
    	  int num = 0, sum = 0;
          System.out.print("How many rows? ");
         
          num = Keyboard.readInt();

 
          // use entered number to instantiate the arrays (when you instantiate int arrays they are automatically filled with zeros)
         curr = new int[num];
 		 prev = new int[num];
          // you can ‘force’ the initial two rows out to the screen
 
 
          prev[0]=1;
          prev[1]=1;
          curr[0]=1;   
          System.out.println("1");
          System.out.println("1 1");
          for(int t = 2; t < num; t++)
          {
          	System.out.print("1 "); //prints the first line as 1
          	for(int i = 1; i <prev.length; i++)
          	    {
	          		curr[0]=1;
	          		curr[i]=prev[i-1]+prev[i];
	        		if (curr[i] == 0)
	        			System.out.print("");
	        		else	
	          			System.out.print(curr[i]+" ");
	          				
          		}
          		for(int j = 0; j<curr.length; j++)
          		{
          		prev[j] = curr[j];
          		}
          	System.out.println("");
          	}
          	


          		
          	
	}
} 