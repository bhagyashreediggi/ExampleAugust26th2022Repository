package com.sgtesting.Assignmentwhileloop;

public class CountNumbers30to90Divby6 {

	public static void main(String[] args) {
		int count=0;
		int i=30;
		while(i<=90)
		{
			if(i%6==0)
			{
			count++;
			}
			i++;
		}
		

		System.out.println(count); 

	}
}





