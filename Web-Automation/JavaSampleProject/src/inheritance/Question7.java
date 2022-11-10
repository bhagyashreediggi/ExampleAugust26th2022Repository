package inheritance;
//WAP for multilevel inheritance in which all class contains same method
class Demo
{
	void display()
	{
		System.out.println("I am in demo class");
	}
	
	
}
class Demo1 extends Demo
{
	void display()
	{
		super.display();
		System.out.println("I am in demo1 class");
	}
	
}
class Demo2 extends Demo1
{
	void display()
	{
		super.display();
		System.out.println("I am in demo2 class");
	}
}

public class Question7 {
     public static void main(String[] args) {
    	 Demo2 o=new Demo2();
    	 o.display();
		

	}

}
