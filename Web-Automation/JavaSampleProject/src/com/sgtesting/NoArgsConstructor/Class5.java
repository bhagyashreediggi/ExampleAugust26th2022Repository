package com.sgtesting.NoArgsConstructor;
class Students
{
	String Name;
	String Branch;
	int Percentage;
	int PassingYear;
	Students()
	{
		Name="Bhagya";
		Branch="Civil";
		Percentage=75;
	    PassingYear=2022;
		System.out.println("Students");
		System.out.println("Name:"+Name);
		System.out.println("Branch:"+Branch);
		System.out.println("Percentage:"+Percentage);
		System.out.println("PassingYear:"+PassingYear);
		System.out.println("-------------");
	}
	
}
class University
{
    String Name;
    String Location;
    int EstablishedYear;
    int NoOfDepartments;
    University()
    {
    	Name="VTU";
		Location="Belagum";
		EstablishedYear=1950;
		NoOfDepartments=10;
		System.out.println("University");
		System.out.println("Name:"+Name);
		System.out.println("Location:"+Location);
		System.out.println("EstablishedYear:"+EstablishedYear);
		System.out.println("NoOfDepartments:"+NoOfDepartments);
		System.out.println("--------------");
		
    }
    
    
}
class Library
{
	String Name;
	String Location;
	int NoOfBooks;
	int NoOfStaffs;
	Library()
	{
		Name="Digital Library";
		Location="PDA COLLEGE KALABURGI";
		NoOfBooks=1000;
		NoOfStaffs=8;
		System.out.println("Library");
		System.out.println("Name:"+Name);
		System.out.println("Location:"+Location);
		System.out.println("NoOfBooks:"+NoOfBooks);
		System.out.println("NoOfStaffs:"+NoOfStaffs);
		System.out.println("-------------");
		
		
	}
	
}
class Sports
{
	String Name;
	int NoOfPlayers;
	int Scores;
	int Rank;
	Sports()
	{
		Name="Crickate";
		NoOfPlayers=11;
		Scores=236;
		Rank=2;
		System.out.println("Sports");
		System.out.println("Name:"+Name);
		System.out.println("NoOfPlayers:"+NoOfPlayers);
		System.out.println("Scores:"+Scores);
		System.out.println("Rank:"+Rank);
	}
}

public class Class5 {

	public static void main(String[] args) {
		Students k = new Students();
		
		University kk = new University();
		
		Library kkk = new Library();
		
		Sports kkkk = new Sports();
		
	}
}

		
		
		
				
		
		
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	


