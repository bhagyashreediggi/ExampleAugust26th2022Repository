package com.sgtesting.DefaultConstructor;
class Students
{
	String Name;
	String Branch;
	int Percentage;
	int PassingYear;
	
}
class University
{
    String Name;
    String Location;
    int EstablishedYear;
    int NoOfDepartments;
    
    
}
class Library
{
	String Name;
	String Location;
	int NoOfBooks;
	int NoOfStaffs;
	
}
class Sports
{
	String Name;
	int NoOfPlayers;
	int Scores;
	int Rank;
}

public class Class5 {

	public static void main(String[] args) {
		Students k = new Students();
		k.Name="Bhagya";
		k.Branch="Civil";
		k.Percentage=75;
		k.PassingYear=2022;
		System.out.println("Students");
		System.out.println("Name:"+k.Name);
		System.out.println("Branch:"+k.Branch);
		System.out.println("Percentage:"+k.Percentage);
		System.out.println("PassingYear:"+k.PassingYear);
		System.out.println("-------------");
		
		
		University kk = new University();
		kk.Name="VTU";
		kk.Location="Belagum";
		kk.EstablishedYear=1950;
		kk.NoOfDepartments=10;
		System.out.println("University");
		System.out.println("Name:"+kk.Name);
		System.out.println("Location:"+kk.Location);
		System.out.println("EstablishedYear:"+kk.EstablishedYear);
		System.out.println("NoOfDepartments:"+kk.NoOfDepartments);
		System.out.println("--------------");
		
		Library kkk = new Library();
		kkk.Name="Digital Library";
		kkk.Location="PDA COLLEGE KALABURGI";
		kkk.NoOfBooks=1000;
		kkk.NoOfStaffs=8;
		System.out.println("Library");
		System.out.println("Name:"+kkk.Name);
		System.out.println("Location:"+kkk.Location);
		System.out.println("NoOfBooks:"+kkk.NoOfBooks);
		System.out.println("NoOfStaffs:"+kkk.NoOfStaffs);
		System.out.println("-------------");
		
		
		Sports kkkk = new Sports();
		kkkk.Name="Crickate";
		kkkk.NoOfPlayers=11;
		kkkk.Scores=236;
		kkkk.Rank=2;
		System.out.println("Sports");
		System.out.println("Name:"+kkkk.Name);
		System.out.println("NoOfPlayers:"+kkkk.NoOfPlayers);
		System.out.println("Scores:"+kkkk.Scores);
		System.out.println("Rank:"+kkkk.Rank);
	}
}

		
		
		
				
		
		
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	


