import java.util.*;

public class Character {
	
   private int age;
   private String name;
   private String gender;
   
   private String alignment;
   private String race;
   private String classType;

   private int level;
   private int experience;
   
   private ArrayList<String> backpack;
	
   public Character(int a1, String n, String g, String a2, String r, String c, int l1, int l2, ArrayList<String> b){
      age = a1; 
      name = n;
      gender = g;
      
      alignment = a2;
      race = r;
      classType = c;
      
      level = l1;
      experience =l2;
      
      backpack = b;     
    }
	
	public String getName()
	{
		return name;
	}
	public String getRace()
	{
		return race;
	}
	public String getClassType()
	{
		return classType;
	}
   public ArrayList<String> getBackpack()
	{
		return backpack;
	}
   
	public String setName(String n)
	{
		return name = n;
	}
	public String setRace(String r)
	{
		return race = r;
	}
	public String setClassType(String c)
	{
		return classType = c;
	}
   
   public void addBackpack(String b)
	{
      backpack.add(b);
	}	 
}