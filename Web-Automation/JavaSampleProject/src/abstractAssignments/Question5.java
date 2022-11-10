package abstractAssignments;
//In a hybrid inheritance superclass is an abstract class and it has some
//abstract method of the super class based on the subclass object
abstract class Metro
{
	abstract void Mt(String m1,int km);
	
}
class Metro1 extends Metro
{
	void Mt(String m1,int km)
	{
		System.out.println(m1);
		System.out.println(km);
	}
		
}
class Metro2 extends Metro1
{
	/*void Mt(String m1,int km)
	{
		System.out.println(m1);
		System.out.println(km);
	}*/
		
}
class Metro3 extends Metro
{
	void Mt(String m1,int km)
	{
		System.out.println(m1);
		System.out.println(km);
	}
		
}

public class Question5 {
public static void main(String[] args) {
		Metro2 n=new Metro2();
		n.Mt("jevsj", 646);
		Metro3 b=new Metro3();
		b.Mt("hdvh", 56);

	}

}
