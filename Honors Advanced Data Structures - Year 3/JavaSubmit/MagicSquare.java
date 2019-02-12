import java.util.*;

public class MagicSquare
{  
   private int[][] matrix = new int[3][3];
   
   public MagicSquare(int m[][])
   {
      matrix = m;
   }
   public int rowSum(int r)
   {
      int sum = 0;
      for (int c = 0; c < matrix[0].length; c++)
         {
         sum += matrix[r][c];
         }
      return sum;
   }
   public int colSum(int c)
   {
      int sum = 0;
      for (int r = 0; r < matrix.length; r++)
          {
          sum += matrix[r][c];
          }
      return sum;
   }
   public int diagonalSum1()
   {
      int sum = 0;
      int r = 0;
      if(r != 3)
      for (int c = 0; c < matrix[0].length; c++)
          {
          sum+= matrix[r][c];
          r++;
          }
      return sum ;  
   }
   public int diagonalSum2()
   {
      int sum = 0;
      int r = 2;
      if(r != -1)
         {
            for (int c = 0; c < matrix[0].length; c++)
               {
                sum += matrix[r][c];
                r -= 1;
               }
         }
      return sum;
   }
   public int getNum(int r, int c)
   {
      return matrix[r][c];
   }
   public boolean matches(MagicSquare d)
   {
   int total = 0;
      for (int r = 0; r < matrix.length ; r++)
             {
               for (int c = 0; c < matrix[0].length ; c++)
                     {
                     if (d.getNum(r, c) == this.getNum(r,c))
                        total++;
                     }
   }
      if(total == 9)
      {
      return true;
      }
   return false;
   }
   
   /*public int numRow()
   {
  
   }
   public int numCol()
   {
   //
   }
  */
   public String toString()
   {
   String a = ""; 
   for (int r = 0; r < matrix.length ; r++)
       {
       for (int c = 0; c < matrix[0].length ; c++)
           {
           a += " " + matrix[r][c];
           }
           a += "\n";
        }
   return a;
   }
}