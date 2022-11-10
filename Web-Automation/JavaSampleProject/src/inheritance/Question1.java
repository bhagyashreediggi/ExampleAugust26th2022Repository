package inheritance;
//WAP for Heirarichal Inheritance
class Maths1
{
	void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println("Addition Result:"+res);
	}
}
class Maths2 extends Maths1
{
	void substraction(int x,int y)
	{
		int res=(x-y);
	    System.out.println("Substraction Result:"+res);
	}
}
class Maths3 extends Maths1
{
	void division(int x,int y)
	{
		int res=(x/y);
		System.out.println("Division Result:"+res);
	}
}

public class Question1 {
    public static void main(String[] args) {
    	
    	Maths2 o=new  Maths2();
    	o.addition(10, 30);
    	o.substraction(50, 40);
    	
    	Maths3 o1=new Maths3();
    	o1.addition(10, 30);
    	o1.division(20,2);
		

	}

}
