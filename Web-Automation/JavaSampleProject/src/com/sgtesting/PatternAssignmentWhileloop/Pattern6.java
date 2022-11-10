package com.sgtesting.PatternAssignmentWhileloop;

public class Pattern6 {

	public static void main(String[] args) {
		int k=2;
		int i=1;
		while(i<=5)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print(k+" ");
				j++;
				k=k+2;
				
			}
			System.out.println();
			i++;
		}
	}
}
			


	


