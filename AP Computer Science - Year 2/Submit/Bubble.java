import java.awt.*;

public class Bubble 
{
	private int x;
	private int y;
	
	private int vx;
	private int vy;
	
	private Color myColor;
 	private int diameter;

		
	public Bubble(int theX, int theY, Color c, int d)
	{
	 
		 x += 10;
		 y += 10;
	 
 		vx = 10;
		vy = 10;
		
		myColor = c;
 		diameter = d;
	}
	public void display (Graphics g)
	{
		g.setColor(Color.green);
		g.fillOval(x,y,20,20);
	}
	 public void move()
	{

		if (x+vx<= 0) vx*=-1;
		if ( x + vx  >= 400) vx*=-1;
		if (y+vy<= 0) vy*=-1;
		if ( y + vy  >= 400) vy*=-1;
		
		x += vx;
		y += vy;

	}
}					 	
		
	
		
				