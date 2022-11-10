package packagecom.sgtesting.interfaceAssignmen;
interface Employee1
{
	void showEmployeeName(String name);
}
interface Department1
{
	void showDepartmentLocation(String Loc);
}
abstract class Student1
{
	void showStudentId(int Sid)
	{
		System.out.println("Student Id:"+Sid);
	}
}
class Library1 extends Student1 implements Employee1,Department1
{
	public void showEmployeeName(String name)
	{
		System.out.println("Employee Name:"+name);
	}
	public void showDepartmentLocation(String Loc)
	{
		System.out.println("Department Location:"+Loc);
	}
}



public class MultipleInheritenceDemo1 {

	public static void main(String[] args) {
		
				Library1 o=new Library1();
				o.showEmployeeName("Varun");
				o.showDepartmentLocation("Bengalore");
				o.showStudentId(121);
			}

		}

	
