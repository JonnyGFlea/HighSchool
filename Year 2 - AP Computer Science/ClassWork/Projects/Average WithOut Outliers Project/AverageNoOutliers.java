public class AverageNoOutliers
{
// returns the average of the array WITHOUT including the
// minimum value and the maximum value
 
// For example, for the array shown above the method should
// average 82, 76, and 80, which would be 79.3333333

	public double averageNoOutliers(int[] nums)
{	

int max = nums[0], min = nums[0];
	double sum = 0, count = 0;
		for (int i = 0; i < nums.length; i++)
		{
			if (nums[i] < min)
				min = nums[i];
			if (nums[i] > max)
				max = nums[i];
		}
		for (int a = 0; a < nums.length; a++)
				if (nums[a] != min && nums[a] != max)
				{
					sum = sum + nums[a];
					count ++;
				}
	
	return (sum/count);





}
public static void main(String[] args)
{
	AverageNoOutliers prog = new AverageNoOutliers();
	int[] a1 = {90,82,76,70,80};
	System.out.print("Average " +prog.averageNoOutliers(a1));
}
}	