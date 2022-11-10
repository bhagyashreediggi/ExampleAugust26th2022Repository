package com.sgtesting.ParameteriedConstructor;
class Country
{
	String countryname;
	String capitalcity;
	int noofstates;
	String nationalsports;
	 Country(String a,String b,int c,String d)
	 {
		 countryname=a;
			capitalcity=b;
			noofstates=c;
			nationalsports=d;
			System.out.println("Country Name:"+a);
			System.out.println("Capitalcity:"+b);
			System.out.println("No of States:"+c);
			System.out.println("National sports:"+d);
			System.out.println("**************************"); 
	 }
}
class State
{
	String statename;
	String stateanimal;
	int noofdistricts;
	String statebird;
	State(String a,String b,int c,String d)
	{
		statename=a;
		stateanimal=b;
		noofdistricts=c;
		statebird=d;
		System.out.println("State Name:"+a);
		System.out.println("State Animal:"+b);
		System.out.println("No of Districts:"+c);
		System.out.println("State Bird:"+d);
		System.out.println("----------------------------");
	}
}
class District
{
	String districtname;
	String nationalparkpresent;
	String university;
	int nooftaluks;
	District(String a,String b,String c,int d)
	{
		districtname=a;
		nationalparkpresent=b;
		university=c;
		nooftaluks=d;
		System.out.println("District Name:"+a);
		System.out.println("National Park Present:"+b);
		System.out.println("University:"+c);
		System.out.println("No of Taluks:"+d);
		System.out.println("*****************************");
	}
}
public class sample6 {
public static void main(String[] args) { 
	Country a=new Country("India","Delhi",30,"hockey");
	Country a1=new Country("sri lanka","columbia",30,"tennis");
	Country a2=new Country("pakisthan","lahor",30,"vollyball");
	
	State b=new State("karnataka","elephant",31,"gandabaruda");
	State b1=new State("Thamil nadu","cow",37,"spparow");
	State b2=new State("mharastra","tiger",30,"huming");
	
	District c=new District("hassan","jxiw","mysore university",7);
	District c1=new District("mandya","jkjx","mysore university",9);
	District c2=new District("thumkur","jxiwjk","mysore university",5);
	}
}


