import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class MazeModel {

    /*
     *  This is the Model component.
     */

    private static int SIZE = 30;
    private MazeCell[][] myGrid;
    private MazeView myView;
    private Stack<Point> solution;
    private int cRow, cCol, nRow, nCol;     // current,new row,col
    private Point temp;
    private boolean keepGoing;
    
    public MazeModel(MazeView view)
    {
        myGrid = new MazeCell[SIZE][SIZE];
        int setNum = 0;
        for (int r=0; r<SIZE; r++)
        {
            for (int c=0; c<SIZE; c++) 
            {
                myGrid[r][c] = new MazeCell( setNum );
                setNum++;
            }
        }
        int numSets = setNum;
        
        while ( numSets > 1 ) 
        {
            int aCol = (int)(Math.random() * SIZE);            // choose random cell
            int aRow = (int)(Math.random() * SIZE);
            int bCol = aCol;
            int bRow = aRow;
            int testdir = 0;
            while (aCol == bCol && aRow == bRow)              // and random neighbor
            {
                testdir = (int)(Math.random() * 4);
                switch (testdir) 
                {
                    case 0:
                      if (aCol > 0) bCol = aCol-1;  break;     // left cell candidate
                    case 1: 
                      if (aCol < SIZE-1) bCol = aCol+1; break; // right cell candidate
                    case 2:
                      if (aRow > 0) bRow = aRow-1; break;      // top cell candidate
                    case 3: 
                      if (aRow < SIZE-1) bRow = aRow+1; break; // bottom cell candidate
                }
            }
            
            // we have two adjacent cells both in the maze grid
            if (myGrid[aRow][aCol].getSetNumber() != myGrid[bRow][bCol].getSetNumber() ) 
            {
                // join them by going through all cells and sharing set number
                int changeToSet = myGrid[aRow][aCol].getSetNumber();
                int changeFromSet = myGrid[bRow][bCol].getSetNumber();
                for (int col=0; col<SIZE; col++) 
                {
                    for (int row=0; row<SIZE; row++) 
                    {
                        if ( myGrid[col][row].getSetNumber() == changeFromSet )
                            myGrid[col][row].setSetNumber(changeToSet);
                    }
                }
              
                // now remove common hedge
                switch (testdir) 
                {
                    case 0: myGrid[aRow][aCol].setLeftHedge(false);
                            myGrid[bRow][bCol].setRightHedge(false);
                            break;
                    case 1: myGrid[aRow][aCol].setRightHedge(false);
                            myGrid[bRow][bCol].setLeftHedge(false);
                            break;  
                    case 2: myGrid[aRow][aCol].setTopHedge(false);
                            myGrid[bRow][bCol].setBottomHedge(false);
                            break;  
                    case 3: myGrid[aRow][aCol].setBottomHedge(false);
                            myGrid[bRow][bCol].setTopHedge(false);
                            break;  
                }  // end of switch
                numSets--;
            }
        }
    
        // make an entry and exit point to the maze
        myGrid[0][0].setLeftHedge(false);
        myGrid[SIZE-1][SIZE-1].setRightHedge(false);
        
        myView = view;
        myView.updateView(myGrid); 
        
        solution = new Stack<Point>();
        cRow = 0;
        cCol = 0;
        temp = new Point(cRow,cCol);
   		solution.push(new Point(cRow,cCol));        
    }
                  
    public void stepMaze()
    {
    //left and right is col
    //top and bottom is row
        /* student code here */ 
      myGrid[cRow][cCol].setStatus(1);  // mark cell as on current path
      myView.updateView(myGrid);
     	
     	MazeCell curr = myGrid[cRow][cCol];
      temp = new Point();
      if(myGrid[cRow][cCol] != myGrid[SIZE-1][SIZE-1]) 
      {   
      if(!myGrid[cRow][cCol].getRightHedge() && myGrid[cRow][cCol+1].getStatus() == 0)
           {
           cCol++;
           myGrid[cRow][cCol].setStatus(1);
           solution.push(new Point(cRow, cCol));
           }
           else
               if(!myGrid[cRow][cCol].getBottomHedge() && myGrid[cRow+1][cCol].getStatus() == 0)
                  {
                  cRow++;
                  myGrid[cRow][cCol].setStatus(1);
                  solution.push(new Point(cRow, cCol));
                  }
               else
                  if(!myGrid[cRow][cCol].getTopHedge() && myGrid[cRow-1][cCol].getStatus() == 0 )
                  {
                  cRow--;
                  myGrid[cRow][cCol].setStatus(1);
                  solution.push(new Point(cRow, cCol));
                  }
                  else
                     if(!myGrid[cRow][cCol].getLeftHedge() && myGrid[cRow][cCol-1].getStatus() == 0)
                     {
                     cCol--;
                     myGrid[cRow][cCol].setStatus(1);
                     solution.push(new Point(cRow, cCol));
                     }
                     else
                         {
                         myGrid[cRow][cCol].setStatus(2);
                         solution.pop();
                         cRow = solution.peek().x;
                         cCol = solution.peek().y;
                         }
                        
           
       }     

    }
}

