import java.util.*;

public class MagicSquareFinder
{
     
   public static void main(String[] args)
   {
   
      int numFound = 0;
      MagicSquare theMat;
      List<MagicSquare> foundSolutions = new ArrayList<MagicSquare>();
      while (numFound < 8)
      {
      // put the numbers 1 - 9 into a 3x3 matrix in random order
         theMat = createMatrix();
        // System.out.println(theMat);
         // determine if the result is a magic square
         if (MagicSquareFinder.isMagicSquare(theMat) &&
             MagicSquareFinder.isUnique(foundSolutions,theMat) )
         {
            foundSolutions.add(theMat);
            numFound++;
            System.out.println(theMat);
         }
      }
   }
   
   public static MagicSquare createMatrix()
   {
      // create a potential magic square by randomly filling a 3 by 3 matrix
      // return the instantiated MagicSquare object
      int[][] matrix = new int[3][3];
      ArrayList<Integer> theList = new ArrayList<Integer>();
      for(int k = 1; k <= 9; k++)
         {
         theList.add(k);
         }
         
      for (int r = 0; r < matrix.length ; r++)
         {
          for (int c = 0; c < matrix[0].length ; c++)
          {
            matrix[r][c] = theList.remove((int)(Math.random()*theList.size())); 
          
          }
         }
      MagicSquare newOne = new MagicSquare(matrix);
      
      return newOne;
      
   }
      
   public static boolean isMagicSquare(MagicSquare test)
   {
   // check that all rows, cols, and diagonals have same sum
   // should invoke methods of MagicSquare class to accomplish this
      int c;
      int r;
      int d;
      int d2;
      int total = 0;
      
      for (int k = 0; k < 3; k++)
      {
         c = test.colSum(k);
         r = test.rowSum(k);
         d = test.diagonalSum1();
         d2 = test.diagonalSum2();
         if (c == r && r == d && d == d2) 
            {
            total++;
            } 
            
         if (total == 3)
         {
         return true;
         }
      }
   return false;    
 } 
   public static boolean isUnique(List<MagicSquare> found, MagicSquare curr)
   {
     // return true if curr does not match any MagicSquare objects in List found
     // false otherwise
     
     for(int k = 0; k < found.size(); k++)
     { 
         if (found.get(k).matches(curr))
         {
         return false;
         }
     }
     return true;
   }      
   
}
                       
                   