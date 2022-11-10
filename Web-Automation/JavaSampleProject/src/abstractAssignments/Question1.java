package abstractAssignments;
//If an abstract class contains parameterized constructor 
//WAP to execute the parameterized constructor
abstract class College
{
	College(String name)
	{
		System.out.println("Name:"+name);
	}
}
class Teacher7 extends College
{

	Teacher7(String name)
	{
		super(name);
		
	}
	
}

public class Question1 {
    public static void main(String[] args) {
    	Teacher7 obj=new Teacher7("PDA Engg College");
		

	}

}
