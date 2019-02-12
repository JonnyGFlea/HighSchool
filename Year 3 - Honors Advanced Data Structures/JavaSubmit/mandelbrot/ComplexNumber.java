public class ComplexNumber
 {
   private Double real;
   private Double imag; //imaginary
   
   public ComplexNumber(Double a, Double b)
   {
   real = a;
   imag = b;
   }
   public void add(ComplexNumber c)
   {
	   real += c.real;
	   imag += c.imag;
			   
      }
   public ComplexNumber square()
   {
	   return new ComplexNumber(real*real - imag*imag, 2*real*imag);
   }
   public double abs()
   {
	   return Math.sqrt(real*real + imag*imag);
   }
   public double getA()
   {
	   return real;
   }
   public double getB()
   {
	   return imag;
   }
}