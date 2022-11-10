package com.sgtesting.NoArgsConstructor;
class TwoWhillerDetailes
{
	String BrandName;
	String VehicalName;
	int Price;
	int ModelNumber;
	TwoWhillerDetailes()
	{
		BrandName="Hero Honda";
		VehicalName="Mestro";
		Price=100000;
		ModelNumber=2000;
		System.out.println("TwoWhillerDetailes");
		System.out.println("BrandName:"+BrandName);
		System.out.println("VehicalName:"+VehicalName);
		System.out.println("Price:"+Price);
		System.out.println("ModelNumber:"+ModelNumber);
		System.out.println("-------------");
		
		
	}
}
class FourWhillerDetailes
{
	String BrandName;
	String VehicalName;
	int Price;
	int ModelNumber;
	FourWhillerDetailes()
	{
		 BrandName="TaTa";
		 VehicalName="Indica";
		 Price=500000;
		 ModelNumber=2001;
		 System.out.println("FourWhillerDetailes");
		 System.out.println("BrandName:"+BrandName);
		 System.out.println("VehicalName:"+VehicalName);
		 System.out.println("Price:"+Price);
		 System.out.println("ModelNumber:"+ModelNumber);
		 System.out.println("--------------");
		 
	}

}
class HaveyVehicalDetailes
{
	String BrandName;
	String VehicalName;
	int Price;
	int ModelNumber;
	HaveyVehicalDetailes()
	{
		BrandName="Mahindra Limited";
		 VehicalName="Tractor";
		 Price=600000;
		 ModelNumber=2002;
		 System.out.println("HaveyVehicalDetailes");
		 System.out.println("BrandName:"+BrandName);
		 System.out.println("VehicalName:"+VehicalName);
		 System.out.println("Price:"+Price);
		 System.out.println("ModelNumber:"+ModelNumber);
		
	}
	
}


public class Class3 {

	public static void main(String[] args) {
	TwoWhillerDetailes o = new TwoWhillerDetailes();
	
	 FourWhillerDetailes ob = new  FourWhillerDetailes();
	
	 
	 HaveyVehicalDetailes obb = new HaveyVehicalDetailes();
	}
}
	 
	 
	 
	
	 
	
	
		
		
		

	


