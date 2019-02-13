public class Median
{
	public double median(int[] a)
{	

	double median = 0;
	
	if (a.length%2 != 0)
	median = (int) (a[(a.length)/2]);
	else
	median = (double) ((a[a.length/2] + (double)a[(a.length/2)-1])/2);
	
	return median; 




}
public static void main(String[] args)
{
	Median prog = new Median();
	int[] a1 = {1,3,4,5,8};
	int[] a2 = {1,3,4,8};
	System.out.print(" 1st ans: " +prog.median(a1));
	System.out.println(" 2nd ans: "+prog.median(a2));
}
}	