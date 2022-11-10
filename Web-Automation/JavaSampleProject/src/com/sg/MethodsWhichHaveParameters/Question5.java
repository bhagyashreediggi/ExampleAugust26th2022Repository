package com.sg.MethodsWhichHaveParameters;
//Write a method for the given number it has display the respective table
class Maths
{
	void tables(int num)
	{
		for(int i=1;i<=10;i++)
		{
			int res=(i*num);
			System.out.println(num+"*"+i+"="+res);
		}
	}
}

public class Question5 {

	public static void main(String[] args) {
		Maths m=new Maths();
		m.tables(5);
		m.tables(8);
		

	}

}
