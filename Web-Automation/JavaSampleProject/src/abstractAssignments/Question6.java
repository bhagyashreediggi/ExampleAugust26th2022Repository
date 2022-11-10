package abstractAssignments;
//There are two abstract classes each class contains two abstract methods
//WAP to execute all available abstract methods
abstract class SS
{
	abstract void Ds(String s1,int i1);
	abstract void dd(String a,int b);

}
abstract class BB1
{
	abstract void cc(String s2,int i2) ;
	abstract void cd(String a1,int b1);
}
class cc extends SS
{
	ddd b=new ddd();

	
	void Ds(String s1,int i1)
	{
		System.out.println(s1+i1);
	}
	void dd(String a,int b)
	{
		System.out.println(a+b);
	}

	class ddd extends BB1
	{
		void cc(String s2,int i2)
		{
			System.out.println(s2+i2);
		}
		void cd(String a1,int b1)
		{
			System.out.println(a1+b1);
		}
	}
}



public class Question6 {
	public static void main(String[] args) {
		cc obj=new cc();
		obj.dd("hfh",456);
		obj.Ds("gchj", 57);
obj.b.cc("hvzdh", 44);
obj.b.cd("geacj", 368);

	}

}
