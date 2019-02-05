//********************************************************************
//  TowersOfHanoi.java                                               :0
//                                                                   :o
//  Represents the classic Towers of Hanoi puzzle.                   :O
//********************************************************************

public class TowersOfHanoi
{
   private int totalDisks;

   //-----------------------------------------------------------------
   //  Sets up the puzzle with the specified number of disks.
   //-----------------------------------------------------------------
   public TowersOfHanoi (int disks)
   {
      totalDisks = disks;
   }

   //----------------------------------------------------------------- 
   //  Performs the initial call to moveTower to solve the puzzle.
   //  Moves the disks from tower 1 to tower 3 using tower 2.
   //-----------------------------------------------------------------
   public int solve ()
   {
      return moveTower (totalDisks, 1, 3);
   }
   
   //-----------------------------------------------------------------
   //  Moves the specified number of disks from one tower to another
   //  by moving a subtower of n-1 disks out of the way, moving one
   //  disk, then moving the subtower back. Base case of 0 disks.
   //-----------------------------------------------------------------

//your code here
public int moveTower(int disks, int start, int end)
{
   int numMoves = 1;
   if ( disks == 0 ) return 0;
   int spare = 6 - start - end;
   
   numMoves += moveTower( disks-1, start, spare);
   System.out.println("Move from peg " + start + " to " + end);
   numMoves += moveTower( disks-1, spare, end);
   
   return numMoves;
}


    public static void main (String[] args)
    {
      TowersOfHanoi towers = new TowersOfHanoi (3);

      System.out.println(towers.solve() +" moves.");
   }

}
