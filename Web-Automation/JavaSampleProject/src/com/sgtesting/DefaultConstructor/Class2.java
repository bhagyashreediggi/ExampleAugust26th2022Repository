package com.sgtesting.DefaultConstructor;
class DesktopDetails
{
	String BrandName;
	String ComputerPart;
	int Price;
	int InstalledMemory;
	
}
class LaptopDetails
{
	String BrandName;
	String LaptopName;
	int Price;
	int InstalledMemory;
}
class MobileDetails
{
	String BrandName;
	String MobileName;
	int Price;
	int InstalledMemory;
}

public class Class2 {

	public static void main(String[] args) {
		DesktopDetails o = new DesktopDetails();
		o.BrandName="Dell";
		o.ComputerPart="Moniter";
		o.Price=46000;
		o.InstalledMemory=8;
		System.out.println("DesktopDetails");
		System.out.println("BrandName:"+o.BrandName);
		System.out.println("ComputerPart:"+o.ComputerPart);
		System.out.println("Price:"+o.Price);
		System.out.println("InstalledMemory:"+o.InstalledMemory);
		System.out.println("------------");
		
		
		 LaptopDetails ob = new  LaptopDetails();
		 ob.BrandName="HP Core I3 11th Gen";
		 ob.LaptopName="HP";
		 ob.Price=44200;
		 ob.InstalledMemory=8;
		 System.out.println("LaptopDetails");
		 System.out.println("BrandName:"+ob.BrandName);
		 System.out.println("LaptopName:"+ob.LaptopName);
		 System.out.println("Price:"+ob.Price);
		 System.out.println("InstalledMemory:"+ob.InstalledMemory);
		 System.out.println("-------------");
		 
		 
		 MobileDetails obb = new  MobileDetails();
		 obb.BrandName="Samsung";
		 obb.MobileName="MI";
		 obb.Price=15000;
		 obb.InstalledMemory=4;
		 System.out.println("MobileDetails");
		 System.out.println("BrandName:"+obb.BrandName);
		 System.out.println("MobileName:"+obb.MobileName);
		 System.out.println("Price:"+obb.Price);
		 System.out.println("InstalledMemory:"+obb.InstalledMemory);
	}
}
		 
	
