package com.sgtesting.Assignment2DArray;

public class Double2DArrayReverse {

	public static void main(String[] args) {
		double arr[][]= {{10,20,30,40},{50,60,70,80},{90,100,110,120}};
		for (int i=arr.length-1;i>=0;i--)
		{
			for(int j=arr[i].length-1;j>=0;j--)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}

	


