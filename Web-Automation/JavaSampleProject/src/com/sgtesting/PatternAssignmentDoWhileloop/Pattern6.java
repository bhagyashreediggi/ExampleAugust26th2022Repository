package com.sgtesting.PatternAssignmentDoWhileloop;

public class Pattern6 {

	public static void main(String[] args) {
		int k=2;
		int i=1;
		do
		{
			int j=1;
			do 
			{
			System.out.print(k+" ");
			j++;
			k=k+2;
			}while(j<=i);

			System.out.println();
			i++;
			}while(i<=5);

	}

}


	


