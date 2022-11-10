package com.sgtesting.ParameteriedConstructor;
class Student
{
	String Name;
	String Branch;
	int Percentage;
	int PassingYear;
	Student(String name,String branch,int pg,int py)
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
class Universityy
{
    String Name;
    String Location;
    int EstablishedYear;
    int NoOfDepartments;
    Universityy(String name,String lc,int ey,int nd)
    {
    	Name=name;
		Location=lc;
		EstablishedYear=ey;
		NoOfDepartments=nd;
		System.out.println("University");
		System.out.println("Name:"+Name);
		System.out.println("Location:"+Location);
		System.out.println("EstablishedYear:"+EstablishedYear);
		System.out.println("NoOfDepartments:"+NoOfDepartments);
		System.out.println("--------------");
    }
    
    
    
}

class Libraryy
{
	String Name;
	String Location;
	int NoOfBooks;
	int NoOfStaffs;
	Libraryy(String name,String loc,int nob,int nos)
	{
	    Name=name;
		Location=loc;
		NoOfBooks=nob;
		NoOfStaffs=nos;
		System.out.println("Library");
		System.out.println("Name:"+Name);
		System.out.println("Location:"+Location);
		System.out.println("NoOfBooks:"+NoOfBooks);
		System.out.println("NoOfStaffs:"+NoOfStaffs);
		System.out.println("-------------");
		
	}
	
}
class Sport
{
	String Name;
	int NoOfPlayers;
	int Scores;
	int Rank;
	Sport(String name,int nop,int srs,int rk)
	{
		Name=name;
		NoOfPlayers=nop;
		Scores=srs;
		Rank=rk;
		System.out.println("Sports");
		System.out.println("Name:"+Name);
		System.out.println("NoOfPlayers:"+NoOfPlayers);
		System.out.println("Scores:"+Scores);
		System.out.println("Rank:"+Rank);
		System.out.println("---------");
	
	}
}
public class sample5 {

	public static void main(String[] args) {
		Student k = new Student("Bhagya","Civil",75,2022);
		Student kk = new Student("Kamala","CS",70,2021);
		
		Universityy s = new Universityy("VTU","Belagum",1950,10);
		Universityy ss = new Universityy("JNTU","Hydrabad",1941,8);
		
		Libraryy n = new Libraryy("Digital Library","PDA College Kalaburgi",1000,8);
		Libraryy nn = new Libraryy("School Library","Camlin Hampinagar",500,6);
		
		Sport c = new Sport("Crickate",11,236,2);
		Sport cc = new Sport("FootBall",20,2,3);
		
		
		
		
		

	}

}
