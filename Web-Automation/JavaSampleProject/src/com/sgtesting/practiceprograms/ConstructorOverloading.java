package com.sgtesting.practiceprograms;
class Birds
{
	Birds(String name)
	{
		System.out.println("Bird Name:"+name);
	}
	Birds(String colour,int numbers)
	{
		System.out.println("Bird Colour:"+colour+"Bird No:"+numbers);
	}


}

public class ConstructorOverloading {

	public static void main(String[] args) {
		Birds o=new Birds("Sparrow");
		Birds o1=new Birds("Black",50);
		
		

	}

}
