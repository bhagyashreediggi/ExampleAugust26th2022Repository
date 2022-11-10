package com.sgtesting.ConstructorOverloading;
class LaptopDetailes
{
	LaptopDetailes(String brandname)
	{
		System.out.println("BrandName:"+brandname);
	}
	LaptopDetailes(int price)
	{
		System.out.println("Price:"+price);
	}
	LaptopDetailes(String Processor,double Version)
	{
		System.out.println("Processor:"+Processor+"Version:"+Version);
	}
}

public class Laptop {

	public static void main(String[] args) {
		LaptopDetailes o1 = new LaptopDetailes("Lenovo");
		LaptopDetailes o2 = new LaptopDetailes(37000);
		LaptopDetailes o3 = new LaptopDetailes("AMD A6",12.08);
		
		}

}
