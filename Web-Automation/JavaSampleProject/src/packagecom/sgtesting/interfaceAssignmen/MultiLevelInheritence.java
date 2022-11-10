package packagecom.sgtesting.interfaceAssignmen;
interface Studenta
{
	void showStudentName(String name);
}
interface  Librarya extends Studenta
{
	public void showStudentName(String name);
}
class Flower implements Librarya
{
	public void showStudentName(String name)
	{
		System.out.println("Student Name:"+name);
	}
	public void displayLibraryName(String name)
	{
		System.out.println("Library name:"+name);
	}
	void showFlowerName(String name)
	{
		System.out.println("Flower Name:"+name);
	}
}

public class MultiLevelInheritence {
public static void main(String[] args) {
	Flower o=new Flower();
	o.showStudentName("Arun Kumar");
	o.displayLibraryName("City Central Library");
	o.showFlowerName("Jasmeen");
		

	}

}
