package packagecom.sgtesting.interfaceAssignmen;
interface Employee
{
	void showEmployeeName(String name);
}
interface Department
{
	void displayDepartmentName(String name);
}
interface Student
{
	void showStudentName(String name);
}
interface Library
{
	void displayLibraryName(String name);
}
class Sports implements Employee,Department,Student,Library
{
	public void showEmployeeName(String name)
	{
		System.out.println("Employee Name:"+name);
	}
	public void displayDepartmentName(String name)
	{
		System.out.println("Department name:"+name);
	}
	public void showStudentName(String name)
	{
		System.out.println("Student Name:"+name);
	}
	public void displayLibraryName(String name)
	{
		System.out.println("Library Name:"+name);
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		Sports o=new Sports();
		o.showEmployeeName("Santhosh");
		o.displayDepartmentName("Sales");
		o.showStudentName("Karan");
		o.displayLibraryName("City Central Library");
	

	}

}
