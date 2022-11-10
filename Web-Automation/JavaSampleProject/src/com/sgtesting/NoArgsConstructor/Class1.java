package com.sgtesting.NoArgsConstructor;
class EmployeeDetails
{
	String EmployeeName;
	int age;
	String Designation;
	int dateofadimission;
	EmployeeDetails()
	{
		EmployeeName="Bhagya";
		age=21;
		Designation="Student";
		dateofadimission=2021;
		System.out.println("EmployeeDetails");
		System.out.println("EmployeeName:"+EmployeeName);
		System.out.println("age:"+age);
		System.out.println("Designation:"+Designation);
		System.out.println("dateodadmission:"+dateofadimission);
		System.out.println("------------");	
	}
	
}

class Departmentdetails
{
	String Nameofthedepartment;
	int DepartmentCode;
	String HOD;
	int NoOfStaffs;
	Departmentdetails()
	{
		Nameofthedepartment="civil";
		DepartmentCode=54;
		HOD="Sanjaya D";
		NoOfStaffs=8;
		System.out.println(" Departmentdetails");
		System.out.println("Nameofthedepartment:"+Nameofthedepartment);
		System.out.println("DepartmentCode:"+DepartmentCode);
		System.out.println("HOD:"+HOD);
		System.out.println("NoOfStaffs:"+NoOfStaffs);
		System.out.println("-------------");	
	}
}
class InsuranceDetails
{
	String InsuranceCompany;
	String NameoftheInsuranceHolder;
	int Amount;
	int Renewal;
	InsuranceDetails()
	{
		InsuranceCompany="Life Insurance";
		NameoftheInsuranceHolder="shridhr";
		Amount=20000;
		Renewal=3;
		System.out.println(" InsuranceDetails");
		System.out.println("InsuranceCompany:"+InsuranceCompany);
		System.out.println("NameoftheInsuranceHolder:"+NameoftheInsuranceHolder);
		System.out.println("Amount:"+Amount);
		System.out.println("Renewal:"+
		Renewal);	
	}
}

public class Class1 {

	public static void main(String[] args) {
		EmployeeDetails o = new EmployeeDetails();
		
		Departmentdetails ob = new  Departmentdetails();
		


        InsuranceDetails obb = new  InsuranceDetails();
		
	}
}

























