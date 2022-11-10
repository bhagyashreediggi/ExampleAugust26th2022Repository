package com.sgtesting.NoArgsConstructor;
class DesktopDetails
{
	String BrandName;
	String ComputerPart;
	int Price;
	int InstalledMemory;
	DesktopDetails()
	{
		BrandName="Dell";
		ComputerPart="Moniter";
		Price=46000;
		InstalledMemory=8;
		System.out.println("DesktopDetails");
		System.out.println("BrandName:"+BrandName);
		System.out.println("ComputerPart:"+ComputerPart);
		System.out.println("Price:"+Price);
		System.out.println("InstalledMemory:"+InstalledMemory);
		System.out.println("------------");

	}
	
}
class LaptopDetails
{
	String BrandName;
	String LaptopName;
	int Price;
	int InstalledMemory;
	LaptopDetails()
	{
		BrandName="HP Core I3 11th Gen";
		 LaptopName="HP";
		 Price=44200;
		 InstalledMemory=8;
		 System.out.println("LaptopDetails");
		 System.out.println("BrandName:"+BrandName);
		 System.out.println("LaptopName:"+LaptopName);
		 System.out.println("Price:"+Price);
		 System.out.println("InstalledMemory:"+InstalledMemory);
		 System.out.println("-------------");
		 
	}
}
class MobileDetails
{
	String BrandName;
	String MobileName;
	int Price;
	int InstalledMemory;
	MobileDetails()
	{
		 BrandName="Samsung";
		 MobileName="MI";
		 Price=15000;
		 InstalledMemory=4;
		 System.out.println("MobileDetails");
		 System.out.println("BrandName:"+BrandName);
		 System.out.println("MobileName:"+MobileName);
		 System.out.println("Price:"+Price);
		 System.out.println("InstalledMemory:"+InstalledMemory);
	}
	
}

public class Class2 {

	public static void main(String[] args) {
		DesktopDetails o = new DesktopDetails();
		
		
		 LaptopDetails ob = new  LaptopDetails();
		 
		 
		 MobileDetails obb = new  MobileDetails();
	}
}
		 
	
