public class arrayexample
{
	public static void main(String[] args)
	{
		int[] arr; // declares arr to be an array of int values
		
		arr = new int[8]; //"new" tells the the array to have 8 spots (last spot is 7)
		
		for (int i = 0; i < arr.length; i++) 
			arr[i] = (int)(Math.random()*10);
			
		printArray(arr);
		
		int numeven = countEvens(arr);
		
		System.out.println("The number of evens : " + countEvens(arr));
			
	}
	
	public static void printArray(int[] v)
	{
		for (int j = 0; j<v.length; j++)
			System.out.println(v[j]); //identifier v allows you to call an element of an array
	
		
	}
	
	public static int countEvens(int[] A)
	{
		int count = 0;
		for (int k = 0; k < A.length; k++)
			if (A[k]%2==0) count ++;
		return count;	
	}		
}