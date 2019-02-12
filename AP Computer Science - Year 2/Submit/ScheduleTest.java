public class ScheduleTest
{
	public static void main(String[] args)
	{
		Schedule[] studentSchedules = new Schedule[3];
		
		studentSchedules[0] = new Schedule("Mickey","Mouse",14,9);
		studentSchedules[1] = new Schedule("Donald","Duck",15, 9);
		studentSchedules[2] = new Schedule("Bugs","Bunny",16,10);
		
// make Mickey's schedule
		studentSchedules[0].addCourse("Biology","Ricci");
		studentSchedules[0].addCourse("BC Calculus","Maas");
		studentSchedules[0].addCourse("English","Serensky");
// make Donald's schedule
		studentSchedules[1].addCourse("English","Serensky");
		studentSchedules[1].addCourse("BC Calculus","Maas");
		studentSchedules[1].addCourse("Computer","Petite");
		studentSchedules[1].addCourse("Lunch      ","NO TEACHER");
		studentSchedules[1].addCourse("Art      ","Serazin");		
// make Bug's schedule
		studentSchedules[2].addCourse("AB Calculus","Maas");
		studentSchedules[2].addCourse("Computer","Petite");
		studentSchedules[2].addCourse("Government","Brownlow");

		
		for(int i=0; i<studentSchedules.length; i++)
		// notice...below code automatically invokes toString
			System.out.println(studentSchedules[i]);
			
		System.out.println("The students enrolled in Computer\n");
		for(int i=0; i<studentSchedules.length; i++)
			if ( studentSchedules[i].findCourse("Computer") )
				System.out.println(studentSchedules[i].getStudent() );

		if (studentSchedules[1].addCourse("Health","Malone") )		
			System.out.println("Successfully added class:\n" + studentSchedules[1]);
		else
			System.out.println("\nCould not add Health class to this schedule:\n"
								+studentSchedules[1]);	

		studentSchedules[1].removeCourse(1);
		System.out.println("after removing course:\n"+studentSchedules[1]);
		
		if (studentSchedules[1].addCourse("Health","Malone") )		
			System.out.println("Successfully added class:\n" + studentSchedules[1]);
		else
			System.out.println("\nCould not add Health class to this schedule:\n"
								+studentSchedules[1]);	
	
	}	
}	 