package com.sgtesting.Assignmentforloop;

public class ForloopCount30to90Divisibleby6 {

	public static void main(String[] args) {
		int count=0;
		for(int i=30;i<=90;i++)
		{
			if(i%6==0)
			{
				count++;
			}
		}
		System.out.println(count);

	}

}


