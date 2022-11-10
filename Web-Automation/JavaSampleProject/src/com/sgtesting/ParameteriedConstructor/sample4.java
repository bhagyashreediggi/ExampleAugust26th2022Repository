package com.sgtesting.ParameteriedConstructor;
class Animal
{
	String NameOfTheAnimal;
	String BreedName;
	String Colour;
	String NickName;
	Animal(String an,String bn,String colour,String nn)
	{
		NameOfTheAnimal=an;
		BreedName=bn;
		Colour=colour;
		NickName=nn;
		System.out.println("Animals");
		System.out.println("NameOfTheAnimal:"+NameOfTheAnimal);
		System.out.println("BreedName:"+BreedName);
		System.out.println("Colour:"+Colour);
		System.out.println("NickName:"+NickName);
		System.out.println("----------");
		
		
	}
	
	
}
class Vegetable
{
	String NameOfTheVegetable;
	int Calories;
	double Fat;
	double Nutrients;
	Vegetable(String vn,int cl,double fat,double nts)
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
class Fruit
{
	String NameOfTheFruit;
	String Nutrients;
	String Colour;
	int Price;
	Fruit(String fn,String nts,String colour,int price)
	{
		NameOfTheFruit=fn;
		Nutrients=nts;
		Colour=colour;
		Price=price;
		System.out.println("Fruits");
		System.out.println("NameOfTheFruit:"+NameOfTheFruit);
		System.out.println("Nutrients:"+Nutrients);
		System.out.println("Colour:"+Colour);
		System.out.println("Price:"+Price);
		System.out.println("-----------");
	}
}
class Flower
{
	String NameOfTheFlower;
	String Colour;
	String Uses;
	int NoOfPatals;
	Flower(String fn,String colour,String us,int np)
	{
		NameOfTheFlower=fn;
		Colour=colour;
		Uses=us;
		NoOfPatals=np;
		System.out.println("Flowers");
		System.out.println("NameOfTheFlower:"+NameOfTheFlower);
		System.out.println("Colour:"+Colour);
		System.out.println("Uses:"+Uses);
		System.out.println("NoOfPatals:"+NoOfPatals);
		System.out.println("-----------");
		
		
		
	}
}

public class sample4 {

	public static void main(String[] args) {
		Animal p = new Animal("Dog","Golden Retreiver","Gold","Puppy");
		Animal pp = new Animal("Cat","Persian cat","White","Pretty");
		
		Vegetable s = new Vegetable("Carrot",52,0.17,0.2);
		Vegetable ss = new Vegetable("Cucumber",30,0.0,0.05);
		
		Fruit b = new Fruit("Apple","Vitamin b3","Red",100);
		Fruit bb = new Fruit("Orange","Vitamin C","Orange",80);
		
		Flower k = new Flower("Hibiscus","Red","Medicine",5);
		Flower kk = new Flower("Champa","Yellow","Perfume",3);
		
		
		
		
		
		
		

	}

}
