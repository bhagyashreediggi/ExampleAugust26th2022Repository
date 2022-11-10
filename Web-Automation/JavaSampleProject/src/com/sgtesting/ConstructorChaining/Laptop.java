package com.sgtesting.ConstructorChaining;
class LaptopDetailes
{
	LaptopDetailes(String brandname)
	{
		System.out.println("BrandName:"+brandname);
	}
	LaptopDetailes(int price)
	{
		this("Lenovo");
		System.out.println("Price:"+price);
	}
	LaptopDetailes(String Processor,double Version)
	{
		System.out.println("Processor:"+Processor+"Version:"+Version);
	}
}

public class Laptop {

	public static void main(String[] args) {
		 LaptopDetailes o1 = new  LaptopDetailes(37000);
		}

}
