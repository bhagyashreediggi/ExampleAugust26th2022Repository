package com.sgtesting.NoArgsConstructor;
class Country
{
	String NameOfTheCountry;
	int PopulationOfCountry;
	int NoOfStates;
	int NoOfUnionTerrritories;
	Country()
	{
		NameOfTheCountry="India";
		PopulationOfCountry=1280000000;
		NoOfStates=28;
		NoOfUnionTerrritories=8;
		System.out.println("Country");
		System.out.println("NameOfTheCountry:"+NameOfTheCountry);
		System.out.println("PopulationOfCountry:"+PopulationOfCountry);
		System.out.println("NoOfStates:"+NoOfStates);
		System.out.println("NoOfUnionTerritories:"+NoOfUnionTerrritories);
		System.out.println("-----------");
		
	}
}
class State
{
	String NameOfTheState;
	int PopulationOfState;
	int NoOfDistict;
	String ChiefMinisterOfState;
	State()
	{
		NameOfTheState="Karnataka";
		PopulationOfState=6000000;
		ChiefMinisterOfState="Basavaraj Bommai";
		NoOfDistict=31;
		System.out.println("State");
		System.out.println("NameOfTheState:"+NameOfTheState);
		System.out.println("PopulationOfState:"+PopulationOfState);
		System.out.println("ChiefMinisterOfState:"+ChiefMinisterOfState);
		System.out.println("NoOfDistict:"+NoOfDistict);
		System.out.println("-----------");
	}
	
}
class District 
{
	String NameOfTheDistrict;
	int PopulationOfDistrict;
	int NoOfTaluka;
	String DistrinctCommisionerOfDistrict;
	District()
	{
		NameOfTheDistrict="Kalaburgi";
		PopulationOfDistrict=703000;
		NoOfTaluka=7;
		DistrinctCommisionerOfDistrict="Yeshwant V Gurukar";
		System.out.println("District");
		System.out.println("NameOfTheDistrict:"+NameOfTheDistrict);
		System.out.println("PopulationOfDistrict:"+PopulationOfDistrict);
		System.out.println("NoOfTaluka:"+NoOfTaluka);
		System.out.println("DistrinctCommisionerOfDistrict:"+DistrinctCommisionerOfDistrict);
		System.out.println("-----------");
		
	}
}
class Village
{
	String NameOfTheVillage;
	int PopulationOfVillage;
	int NoOfSchool;
	Village()
	{
		NameOfTheVillage="Rudrawadi";
		PopulationOfVillage=500;
		NoOfSchool=2;
		System.out.println("Village");
		System.out.println("NameOfTheVillage:"+NameOfTheVillage);
		System.out.println("PopulationOfVillage:"+PopulationOfVillage);
		System.out.println("NoOfSchool:"+NoOfSchool);
		}
}

public class Class6 {

	public static void main(String[] args) {
		Country o = new Country();
		
		State ob = new State();
		
		
		District obb = new District();
		
		
		Village obbb = new Village();
		
		}

}
