package com.sgtesting.Assignmentdowhileloop;

public class CountNumbers30to90Div6 {

	public static void main(String[] args) {
		int i=30;
		int count=0;
		do
		{
			if(i%6==0)
			{
				count++;
			}
			i++;
		}while(i<=90);

		System.out.println(count);

	}

}





