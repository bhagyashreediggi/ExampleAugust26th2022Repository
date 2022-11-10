package abstractAssignments;
//In a multiple inheritance super class and sub class are abstract class
//All 3 classes contains same static variable name.WAP to execute all 3 variables
abstract class Super
{
	abstract void display();
	static String name;
	void displayname()
	{
		System.out.println("Its super: "+name);
	}
}
abstract class Sub extends Super
{	
	static String name;
	void show(String s1,String s2)
	{
		name=s1;
		super.name=s2;
		System.out.println("Its subclass name: "+name);
	}
}
class Sub1 extends Sub
{
	static String name;
	void assign(String s1,String s2,String s3)
	{
		super.show(s2, s3);
		name=s1;
		System.out.println("Its subclass name: "+name);
	}
	void display()
	{
		System.out.println("Its abstarct method");
	}	

}
public class Question8 {
	public static void main(String[] args) {
		Sub1 s=new Sub1();
		s.assign("Baghya","Ranganath", "Suhas");
		s.display();
		s.displayname();
	}

}
