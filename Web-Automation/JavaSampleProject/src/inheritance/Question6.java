package inheritance;
//WAP for hybrid inheritance in which super class contains constructor overloading
class Student111
{
	Student111(String name)
	{
		System.out.println("Name:"+name);
	}
	Student111(int age)
	{
		System.out.println("Age:"+age);
	}
}
class Student22 extends Student111
{

	Student22(String name) 
	{
		super(name);
		
	}
	Student22(int age)
	{
		super(age);
	}

}
class Student33 extends Student111
{

	Student33(String name)
	{
		super(name);
		
	}
	Student33(int age)
	{
		super(age);
	}
	
}
class Student44 extends Student33
{
	Student44(String name)
	{
		super(name);
		
	}
	Student44(int age)
	{
		super(age);
	}
	
	
}

public class Question6 {

	public static void main(String[] args) {
		Student22 o=new Student22("Kavya");
		Student22 o1=new Student22(30);
		
		Student44 ob=new Student44("Priya");
		Student44 obj=new Student44(25);
		
		

	}

}
