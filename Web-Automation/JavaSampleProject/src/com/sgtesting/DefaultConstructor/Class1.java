package com.sgtesting.DefaultConstructor;
//Create a class for employee,department,insurance and
//execute the members of each class
class EmployeeDetails
{
	String EmployeeName;
	int age;
	String Designation;
	int dateofadimission;
	
}

class Departmentdetails
{
	String Nameofthedepartment;
	int DepartmentCode;
	String HOD;
	int NoOfStaffs;
}
class InsuranceDetails
{
	String InsuranceCompany;
	String NameoftheInsuranceHolder;
	int Amount;
	int Renewal;
}

public class Class1 {

	public static void main(String[] args) {
		EmployeeDetails o = new EmployeeDetails();
		o.EmployeeName="Bhagya";
		o.age=21;
		o.Designation="Student";
		o.dateofadimission=2021;
		System.out.println("EmployeeDetails");
		System.out.println("EmployeeName:"+o.EmployeeName);
		System.out.println("age:"+o.age);
		System.out.println("Designation:"+o.Designation);
		System.out.println("dateodadmission:"+o.dateofadimission);
		System.out.println("------------");


		Departmentdetails ob = new  Departmentdetails();
		ob.Nameofthedepartment="civil";
		ob.DepartmentCode=54;
		ob.HOD="Sanjaya D";
		ob.NoOfStaffs=8;
		System.out.println(" Departmentdetails");
		System.out.println("Nameofthedepartment:"+ob.Nameofthedepartment);
		System.out.println("DepartmentCode:"+ob.DepartmentCode);
		System.out.println("HOD:"+ob.HOD);
		System.out.println("NoOfStaffs:"+ob.NoOfStaffs);
		System.out.println("-------------");


        InsuranceDetails obb = new  InsuranceDetails();
		obb.InsuranceCompany="Life Insurance";
		obb.NameoftheInsuranceHolder="shridhr";
		obb.Amount=20000;
		obb.Renewal=3;
		System.out.println(" InsuranceDetails");
		System.out.println("InsuranceCompany:"+obb.InsuranceCompany);
		System.out.println("NameoftheInsuranceHolder:"+obb.NameoftheInsuranceHolder);
		System.out.println("Amount:"+obb.Amount);
		System.out.println("Renewal:"+obb.Renewal);
	}
}

























