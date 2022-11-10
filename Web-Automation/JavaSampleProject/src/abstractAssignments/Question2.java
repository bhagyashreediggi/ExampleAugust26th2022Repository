package abstractAssignments;
//In a multilevel inheritance super class is an abstract class 
//it has constructor overloading
abstract class Over1
{
	 Over1(String p)
	{
		System.out.println("Name:"+p);
	}
	 Over1(int q)
	 {
		 System.out.println("Name:"+q);
	 }
}
class Over2 extends Over1
{

	Over2(String p)
	{
		super(p);
		
	}
	Over2(int q)
	{
		super(q);
	}
	
}

class Over3 extends Over2
{
	Over3(String p)
	{
		super(p);
		
	}
	Over3(int q)
	{
		super(q);
	}
	
	
	
}
	

public class Question2 {

	public static void main(String[] args) {
		Over3 obj=new Over3("Kavya");
		Over3 obj1=new Over3(12);
		
		

	}

}
