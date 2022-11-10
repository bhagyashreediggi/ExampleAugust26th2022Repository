package com.sgtesting.Assignment1DArray;

public class Squareof1st10numbers1DArray {

	public static void main(String[] args) {
         int count=0;
         for(int i=1;i<=10;i++)
         {
        	 count++;
         }
         System.out.println(count);
         
         int arr[]=new int[count];
         for(int a=10;a>=1;a--)
         {
        	 int res=a*a;
        	 System.out.println(res);
         }
         
         for(int j=arr.length-1;j<=10;j++)
         {
        	 System.out.println(arr[j]);
         }

	}

}