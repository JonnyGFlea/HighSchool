//***************************************\\
//			Jonathan Rittmayer 			 \\
//					P2					 \\
//			   Course.java				 \\
//										 \\	
//										 \\
//***************************************\\

public class Course
{
	
	//create two pieces of instance data
	//(Teacher name and Course name)
	private String teacherName;
	private String courseName;
	
	//Include two constructors for your class
	public Course(String t, String c)
	{
		teacherName = t;
		courseName = c;
	}
	//You need to provide two accessor methods:
	//getTeacher and getCourse.
	public String getTeacher()
	{
		return teacherName;
	}
	public String getCourse()
	{
		return courseName;
	}
	//Provide a toString method for your Course class.
	public String toString()
	{
		return "Course: " + courseName + "\t Teacher: " + teacherName;
	}
}