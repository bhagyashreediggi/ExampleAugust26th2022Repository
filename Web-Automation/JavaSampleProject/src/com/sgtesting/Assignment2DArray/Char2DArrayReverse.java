package com.sgtesting.Assignment2DArray;

public class Char2DArrayReverse {

	public static void main(String[] args) {
		 char arr[][]= {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
	        for(int i=arr.length-1;i>=0;i--)
	        {
	        	for(int j=arr[i].length-1;j>=0;j--)
	        	{
	        		System.out.print(arr[i][j]+" ");
	        	}
	        	System.out.println();
	        }
	        
		}

	}
