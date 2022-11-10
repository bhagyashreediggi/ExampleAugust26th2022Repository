package com.sgtesting.practiceprograms;
class Overload
{
	 static void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println("Addition Result:"+res);
	}
	 static void addition(int x,int y,int z)
	{
		int res=(x+y+z);
		System.out.println("Addition Result:"+res);
	}
}


public class OverloadingStaticMethod {
    public static void main(String[] args) {
    	Overload.addition(10, 30);
    	Overload.addition(10, 20, 30);
    	
		

	}

}
