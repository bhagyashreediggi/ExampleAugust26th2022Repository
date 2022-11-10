package abstractAssignments;
//In a multilevel inheritance super class and sub class are abstract class,
//All 3 classes contains same instance variable name,WAP to execute all 3 variables
abstract class flower
{
	String fn;
	void ds()
	{
		System.out.println(fn);
	}
}
abstract class colour extends flower
{
	String fn;
	colour(String f1,String f2)
	{
		super.fn=f1;
		this.fn=f2;
	}
	void ds1()
	{
		System.out.println(fn);
	}
}
class colour2 extends colour
{
    String fn;
	colour2(String f11,String f22,String f33)
	{
		super(f11, f22);
		this.fn=f33;
		
	}
	void ds2()
	{
		System.out.println(fn);
	}
	
}
public class Question7 {
public static void main(String[] args) {
	colour2 o=new colour2("Rose","Red","Pink");
	o.ds();
	o.ds1();
	o.ds2();
	}

}
