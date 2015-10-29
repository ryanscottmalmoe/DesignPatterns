//Ryan Malmoe
public class courseTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course myCourse = new Course();
		myCourse.addStudent(new Students(0, "john"));
		myCourse.addStudent(new Students(1, "smith"));
		myCourse.addStudent(new Students(2, "fred"));
		myCourse.addStudent(new Students(3, "jacob"));
		myCourse.addStudent(new Students(4, "bob"));
		myCourse.addStudent(new Students(5, "tony"));
		myCourse.addStudent(new Students(6, "stu"));
		myCourse.addStudent(new Students(7, "tom"));
		myCourse.addStudent(new Students(8, "chris"));
		for(Students str : myCourse)
		{
			System.out.println(str);
		}
		
	}

}
