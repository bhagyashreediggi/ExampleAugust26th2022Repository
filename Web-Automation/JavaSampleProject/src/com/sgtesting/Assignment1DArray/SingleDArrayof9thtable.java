package com.sgtesting.Assignment1DArray;

public class SingleDArrayof9thtable {

	public static void main(String[] args) {
		//find out the size of the array
		int count=0;
		int num=0;
		for(int i=1;i<=10;i++)
		{
			num=num*i;
			count++;
			
		}
		System.out.println(count);
		
		int arr[]=new int[count];
		int k=0;
		int a=9;
		for(int b=1;b<=10;b++)
		{
			arr[k]=a;
			k=k+1;
			System.out.println(a*b);
		}
		for(int j=arr.length;j>=0;j--)
		{
			System.out.println(arr[k]);
		}
		

	}
}


	


