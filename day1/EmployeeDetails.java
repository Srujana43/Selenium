package week2.day1;

public class EmployeeDetails {
	public void printEmployeeName(String empName, int empId) 
	{

			System.out.println(empName);
			System.out.println(empId);
			}
		public void getEmployeeAddress(String empAddress)
		{

			System.out.println(empAddress);
		}
		public void printEmployeeSalary(double empSalary)
		{

			System.out.println(empSalary);
		}
		public void printEmployeeMobileNumber(long mobNum)
		{
			System.out.println(mobNum);
		}

public static void main(String[] args) 
		{
			EmployeeDetails c1=new EmployeeDetails();
			c1.printEmployeeName("Srujana",01);
		    c1.getEmployeeAddress("Thiruvur");
			c1.printEmployeeSalary(20000.121);
			c1.printEmployeeMobileNumber(6382823545l);


	
}
}
