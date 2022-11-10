package com.sgtesting.ParameteriedConstructor;
class TwoWhiller
{
	String BrandName;
	String VehicalName;
	int Price;
	int ModelNumber;
	TwoWhiller(String bn,String vn,int price,int mn)
	{
		BrandName=bn;
		VehicalName=vn;
		Price=price;
		ModelNumber=mn;
		System.out.println("TwoWhillerDetailes");
		System.out.println("BrandName:"+BrandName);
		System.out.println("VehicalName:"+VehicalName);
		System.out.println("Price:"+Price);
		System.out.println("ModelNumber:"+ModelNumber);
		System.out.println("-------------");
	}
}
class FourWhiller
{
	String BrandName;
	String VehicalName;
	int Price;
	int ModelNumber;
	FourWhiller(String bn,String vn,int price,int mn)
	{
		 BrandName=bn;
		 VehicalName=vn;
		 Price=price;
		 ModelNumber=mn;
		 System.out.println("FourWhillerDetailes");
		 System.out.println("BrandName:"+BrandName);
		 System.out.println("VehicalName:"+VehicalName);
		 System.out.println("Price:"+Price);
		 System.out.println("ModelNumber:"+ModelNumber);
		 System.out.println("--------------");
	}

}
class HaveyVehical
{
	String BrandName;
	String VehicalName;
	int Price;
	int ModelNumber;
	HaveyVehical(String bn,String vn,int price,int mn)
	{
		 BrandName=bn;
		 VehicalName=vn;
		 Price=price;
		 ModelNumber=mn;
		 System.out.println("HaveyVehicalDetailes");
		 System.out.println("BrandName:"+BrandName);
		 System.out.println("VehicalName:"+VehicalName);
		 System.out.println("Price:"+Price);
		 System.out.println("ModelNumber:"+ModelNumber);
		 System.out.println("----------");
	}
}


public class sample3 {

	public static void main(String[] args) {
		TwoWhiller o = new TwoWhiller("Hero Honda","Mestro",100000,2000);
		TwoWhiller on = new TwoWhiller("Bajaj","Suzuki",120000,2020);
		
		FourWhiller s = new FourWhiller("TaTa","Indica",500000,2001);
		FourWhiller sn = new FourWhiller("Mahindra","Beet",400000,2005);
		
		 HaveyVehical b = new HaveyVehical("Mahindra Limited","Tractor",600000,2002);
		 HaveyVehical bn = new HaveyVehical("Asok Limited","Truck",700000,2005);
		 
		 
		
		

	}

}
