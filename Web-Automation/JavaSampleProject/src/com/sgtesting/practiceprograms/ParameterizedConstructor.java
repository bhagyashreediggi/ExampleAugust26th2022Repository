package com.sgtesting.practiceprograms;
class Sports
{
	String sportname;
	int score;
	Sports(String sname,int Score)
	{
		sportname=sname;
		score=Score;
		System.out.println("SportName:"+sportname);
		System.out.println("Scores:"+score);
		
	}
}

public class ParameterizedConstructor {

	public static void main(String[] args) {
		Sports o=new Sports("Crickate",6);


	}

}
