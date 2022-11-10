package com.sgtesting.PatternAssignmentDoWhileloop;

public class Pattern5 {

	public static void main(String[] args) {
		int k=1;
		int i=1;
		do
		{
			int j=1;
			do 
			{
			System.out.print(k+" ");
			j++;
			k++;
			}while(j<=i);

			System.out.println();
			i++;
			}while(i<=5);

	}

}


	


