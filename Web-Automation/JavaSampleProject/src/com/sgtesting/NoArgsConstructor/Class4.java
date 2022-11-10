package com.sgtesting.NoArgsConstructor;
class Animals
{
	String NameOfTheAnimal;
	String BreedName;
	String Colour;
	String NickName;
	Animals()
	{
		NameOfTheAnimal="Dog";
		BreedName="Golden Retreiver";
		Colour="Gold";
		NickName="Puppy";
		System.out.println("Animals");
		System.out.println("NameOfTheAnimal:"+NameOfTheAnimal);
		System.out.println("BreedName:"+BreedName);
		System.out.println("Colour:"+Colour);
		System.out.println("NickName:"+NickName);
		System.out.println("----------");
	}
	
}
class Vegetables
{
	String NameOfTheVegetable;
	int Calories;
	double Fat;
	double Nutrients;
	Vegetables()
	{
		NameOfTheVegetable="Carrot";
		Calories=52;
		Fat=0.17;
		Nutrients=0.2;
		System.out.println("Vegetables");
		System.out.println("NameOfTheVegetable:"+NameOfTheVegetable);
		System.out.println("Calories:"+Calories);
		System.out.println("Fat:"+Fat);
		System.out.println("Nutrients:"+Nutrients);
		System.out.println("----------");
		
	}
}
class Fruits
{
	String NameOfTheFruit;
	String Nutrients;
	String Colour;
	int Price;
	Fruits()
	{
	NameOfTheFruit="Apple";
	Nutrients="Vitamin B3";
	Colour="Red";
	Price=100;
	System.out.println("Fruits");
	System.out.println("NameOfTheFruit:"+NameOfTheFruit);
	System.out.println("Nutrients:"+Nutrients);
	System.out.println("Colour:"+Colour);
	System.out.println("Price:"+Price);
	System.out.println("-----------");
	}
}
class Flowers
{
	String NameOfTheFlower;
	String Colour;
	String Uses;
	int NoOfPatals;
	Flowers()
	{
		NameOfTheFlower="Hibiscus";
		Colour="Red";
		Uses="Medicine";
		NoOfPatals=5;
		System.out.println("Flowers");
		System.out.println("NameOfTheFlower:"+NameOfTheFlower);
		System.out.println("Colour:"+Colour);
		System.out.println("Uses:"+Uses);
		System.out.println("NoOfPatals:"+NoOfPatals);
		
		
		
	}
}


public class Class4 {

	public static void main(String[] args) {
		Animals o = new Animals();
		
		
		
		Vegetables ob = new Vegetables();
		
		
		Fruits obb = new Fruits();
		
		
		Flowers obbb = new Flowers();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		

	}

}
