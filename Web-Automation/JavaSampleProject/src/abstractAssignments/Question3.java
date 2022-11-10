package abstractAssignments;
//There is a abstract class,abstract class contains static methods
//WAP to execute the static methods
abstract class method
{
	static void dn(String name)
	{
		System.out.println("Name:"+name);
	}
	
}
class method1 extends method
{
	method1()
	{
		super();
	}
}

public class Question3 {

	public static void main(String[] args) {
		method1 obj=new method1();
		obj.dn("bhagya");
		

	}

}
