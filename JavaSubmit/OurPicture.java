import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.concurrent.TimeUnit.*;

public class OurPicture extends JFrame implements ActionListener, MouseListener
{
	private Timer t;
	
	private static final int cellSize = 8;
	private static final int border = 25;
	 
	public OurPicture()
	{
		setSize(900,1000);
		addMouseListener(this);
		setVisible(true);
      t = new Timer(100, this);
      t.start();
	}
	
	
	public void paint (Graphics g)
	{
      Toolkit toolkit = Toolkit.getDefaultToolkit();
		int check = 0;		
      Image img  =  toolkit.getImage( "tree.png" );
      //Image ornament  =  toolkit.getImage( "Ornament.png" );
      Image starOn  =  toolkit.getImage( "jonnygflea.png" );
      //Image starOff  =  toolkit.getImage( "jonnygfleaOff.png" );
      g.drawImage(img,10,50,this);
      //g.drawImage(ornament,170,55,this);
      
      if(check%2 == 0)
      {
          g.drawImage(starOn,235,15,this);
          g.setColor(Color.white);  
      }
      else
      {
         g.setColor(Color.red); 
      }
	  check++;
     try {
     Thread.sleep(100);}
     catch(InterruptedException ex) {
         Thread.currentThread().interrupt();
         }
     while(check < 10)
     {
     paint(g);
	  }
   }
	
	
	public void actionPerformed(ActionEvent e)
  	{
  		System.out.println("in timer");
  	}

   public void mousePressed(MouseEvent evt) {
          
      repaint();
   }
   
   
   public void mouseReleased(MouseEvent e) { }  // Methods required by MouseListener interface
   public void mouseClicked(MouseEvent e) { }
   public void mouseEntered(MouseEvent e) { }
   public void mouseExited(MouseEvent e) { }
   

	
 public static void main(String[] args)
    {
        OurPicture thePic = new OurPicture();
            
        thePic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}