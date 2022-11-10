package packagecom.sgtesting.interfaceAssignmen;
interface Teacher
{
	void showTeacherName(String name);
}
class Studentb implements Teacher
{
	public void showTeacherName(String name)
	{
		System.out.println("Teacher Name:"+name);
	}
}
interface Libraryb extends Teacher
{
	void ShowBookName(String name);
}
class Sportsb implements Libraryb
{
	public void ShowBookName(String name)
	{
		System.out.println("Book Name:"+name);
	}
	public void showTeacherName(String name) 
	{
		System.out.println("Teacher Name:"+name);
		
	}
}

public class HybridInheritence {

	public static void main(String[] args) {
		Studentb o=new Studentb();
		o.showTeacherName("Shankar");
		System.out.println("--------------------------------");
		Sportsb o1=new Sportsb();
		o1.ShowBookName("Core Java");
		o1.showTeacherName("Kavita");


	}

}

