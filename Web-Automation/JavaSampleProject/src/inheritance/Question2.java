package inheritance;
//WAP for multilevel inheritance
class Calculation1
{
	void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println("Addition Result:"+res);
	}
}
class Calculation2 extends Calculation1
{
	void substraction(int x,int y)
	{
		int res=(x-y);
		System.out.println("Substraction Result:"+res);
	}
}
class Calculation3 extends Calculation2
{
	void division(int x,int y)
	{
		int res=(x/y);
		System.out.println("Division Result:"+res);
	}
}


public class Question2 {
  public static void main(String[] args) {
	  Calculation3 o=new Calculation3();
	  o.addition(10, 10);
	  o.substraction(20, 10);
	  o.division(20, 2);
		

	}

}
