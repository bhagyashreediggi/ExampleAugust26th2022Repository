package com.sg.MethodsWhichHaveParameters;
class Array2D
{
	void TwoArray(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<=0;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}

public class Question2Method {

	public static void main(String[] args) {
		int arr[][]= {{10,20,30},{40,50,60},{70,80,90}};
		Array2D obj=new Array2D();
		obj.TwoArray(arr);
		

	}

}
