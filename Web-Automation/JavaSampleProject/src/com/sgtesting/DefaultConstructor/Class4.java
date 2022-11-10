package com.sgtesting.DefaultConstructor;
class Animals
{
	String NameOfTheAnimal;
	String BreedName;
	String Colour;
	String NickName;
	
}
class Vegetables
{
	String NameOfTheVegetable;
	int Calories;
	double Fat;
	double Nutrients;
}
class Fruits
{
	String NameOfTheFruit;
	String Nutrients;
	String Colour;
	int Price;
}
class Flowers
{
	String NameOfTheFlower;
	String Colour;
	String Uses;
	int NoOfPatals;
}


public class Class4 {

	public static void main(String[] args) {
		Animals o = new Animals();
		o.NameOfTheAnimal="Dog";
		o.BreedName="Golden Retreiver";
		o.Colour="Gold";
		o.NickName="Puppy";
		System.out.println("Animals");
		System.out.println("NameOfTheAnimal:"+o.NameOfTheAnimal);
		System.out.println("BreedName:"+o.BreedName);
		System.out.println("Colour:"+o.Colour);
		System.out.println("NickName:"+o.NickName);
		System.out.println("----------");
		
		
		Vegetables ob = new Vegetables();
		ob.NameOfTheVegetable="Carrot";
		ob.Calories=52;
		ob.Fat=0.17;
		ob.Nutrients=0.2;
		System.out.println("Vegetables");
		System.out.println("NameOfTheVegetable:"+ob.NameOfTheVegetable);
		System.out.println("Calories:"+ob.Calories);
		System.out.println("Fat:"+ob.Fat);
		System.out.println("Nutrients:"+ob.Nutrients);
		System.out.println("----------");
		
		
		Fruits obb = new Fruits();
		obb.NameOfTheFruit="Apple";
		obb.Nutrients="Vitamin B3";
		obb.Colour="Red";
		obb.Price=100;
		System.out.println("Fruits");
		System.out.println("NameOfTheFruit:"+obb.NameOfTheFruit);
		System.out.println("Nutrients:"+obb.Nutrients);
		System.out.println("Colour:"+obb.Colour);
		System.out.println("Price:"+obb.Price);
		System.out.println("-----------");
		
		
		Flowers obbb = new Flowers();
		obbb.NameOfTheFlower="Hibiscus";
		obbb.Colour="Red";
		obbb.Uses="Medicine";
		obbb.NoOfPatals=5;
		System.out.println("Flowers");
		System.out.println("NameOfTheFlower:"+obbb.NameOfTheFlower);
		System.out.println("Colour:"+obbb.Colour);
		System.out.println("Uses:"+obbb.Uses);
		System.out.println("NoOfPatals:"+obbb.NoOfPatals);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		

	}

}
