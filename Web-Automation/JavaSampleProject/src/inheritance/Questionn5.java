package inheritance;

//WAP for multilevel inheritance in which super class contains constructor overloading
class StudentOld
{
	StudentOld(String name)
	{
		System.out.println("Name:"+name);
	}
	StudentOld(int age)
	{
		System.out.println("Age:"+age);
	}
}
class Student1 extends StudentOld
{

	Student1(String name)
	{
		super(name);

	}
	Student1(int age)
	{
		super(age);
	}

}
class Student2 extends Student1
{

	Student2(String name)
	{
		super(name);

	}
	Student2(int age)
	{
		super(age);
	}
}

	


public class Questionn5 {

	public static void main(String[] args) {
		Student2 o=new Student2("Kaveri");
		Student2 o1=new Student2(22);

		

	}

}
