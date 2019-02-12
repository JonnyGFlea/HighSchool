public class PrintExample
{
	public static void main(String[] args)
	{
		int num;
		num = (int)2.4; 
		System.out.print("This\nwill\nprint\non\ndifferent\nlines\n");
		System.out.println("this\twill\tbe\ttabbed\toutput");
		System.out.println("if you need to print \" marks, you have to use" +
                                    " an escape sequence.");
		System.out.println(num);
	}
}