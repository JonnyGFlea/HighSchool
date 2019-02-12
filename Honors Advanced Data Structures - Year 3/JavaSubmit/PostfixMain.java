public class PostfixMain{
	
	public static void main(String[] args){ 
		//System.out.print("Infix: "); 
		String infix = "a+b-c*((d-e)/(a+d)-f)+g";
		System.out.println("Postfix: " + Postfix.convert(infix)); 
	}
}
