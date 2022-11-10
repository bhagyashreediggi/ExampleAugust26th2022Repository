package com.sgtesting.Assignment1DArray;

public class Odd71to41SingleDArray {

	public static void main(String[] args) {
		//find out size of the array
		int count=0;
		for(int i=71;i>=41;i--)
		{
			if(i%2!=0)
			{
				count++;
			}
		}
		System.out.println("# of elements:"+count);
		
			//Declare 1D array
		int array[]=new int[count];
		
		//assign odd numbers into an array
		int k=0;
		for(int p=71;p>=41;p--)
		{
			if(p%2!=0)
			{
				array[k]=p;
				k=k+1;
			}
		}
		
		//read elements in reverse order
		for(int j=array.length-1;j>=0;j--)
		{
			System.out.println(array[j]);
		}

	}

}
