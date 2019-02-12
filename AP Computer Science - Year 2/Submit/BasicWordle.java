import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class BasicWordle extends Frame
{
	private WordEntry[] wordsAndFreq;
	
	public BasicWordle(String fname)
	{
		wordsAndFreq = new WordEntry[100];
		String word;
		int loc;
		EasyReader inFile = new EasyReader(fname);
		while ( !inFile.eof() )
		{
			word = inFile.readWord();
			System.out.println(word);
			if ( word != null )
			{
				// YOU NEED TO WRITE CODE HERE!
				//  Algorithm:
									// check if the word is already in collection
				loc = find(word);   //INVOKE your find method (below)
				if (loc != -1)		//you will need to think about what find returns
					{		   				 		  //when the word is found vs when it is not found
					wordsAndFreq[loc].increaseFreq(); // if the word is found, increment its frequency
													  // (invoke a method on the appropriate object,
					}								  // remember wordsAndFreq is a list of WordEntry objects)
									
				if(loc==-1)							  // if the word is not found
					{							  
					wordsAndFreq[findEmpty()] = new WordEntry(word,1);            // instantiate a new WordEntry object
					} 								  					  // find the empty spot in the array (invoke findEmpty)
													  					  // put it in the array at that next empty spot
				
			}
		}

		setSize(600, 500);
		setTitle("Basic Wordle");
		setVisible(true);

		repaint();						
	}
	
	private int findEmpty()
	{
		for(int k = 1; k < wordsAndFreq.length; k++)
			if(wordsAndFreq[k] == null)
			{
				return k;
			}
		return -1;
		// returns the index of the first null object in wordsAndFreq
		// returns -1 if no empty spot found

	}

	private int find(String w)
	{
		for(int j = 0; j < wordsAndFreq.length; j++)
			if (wordsAndFreq[j]!=null && w.equals(wordsAndFreq[j].getWord()))
			{
				return j;
			}
			return -1;		
		// YOU NEED TO WRITE CODE HERE
		// Loop through the list of WordEntry objects, and locate
		// the index of the object that contains the word passed in the parameter w
		// if w is not found in the list of WordEntry objects, return -1

		// this is one of the fundamental algorithms you SHOULD KNOW!

	}		

	public void paint(Graphics g)
   
	{ 
		// DO NOT CHANGE THIS CODE unless you are exploring extra credit
	   	setBackground(Color.yellow);
	   	int last=40;
		for (int i = 0; i < wordsAndFreq.length; i++)
		{
			if ( wordsAndFreq[i] != null )
			{
				int freq = wordsAndFreq[i].getFreq();
				String word = wordsAndFreq[i].getWord();					
    			System.out.println(word + " " + freq);
    			Font font = new Font("Arial", Font.BOLD, freq*15);
    			int xpos = (int)(Math.random()*20)*20+50;
    			g.setFont(font);
    			g.drawString(word, xpos, last + freq*10);
    			last = last+freq*10;
    		}
    	}

   }

	public static void main(String[] args)
	{
		BasicWordle program = new BasicWordle("oldmacdonald.txt");
		program.addWindowListener(new WindowAdapter()
             {
                   public void windowClosing(WindowEvent e)
                   {
                        System.exit(0);
                   }
             }
        );

		BasicWordle program2 = new BasicWordle("oldmacdonald2.txt");  //you will need to make another text file
		program2.setLocation(600,100);
		program2.addWindowListener(new WindowAdapter()
             {
                   public void windowClosing(WindowEvent e)
                   {
                         System.exit(0);
                   }
             }
        );
	}
}
