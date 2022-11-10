package inheritance;
//WAP for Hybrid inheritance
class Maths01
{
	void division(int x,int y)
	{
	  int res=(x/y);
	  System.out.println("Division Result:"+res);
	}
}
class Maths02 extends Maths01
{
	void multiplication(int x,int y)
	{
		int res=(x*y);
		System.out.println("Multiplication Result:"+res);
	}
}
class Maths03 extends Maths01
{
	void substraction(int x,int y)
	{
		int res=(x-y);
		System.out.println("Substraction Result:"+res);
	}
}
class Maths04 extends Maths03
{
	void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println("Addition Result:"+res);
	}
}

public class Question3 {
   public static void main(String[] args) {
	   Maths02 o=new Maths02();
	   o.division(20, 4);
	   o.multiplication(4, 5);
	   
	   Maths04 o1=new Maths04();
	   o1.division(20, 4);
	   o1.substraction(20,5);
	   o1.addition(10,20);
	   
		}

}
