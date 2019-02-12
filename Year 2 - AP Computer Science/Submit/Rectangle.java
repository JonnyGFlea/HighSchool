// void	drawRect(int x, int y, int width, int height) 
//          Draws the outline of the specified rectangle.
import java.awt.*;


public class Rectangle extends Shape 
{
	private int width;
	private int height;
	
	public Rectangle(int xLoc, int yLoc, int w, int h)
	{
		super(xLoc, yLoc);
		width = w;
		height = h;
	}
	
	public double area()
	{// more code here
		return height*width;
	}

	public void draw (Graphics g)
	{
		g.drawRect(getXPos(), getYPos(), width, height);
	}
	
	
	public int getWidth()
	{//more code here
		return width;
	}	
		public int getHeight()
	{//more code here
		return height;
	}

	public void stretchBy(double factor)
	{//more code here
		height*=factor;
		width*=factor;
	}	
		
	public String toString()
	{
		String str = "RECTANGLE\n"
					+ "Center: \n" + super.toString()
					+ "Area: " + area();
		
		return str;
	}
}					 	
		