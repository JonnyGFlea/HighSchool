import cs1.*;
//***************************************\\
//			Jonathan Rittmayer 			 \\
//					P2					 \\
//			 CourseTest.java			 \\
//										 \\	
//										 \\
//***************************************\\

public class CourseTest
{
	public static void main(String[] args)
	{
	Course c1, c2;
	
	String teacherName, courseName;
	
	System.out.print("Enter teacher name: ");
	teacherName = Keyboard.readString();
	
	System.out.print("Enter course name: ");
	courseName = Keyboard.readString();
	
	
	c1 = new Course( teacherName, courseName );
	
	System.out.print("\n");

// more code here:  prompt user for information and
//                create second Course object
	
	System.out.print("Enter teacher name: ");
	teacherName = Keyboard.readString();
	
	System.out.print("Enter course name: ");
	courseName = Keyboard.readString();
	
	c2 = new Course( teacherName, courseName);
	System.out.print("\n");
	System.out.print("Your courses for this week are:");	
	
	System.out.print("\n");
	System.out.print(c1);
	
	System.out.print("\n");
	System.out.print(c2);
	System.out.println("\n");
		
	if ( c1.getTeacher().equals(c2.getTeacher() ) )
	{
		System.out.println(c1.getTeacher() + " teaches both " +
		                    c1.getCourse() + " and " + c2.getCourse() );
		                    
		System.out.print("\n");
	}	                    
	else
	{
		System.out.println(c1.getTeacher() + " and " + c2.getTeacher() + " don't teach the same course" );
		                    
		System.out.print("\n");
	}	   		
		
	}
}	
		