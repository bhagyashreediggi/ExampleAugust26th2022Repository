package com.sgtesting.ParameteriedConstructor;


		class Desktop
		{
			String BrandName;
			String ComputerPart;
			int Price;
			int InstalledMemory;
			Desktop(String bn,String cp,int price,int im)
			{
				BrandName=bn;
				ComputerPart=cp;
				Price=price;
				InstalledMemory=im;
				System.out.println("DesktopDetails");
				System.out.println("BrandName:"+BrandName);
				System.out.println("ComputerPart:"+ComputerPart);
				System.out.println("Price:"+Price);
				System.out.println("InstalledMemory:"+InstalledMemory);
				System.out.println("------------");
			}
			
		}
		class Laptop
		{
			String BrandName;
			String LaptopName;
			int Price;
			int InstalledMemory;
			Laptop(String bn,String ln,int price,int im)
			{
				 BrandName=bn;
				 LaptopName=ln;
				 Price=price;
				 InstalledMemory=im;
				 System.out.println("LaptopDetails");
				 System.out.println("BrandName:"+BrandName);
				 System.out.println("LaptopName:"+LaptopName);
				 System.out.println("Price:"+Price);
				 System.out.println("InstalledMemory:"+InstalledMemory);
				 System.out.println("-------------");
				 
				 
			}
		}
		class Mobile
		{
			String BrandName;
			String MobileName;
			int Price;
			int InstalledMemory;
			Mobile(String bn,String mn,int price,int im)
			{
				BrandName=bn;
				 MobileName=mn;
				 Price=price;
				 InstalledMemory=im;
				 System.out.println("MobileDetails");
				 System.out.println("BrandName:"+BrandName);
				 System.out.println("MobileName:"+MobileName);
				 System.out.println("Price:"+Price);
				 System.out.println("InstalledMemory:"+InstalledMemory);
				 System.out.println("-------------");
			
			}
		}
		public class sample2 {

			public static void main(String[] args) {
				Desktop o = new Desktop("Dell","Moniter",46000,8);
				Desktop on = new Desktop("Lenovo","CPU",50000,8);
				
				Laptop k =new Laptop("HP Core I3 11th Gen","HP",44200,8);
				Laptop kn =new Laptop("Lenovo Core I3 11th Gen","LENOVA",40000,8);
				
				Mobile s =new Mobile("Samsung","MI",15000,4);
				Mobile sn =new Mobile("Apple","Moto",12000,4);


	}

}
