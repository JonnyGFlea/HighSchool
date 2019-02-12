public class Amount implements Measurable
{
	private int holes;
	 
	public Amount(int h)
    {
        holes = h;
    }
    public int getCurrentMeasure() 
    {
    	return holes;
    }
	
    public boolean sameMeasure(Measurable other)
    { 
    	if(getCurrentMeasure()==other.getCurrentMeasure())
    		return true;
    	else
    		return false; 
    }

      public static void main(String[] args)
   {    
   
    Measurable obj = new Amount(10);
    Measurable obj2 = new Amount(10);
    
    	if(obj.sameMeasure(obj2))
    		System.out.println("The objects are the same.  Good Job!  ");
    	else
    		System.out.println("The objects are not the same.  Try Again Next Time!  ");
	} 
    
}