package inheritance;

import inheritance.outter.inner;

class outter
{
	inner oo=new inner();
	void out()
	{
		
		int a=1;
		System.out.println(a);
	}
	class inner
	{
		
		void inner()
		{
			int a=4;
			System.out.println(a);	
		}

	}
}
public class Innerclass {

	public static void main(String[] args) {
		outter o=new outter();
		o.out();
		o.oo.inner();
	}

}
