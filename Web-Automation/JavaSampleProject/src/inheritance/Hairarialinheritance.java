package inheritance;
class student11
{
	 student11(String s) 
	{
		System.out.println("Name:"+s);
	}
}
class library11 extends student11
{
	
library11(String s) 
{
		super(s);
		
	}
}


class sport11 extends student11
{

	sport11(String s)
	{
		super(s);
		
	}
	
}


public class Hairarialinheritance {
    public static void main(String[] args) {
    	sport11 o=new sport11("Priya");
    	library11 o1=new library11("Digital");
    


	}

}
