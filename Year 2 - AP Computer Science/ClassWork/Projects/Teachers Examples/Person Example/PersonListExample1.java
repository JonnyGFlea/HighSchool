public class PersonListExample1
{
	public static void main(String[] args)
	{
		// using different arrays
		
		String[] firstNames;
		String[] lastNames = {"Mouse","Duck","Duck","Hook"};
		int[] ages = {15,20,12,53}; 
		
		firstNames = new String[4];
		
		firstNames[0] = "Mickey";
		firstNames[1] = "Donald";
		firstNames[2] = "Daisy";
		firstNames[3] = "Captain";
		
		
		for (int i = 0; i < ages.length; i++)
			System.out.println( firstNames[i] + "\t" + lastNames[i] + "\tAge : " + ages[i] );
			
	}
}		
		
		
		
	