
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class BubbleShow extends Frame implements ActionListener 
{
	
	private Bubble theBubble1;
	private Bubble theBubble2;
	private Bubble theBubble3;
	
	private Timer t;
		
	public BubbleShow()
	{
		t = new Timer(200, this);
		t.start();
		theBubble1 = new Bubble(100,200);
		theBubble2 = new Bubble(200,50);
		theBubble3 = new Bubble(50,100);
		
	}
	
	
	/**
   *  Processes timer events
   */
  	public void actionPerformed(ActionEvent e)
  	{
    	theBubble1.move();
    	theBubble2.move();
    	repaint();	
	}
	public void paint (Graphics g)
	{
		setBackground(Color.red);
		
		theBubble1.display(g);	
		theBubble2.display(g);	
		theBubble3.display(g);
		g.setColor(myColor);
		g.fillOval(x,y,diameter,diameter);
	}

	
	public static void main(String args[]) {

		BubbleShow mainFrame = new BubbleShow();
		
		
		mainFrame.setSize(400, 400);
		mainFrame.setTitle("Bubbles");
		mainFrame.setVisible(true);
			

	}
}					 	
		
	
		
				