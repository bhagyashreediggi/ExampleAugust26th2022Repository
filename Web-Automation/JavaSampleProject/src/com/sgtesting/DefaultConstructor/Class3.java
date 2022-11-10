package com.sgtesting.DefaultConstructor;
class TwoWhillerDetailes
{
	String BrandName;
	String VehicalName;
	int Price;
	int ModelNumber;
}
class FourWhillerDetailes
{
	String BrandName;
	String VehicalName;
	int Price;
	int ModelNumber;

}
class HaveyVehicalDetailes
{
	String BrandName;
	String VehicalName;
	int Price;
	int ModelNumber;
	
}


public class Class3 {

	public static void main(String[] args) {
	TwoWhillerDetailes o = new TwoWhillerDetailes();
	o.BrandName="Hero Honda";
	o.VehicalName="Mestro";
	o.Price=100000;
	o.ModelNumber=2000;
	System.out.println("TwoWhillerDetailes");
	System.out.println("BrandName:"+o.BrandName);
	System.out.println("VehicalName:"+o.VehicalName);
	System.out.println("Price:"+o.Price);
	System.out.println("ModelNumber:"+o.ModelNumber);
	System.out.println("-------------");
	
	
	 FourWhillerDetailes ob = new  FourWhillerDetailes();
	 ob.BrandName="TaTa";
	 ob.VehicalName="Indica";
	 ob.Price=500000;
	 ob.ModelNumber=2001;
	 System.out.println("FourWhillerDetailes");
	 System.out.println("BrandName:"+ob.BrandName);
	 System.out.println("VehicalName:"+ob.VehicalName);
	 System.out.println("Price:"+ob.Price);
	 System.out.println("ModelNumber:"+ob.ModelNumber);
	 System.out.println("--------------");
	 
	 
	 HaveyVehicalDetailes obb = new HaveyVehicalDetailes();
	 obb.BrandName="Mahindra Limited";
	 obb.VehicalName="Tractor";
	 obb.Price=600000;
	 obb.ModelNumber=2002;
	 System.out.println("HaveyVehicalDetailes");
	 System.out.println("BrandName:"+obb.BrandName);
	 System.out.println("VehicalName:"+obb.VehicalName);
	 System.out.println("Price:"+obb.Price);
	 System.out.println("ModelNumber:"+obb.ModelNumber);
	}
}
	 
	 
	 
	
	 
	
	
		
		
		

	


