public class Schedule
{
	private Student theStudent;
	private Course[] courses;
	
	
	public Schedule(String fName, String lastName, int age, int grade)
	{
		theStudent = new Student(fName,lastName,age,grade);
		courses = new Course[5];
		// we will add the actual courses later
	}
	
	public Student getStudent() //accessor method
	{
		return theStudent;
	}

	
	public boolean addCourse(String courseName, String teachName)// modifier method
	{
	//adds a course to this student's schedule in the first open spot
	//    returns true if course is successfully added
	//    returns false if cannot add course (schedule already full)
	 
	// find empty spot
		int loc = findEmpty(); //CODE NEEDED HERE - invoke a method
		if (loc == -1)
			return false;   //schedule full
		
		
		else
		{
		courses[loc] = new Course(teachName, courseName);	//CODE NEEDED HERE	
		}
			return true;
	
	
	
	}
	
	
	private int findEmpty()
	{
		for(int k = 0; k < courses.length; k++)
			if(courses[k]==null)			// returns location of first empty spot in student schedule, or -1 if schedule full
			{
				return k;
			}
		return -1;
	}

	public boolean findCourse(String courseName)
	{
		// returns true if courseName in this student's schedule
		for(int k = 0; k < courses.length;k++)
			if (courses[k]!=null && courseName.equals(courses[k].getCourse()))
			{
				return true;
			}
		return false;
		//WRITE CODE HERE
		
		
	}				
		
	
	public void removeCourse(int loc)
	{
		courses[loc] = null; // remove the Course object stored at loc (mark it as null)
		
		
		
	}
	public String toString()
	{
		String sched="Schedule for : " + theStudent +"\n";
		for (int i = 0; i < courses.length; i++)
			if ( courses[i] != null )
				sched += "Period " + (i+1) + " : " +courses[i]+"\n";
		return sched;		
		
	}

}