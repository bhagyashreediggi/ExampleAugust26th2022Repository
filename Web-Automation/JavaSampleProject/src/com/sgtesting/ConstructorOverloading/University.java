package com.sgtesting.ConstructorOverloading;
class University1
{
	University1(String unlocation)
	{
		System.out.println("Location Name:"+unlocation);
	}
	University1(int uncode)
	{
		System.out.println("University code:"+uncode);
	}
	University1(String belongs,char Grade) 
	{
		System.out.println("belongs:"+belongs+ "Grade"+Grade);
	}
}
public class University {

	public static void main(String[] args) 
	{
		University1 name=new University1("BELGUM");
		University1 code=new University1(327);
		University1 grade=new University1("VTU",'A');

	}

}



