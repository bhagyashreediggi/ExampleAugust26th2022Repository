package com.sgtesting.ParameteriedConstructor;
class Employee
{
	String EmployeeName;
	int age;
	String Designation;
	int dateofadimission;
	Employee(String en,int Age,String ds,int da)
	{
		EmployeeName=en;
		age=Age;
		Designation=ds;
		dateofadimission=da;
		System.out.println("EmployeeDetails");
		System.out.println("EmployeeName:"+EmployeeName);
		System.out.println("age:"+age);
		System.out.println("Designation:"+Designation);
		System.out.println("dateodadmission:"+dateofadimission);
		System.out.println("------------");
	}
	
}
class Department
{
	String Nameofthedepartment;
	int DepartmentCode;
	String HOD;
	int NoOfStaffs;
	Department(String dn,int dc,String hod,int ns)
	{
		Nameofthedepartment=dn;
		DepartmentCode=dc;
		HOD=hod;
		NoOfStaffs=ns;
		System.out.println(" Departmentdetails");
		System.out.println("Nameofthedepartment:"+Nameofthedepartment);
		System.out.println("DepartmentCode:"+DepartmentCode);
		System.out.println("HOD:"+HOD);
		System.out.println("NoOfStaffs:"+NoOfStaffs);
		System.out.println("-------------");
	}
}
class Insurance
{
	String InsuranceCompany;
	String NameoftheInsuranceHolder;
	int Amount;
	int Renewal;
	Insurance(String ic,String in,int amount,int rn)
	{
        InsuranceCompany=ic;
		NameoftheInsuranceHolder=in;
		Amount=amount;
		Renewal=rn;
		System.out.println(" InsuranceDetails");
		System.out.println("InsuranceCompany:"+InsuranceCompany);
		System.out.println("NameoftheInsuranceHolder:"+NameoftheInsuranceHolder);
		System.out.println("Amount:"+Amount);
		System.out.println("Renewal:"+Renewal);
		System.out.println("----------");
	}
}
public class sample1 {

	public static void main(String[] args) {
		Employee o1 = new Employee("Bhagya",21,"Student",2019);
		Employee o2 = new Employee("Anu",25,"Employee",2016);
		
		Department ob = new  Department("civil",54,"Sanjaya D",8);
		Department obb = new  Department("Mechanical",55,"Jagadevi D",6);
		
		Insurance os = new Insurance("Life Insurance","shridhar",20000,3);
		Insurance oss = new Insurance("Health Insurance","bhagyashree",30000,4);


	}

}
