package com.sgtesting.Assignmentdowhileloop;

public class Count10to90Div369 {

	public static void main(String[] args) {
		int i=10;
		int count=0;
		do
		{
			if((i%3==0)&&(i%6==0)&&(i%9==0))
			{
				count++;
			}
			i++;
		}while(i<=90);

		System.out.println(count);

	}

}










