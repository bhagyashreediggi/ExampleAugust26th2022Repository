package abstractAssignments;
//An abstract class static block alone,WAP to execute the static block
abstract class AA
{
	
	static
	{
	System.out.println("addition");
	}
}
class BB extends AA
{
	BB()
	{
		super();
	}
}

public class Question4 {

	public static void main(String[] args) {
		BB obj=new BB();
		

	}

}
