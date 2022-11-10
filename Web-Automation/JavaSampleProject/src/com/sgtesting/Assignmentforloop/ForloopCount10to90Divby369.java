package com.sgtesting.Assignmentforloop;

public class ForloopCount10to90Divby369 {

	public static void main(String[] args) {
		int count=0;
		for(int i=10;i<=90;i++)
		{
			if((i%3==0)&&(i%6==0)&&(i%9==0))
			{
			count++;
			}
		}
		System.out.println(count);

	}

}
