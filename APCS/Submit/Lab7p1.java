/*
   Jonathan Rittmayer

   LAB 7 PART 1
*/
public class Lab7p1 {
	
	public static void main(String args[])
	{
		int a = 0, finnum = 0;
		String[] symb = {"$","!","@","%","^","&","*","[","]","+"};
		
		System.out.println(" Choose a two digit number. Then subtract the sum of the digits from the number. I will guess your symbol!");
		System.out.println("");
		finnum = (int)(Math.random()*10);
		for(int i = 1; i <100; i ++)	
		{	
			if (i%9==0)
			{
				System.out.print("\t" + i +":"+ symb[finnum] );
			}
			else
			{
				a = (int)(Math.random()*10);
				System.out.print("\t" + i +":"+ symb[a] );	
			}
		}
		System.out.println("");
		System.out.println("");
		System.out.println("Your symbol is: " + symb[finnum]);
		System.out.println("");
	}
}	
