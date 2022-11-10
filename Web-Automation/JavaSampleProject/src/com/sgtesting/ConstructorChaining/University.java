package com.sgtesting.ConstructorChaining;
class University1
{
	University1(String unlocation)
	{
		System.out.println("Location Name:"+unlocation);
	}
	University1(int uncode)
	{
		this("BELGUM");
		System.out.println("University code:"+uncode);
	}
	University1(String belongs,char Grade) 
	{
		System.out.println("belongs:"+belongs+ "Grade"+Grade);
	}
}

public class University {

	public static void main(String[] args) {
		 University1 ss = new  University1(327);
		

	}

}
