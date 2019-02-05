/*
   Jonathan Rittmayer

   LAB 2 PART 1 
*/
import cs1.*;
public class Lab2p1 {
	
	public static void main(String args[])
	{
		double ans1, ans2;
		double r = Math.sqrt(2);   //computes the square root of 2
		double fth = Math.sqrt(r);   //since r is the square root of 2, fth will contain the fourth root of 2
		int a,b,c;
		System.out.println("Enter three numbers for the Quadratic Formula");
		System.out.println();
		System.out.print("Enter the value for a: ");
		a = Keyboard.readInt();
		System.out.print("Enter the value for b: ");
		b = Keyboard.readInt();
		System.out.print("Enter the value for c: ");
		c = Keyboard.readInt();			
	
	
		
			ans1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
			ans2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a); 	
			System.out.println();
			System.out.println("One answer to the quadratic equation 2x^2 + 1x + -15 is:");
			System.out.println("X = " + ans1);
			System.out.println("and the other solution is:");
			System.out.println("X = " + ans2);
			System.out.println();
			
		}
		
}	
