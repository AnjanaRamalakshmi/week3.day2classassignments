package week3.classroomassignment2;

public class College extends University

{	@override 
	public void ug()
	{
		System.out.println("ug method");
	}
	public static void main(String[] args) {
		College college = new College();
		college.ug();
		college.pg();
		
	}
} 
	
