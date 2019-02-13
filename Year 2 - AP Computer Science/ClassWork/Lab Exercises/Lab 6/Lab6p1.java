public class Lab6p1
{
	private int[] values;
	
	public static void main(String[] args)
	{
		Lab6p1 program = new Lab6p1();
		int[] vals;
		vals = program.readFile("lab6p1.dat");
		
		System.out.println("The sum is : "+ program.sum(vals));
		System.out.println("The maximum is : "+ program.max(vals));
		System.out.println("The minimum is : "+ program.min(vals));
		System.out.println("The average is : " + (double)program.sum(vals)/vals.length);
	}
	
	
	public int[] readFile(String fn)
	{
		EasyReader inFile;
		inFile = new EasyReader(fn);

		int numvals = inFile.readInt();
		System.out.println("number of values:" + numvals);
		System.out.println("The array contains");	
		
		values = new int[numvals];
		int i = 0, val;
		while(i < numvals && !inFile.eof())
		{
			val = inFile.readInt();
			System.out.println(val);
			if (!inFile.eof()){
				values[i] = val;
				i++;
			}
		}
		System.out.println();
		return values;
	}
		
	public int sum(int [] v)
		{
			int sum = 0;
			for(int i = 0; i<v.length; i++)
				sum += v[i];
		return sum;  // returned

		}	
		
	public int max(int[] v)
	{
		int max = v[0];
		for (int i = 0; i < v.length; i++)
			if (v[i]>max)
			max = v[i];
		return max;  // returned

	}
	public int min(int[] v)
	{
		int min = v[0];
		for (int i = 0; i < v.length; i++)
			if (v[i]<min)
			min = v[i];
		return min;  // returned

	}
							
			
}
