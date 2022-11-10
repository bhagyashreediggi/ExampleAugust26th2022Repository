package com.sgtesting.DefaultConstructor;
class Country
{
	String NameOfTheCountry;
	int PopulationOfCountry;
	int NoOfStates;
	int NoOfUnionTerrritories;
}
class State
{
	String NameOfTheState;
	int PopulationOfState;
	int NoOfDistict;
	String ChiefMinisterOfState;
	
}
class District 
{
	String NameOfTheDistrict;
	int PopulationOfDistrict;
	int NoOfTaluka;
	String DistrinctCommisionerOfDistrict;
}
class Village
{
	String NameOfTheVillage;
	int PopulationOfVillage;
	int NoOfSchool;
}

public class Class6 {

	public static void main(String[] args) {
		Country o = new Country();
		o.NameOfTheCountry="India";
		o.PopulationOfCountry=1280000000;
		o.NoOfStates=28;
		o.NoOfUnionTerrritories=8;
		System.out.println("Country");
		System.out.println("NameOfTheCountry:"+o.NameOfTheCountry);
		System.out.println("PopulationOfCountry:"+o.PopulationOfCountry);
		System.out.println("NoOfStates:"+o.NoOfStates);
		System.out.println("NoOfUnionTerritories:"+o.NoOfUnionTerrritories);
		System.out.println("-----------");
		
		State ob = new State();
		ob.NameOfTheState="Karnataka";
		ob.PopulationOfState=6000000;
		ob.ChiefMinisterOfState="Basavaraj Bommai";
		ob.NoOfDistict=31;
		System.out.println("State");
		System.out.println("NameOfTheState:"+ob.NameOfTheState);
		System.out.println("PopulationOfState:"+ob.PopulationOfState);
		System.out.println("ChiefMinisterOfState:"+ob.ChiefMinisterOfState);
		System.out.println("NoOfDistict:"+ob.NoOfDistict);
		System.out.println("-----------");
		
		District obb = new District();
		obb.NameOfTheDistrict="Kalaburgi";
		obb.PopulationOfDistrict=703000;
		obb.NoOfTaluka=7;
		obb.DistrinctCommisionerOfDistrict="Yeshwant V Gurukar";
		System.out.println("District");
		System.out.println("NameOfTheDistrict:"+obb.NameOfTheDistrict);
		System.out.println("PopulationOfDistrict:"+obb.PopulationOfDistrict);
		System.out.println("NoOfTaluka:"+obb.NoOfTaluka);
		System.out.println("DistrinctCommisionerOfDistrict:"+obb.DistrinctCommisionerOfDistrict);
		System.out.println("-----------");
		
		
		Village obbb = new Village();
		obbb.NameOfTheVillage="Rudrawadi";
		obbb.PopulationOfVillage=500;
		obbb.NoOfSchool=2;
		System.out.println("Village");
		System.out.println("NameOfTheVillage:"+obbb.NameOfTheVillage);
		System.out.println("PopulationOfVillage:"+obbb.PopulationOfVillage);
		System.out.println("NoOfSchool:"+obbb.NoOfSchool);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
