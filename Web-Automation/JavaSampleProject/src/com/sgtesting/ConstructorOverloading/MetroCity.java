package com.sgtesting.ConstructorOverloading;
class MetroCity1
{
	MetroCity1(String cname)
	{
		System.out.println("CityName:"+cname);
	}
	MetroCity1(int NOS)
	{
		System.out.println("Number Of Stations:"+NOS);
	}
	MetroCity1(String SOB,int NOT)
	{
		System.out.println("Station Owned By:"+SOB+"Number Of Tracks:"+NOT);
	}
}

public class MetroCity {

	public static void main(String[] args) {
		MetroCity1 jk = new MetroCity1("Banglore");
		MetroCity1 jk1 = new MetroCity1(50);
		MetroCity1 jk2 = new MetroCity1("BMRCL",2);


	}

}
