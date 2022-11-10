package com.sg.MethodsWhichHaveParameters;
//Write a method for a given 3*3 matrix and transpose it
class Matrix1
{
	void Transpose(int a[][],int b[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				b[i][j]=(a[i][j]);
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
}

public class Question4 {

	public static void main(String[] args) {
		int a[][]= {{2,4,6},{8,10,12},{14,16,18}};
		int b[][]=new int[a.length][a[0].length];
		Matrix1 T =new Matrix1();
		T.Transpose(a,b);
			
		

	}

}
