package com.sgtesting.ConstructorChaining;
class LibraryDetailes
{
	LibraryDetailes(String NameOfTheLibrary)
	{
		System.out.println("Library Name:"+NameOfTheLibrary);
	}
	LibraryDetailes(int NoOfBooks)
	{
		this("Digitl Library");
		System.out.println("Number Of Books:"+NoOfBooks);
	}
	LibraryDetailes(String location,int NoOfStaffs)
	{
		System.out.println("Location:"+location+"Number Of Staffs:"+NoOfStaffs);
	}
	
}

public class Library {

	public static void main(String[] args) {
		LibraryDetailes o1 =new LibraryDetailes(1000);
		

	}

}
