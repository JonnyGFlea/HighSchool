//********************************************************************
//  RandomNumbers.java      
//********************************************************************


public class RandomNumbers
{
   //-----------------------------------------------------------------
   //  Generates random numbers in various ranges.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      int num1;
      double num2;

      num2 = Math.random();
      System.out.println ("A random number between 0 and 1: " + num2);

      num1 = (int)(Math.random()*10);
      System.out.println ("From 0 to 9: " + num1);

      num1 = (int)(Math.random()*10) + 1;
      System.out.println ("From 1 to 10: " + num1);

      num1 = (int)(Math.random()*20) - 10;
      System.out.println ("From -10 to 9: " + num1);

   }
}
