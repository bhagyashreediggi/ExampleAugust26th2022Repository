package com.sgtesting.Assignment1DArray;

public class SingelDArray100to150divby4 {

	public static void main(String[] args) {
		//find out size of the array
				int count=0;
				for(int i=100;i<=150;i++)
				{
					if(i%4==0)
					{
						count++;
					}
				}
				System.out.println("# of elements:"+count);
				
					//Declare 1D array
				int array[]=new int[count];
				
				//assign numbers into an array
				int k=0;
				for(int p=100;p<=150;p++)
				{
					if(p%4==0)
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


	


