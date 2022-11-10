package inheritance;
class student
{
	void student1(String name)
	{
		System.out.println("Student Name:"+name);
	}
}
class library extends student
{
	void library1(int NoOfBooks)
	{
		System.out.println("NumberOfBooks:"+NoOfBooks);
	}
}
class sports extends library
{
	void sports1(String sname)
	{
		System.out.println("Sport Name:"+sname);
	}
}

public class Multilevelinheritance {

	public static void main(String[] args) {
		sports o=new sports();
		o.student1("ss");
		o.library1(100);
		o.sports1("kk");
				
	

	}

}
