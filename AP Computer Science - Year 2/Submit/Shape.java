import java.awt.*;

//an abstract class is a class that contains AT LEAST one
//abstract method
abstract public class Shape
{
	private int xPos;
	private int yPos;

	public Shape()
	{
		xPos = 0;
		yPos = 0;
	}	
	public Shape (int x, int y)
	{
		xPos = x;
		yPos = y;
	}
	//ABSTRACT methods have No code!
	abstract public double area();
	abstract public void draw(Graphics g);
	public int getXPos()
	{
		return xPos;
	}
	public int getYPos()
	{
		return yPos;
	}	
	public void move(int xLoc, int yLoc)
	{
		xPos = xLoc;
		yPos = yLoc;
	}
	abstract public void stretchBy(double factor);
	public String toString()
	{
		return "(" + xPos +"," + yPos +")";
	}
}