package inheritance;
//WAP for multilevel inheritance in which all class contains same variable name
class Teacher
{
	String name;
	void show1()
	{
		System.out.println("Name in Teacher class:"+name);
	}
}
class Teacher1 extends Teacher
{
	String name;
	Teacher1(String s1,String s2)
	{
		super.name=s1;
		name=s2;
	}
	void show2()
	{
		System.out.println("Name in Teacher1 class:"+name);
	}
}
class Teacher2 extends Teacher1
{
    String name;
	Teacher2(String s1, String s2,String s3) 
	{
		super(s1, s2);
		name=s3;
		
	}
	void show3()
	{
		System.out.println("Name in Teacher2 class:"+name);
	}
	
}

public class Question8 {
    public static void main(String[] args) {
    	Teacher2 o=new Teacher2("Neha","Kavya","Priya");
    	o.show1();
    	o.show2();
    	o.show3();
		}

}
