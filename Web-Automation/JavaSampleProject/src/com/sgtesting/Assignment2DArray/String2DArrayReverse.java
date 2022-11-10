package com.sgtesting.Assignment2DArray;

public class String2DArrayReverse {

	public static void main(String[] args) {
		 String arr[][]= {{"apple","banana","orange"},{"coconut","mango","grapes"},{"papaya","pear","kiwi"}};
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

	
		
