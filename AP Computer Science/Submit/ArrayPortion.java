public class ArrayPortion
{
	public int[] arrayPortion(int[] original, int start, int end)
{	//precondition:  end >= start

int array[] = new int [end-start+1];
int pos=0;
for (int i=start; i<=end; i++)
{
	array[pos] = original[i];
	pos++;

}

return array;
}
public static void main(String[] args)
{
	ArrayPortion prog = new ArrayPortion();
	int[] a = {21,45,33,12,98,65,76};
	int[] result = prog.arrayPortion(a,1,3);
	for (int i = 0; i < result.length; i++)
		System.out.print(result[i] + " ");
	System.out.println();
}
}	