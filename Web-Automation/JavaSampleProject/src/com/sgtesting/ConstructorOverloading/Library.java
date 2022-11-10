package com.sgtesting.ConstructorOverloading;
class LibraryDetailes
{
	LibraryDetailes(String NameOfTheLibrary)
	{
		System.out.println("Library Name:"+NameOfTheLibrary);
	}
	LibraryDetailes(int NoOfBooks)
	{
		System.out.println("Number Of Books:"+NoOfBooks);
	}
	LibraryDetailes(String location,int NoOfStaffs)
	{
		System.out.println("Location:"+location+"Number Of Staffs:"+NoOfStaffs);
	}
	
}

public class Library {

	public static void main(String[] args) {
		LibraryDetailes o1 = new LibraryDetailes("Digital Libarary");
		LibraryDetailes o2 = new LibraryDetailes(1000);
		LibraryDetailes o3 = new LibraryDetailes("PDA Engg College Kalburgi:",8);
		
		
		

	}

}
