package com.sgtesting.Assignment2DArray;

public class Double2DArray {

	public static void main(String[] args) {
		double arr[][]= {{10,20,30,40},{50,60,70,80},{90,100,110,120}};
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
