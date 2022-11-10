package inheritance;
//WAP for multilevel inheritance in which super
//class contains parameterized constructor
class Employee
{
	Employee(String ename)
	{
		System.out.println("Employee Name:"+ename);
	
	}
	
}
class Department extends Employee
{

	Department(String ename)
	{
		super(ename);
	
	}
	
}
	
class Department1 extends Department
{

	Department1(String ename)
	{
		super(ename);
		
	}
	
}


public class Question4 {
    public static void main(String[] args) {
    	Department1 o=new Department1("Bhagya");
    	
		

	}

}
