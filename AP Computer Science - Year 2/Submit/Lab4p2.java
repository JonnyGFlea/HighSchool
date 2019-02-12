// ****************************************************************
//   Lab4p2.java
//
//	 Jonathan Rittmayer
//
//   Fizz Buzz
//         
// ****************************************************************
public class Lab4p2
{
    public static void main(String[] args)
    {
    	int i = 1;
        for(i = 1; i < 101; i++)
        {
        	if (i%15 ==0)
        		System.out.println("Fizz-Buzz");
        	else
        	{
		       	 if (i%3 == 0)
		    		System.out.println("Fizz");
			    else
			    {
			    	if (i%5 == 0) 
	    	   			System.out.println("Buzz");	
      				else
      				{
      				System.out.println(i);
					}
    			}
    		}
    	}
	}

}