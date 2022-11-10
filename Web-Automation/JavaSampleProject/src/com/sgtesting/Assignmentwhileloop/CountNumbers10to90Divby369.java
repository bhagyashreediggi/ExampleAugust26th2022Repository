package com.sgtesting.Assignmentwhileloop;

public class CountNumbers10to90Divby369 {

	public static void main(String[] args) {
		int count=0;
		int i=10;
		while(i<=90)
		{
			if((i%3==0)&&(i%6==0)&&(i%9==0))
			{
			count++;
			}i++;
		}
		System.out.println(count);

	}

}
