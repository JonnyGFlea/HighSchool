import java.awt.*;
public class Mandelbrot {
	
	public static void main(String[] args)
	{
		Picture p = new Picture(2000,1000);
		Mandelbrot m = new Mandelbrot();
		m.doMandel(p);
		p.explore();
	}
	
	public Mandelbrot()
	{
		
	}
	public void doMandel(Picture p)
	{
		int iteration = 0;
		Pixel[][] pix = p.getPixels2D();
		int pixRow = 0;
		int pixCol = 0;
		for(double real =2.0; real >= -2.0; real -= .01)
		{
			for(double imag =-2.0; imag <2.0; imag+= .01)
			{
				iteration = 0;
				ComplexNumber cn = new ComplexNumber(imag,real);
				ComplexNumber temp = new ComplexNumber(imag,real);
				while(temp.abs() <= 2.0 && iteration < 50)
				{
					temp = temp.square();
					temp.add(cn);
					iteration++;
				}
				
				if(iteration == 0)
					pix[pixRow][pixCol].setColor(Color.WHITE);
				else if(iteration == 50)
					pix[pixRow][pixCol].setColor(Color.black);
				
			
				pixCol++;
			}
			pixRow++;
			pixCol = 0;
		}
	}
}