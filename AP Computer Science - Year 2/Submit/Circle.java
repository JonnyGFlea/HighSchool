import java.awt.*;


public class Circle extends Shape 
{
	private int radius;
	
	public Circle(int xLoc, int yLoc, int r)
	{
		super(xLoc, yLoc);
		radius = r;
	}
	
	public double area()
	{// more code here
		return Math.PI*radius *radius;		//static value Math.PI might be helpful here
	}

	public void draw (Graphics g)
	{
		g.drawOval(getXPos()-radius, getYPos()-radius, radius*2, radius*2);
	}
	
	
	public int getRadius()
	{//more code here
		return radius;
	}	

	public void stretchBy(double factor)
	{//more code here
		radius*=factor;
	}	
		
	public String toString()
	{
		String str = "CIRCLE\n"
					+ "Radius: " + radius + "\n"
					+ "Center: \n" + super.toString()
					+ "Area: " + area();
		
		return str;
	}
}					 	
		
	
		
				