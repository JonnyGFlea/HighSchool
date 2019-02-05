/**
 *   Driver program to test shapes
 */

import java.awt.*;
import java.awt.event.*;
import java.util.*;

class TestShapes extends Frame {
	
	static ArrayList<Shape> myShapes = new ArrayList<Shape>();
		
	public void paint(Graphics g)
	{
		for (int i = 0; i < myShapes.size(); i++)
		{
			Shape s = myShapes.get(i);	
			s.draw(g);
		}	
	}	
	public static void main(String args[]) {
		System.out.println("Starting Shape...");
		TestShapes mainFrame = new TestShapes();
		Shape c = new Circle(100,100,20);
		System.out.println(c);
		myShapes.add(c);
		
		Shape r = new Rectangle(150,150,20,50);
		System.out.println(r);
		myShapes.add(r);

		c = new Circle(200,300,80);
		System.out.println(c);
		myShapes.add(c);
		
		r = new Rectangle(250,50,80,120);
		System.out.println(r);
		myShapes.add(r);
	
		mainFrame.setSize(400, 400);
		mainFrame.setTitle("Shape");
		mainFrame.setVisible(true);
	}
}
