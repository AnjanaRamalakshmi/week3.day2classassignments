package week3.classroomassignment;

public class Desktop  implements Software
{

	public void softwareResource()
	{
		System.out.println("Software resource method");
		
	}
	public void desktopModel()
	{
		System.out.println("desktop model method");
		
	}
	public void hardwareResource()
	{
		System.out.println("Hardware resource method ");
	}
	public static void main(String[] args)
	{
		Desktop desktop = new Desktop();
		desktop.desktopModel();
		desktop.hardwareResource();
		desktop.softwareResource();
		
		
	}
	

}
