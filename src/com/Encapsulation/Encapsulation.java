package com.Encapsulation;

class encapstulation123{
	private int employee_Id;
	private int employee_Salary;
	private String employee_Name;
	
	
	public void SetEmployeeId(int employee_Id ) {
		this.employee_Id=employee_Id;
		}
	public int GetEmployeeId() {
		return employee_Id;
	}
	
	public void SetEmployeeSalary(int employee_Salary) {
		
		this.employee_Salary=employee_Salary;
		
		}
	public int GetEmployeeSalary() {
		return employee_Salary;
		
	}
	
	public void SetEmployeeName(String employee_Name ) {
		this.employee_Name=employee_Name;
		
	}
	public String GetEmployeeName() {
		return employee_Name;
	}
}

public class Encapsulation {
	
	public static void main(String[] args) {
		encapstulation123 e=new encapstulation123();
		e.SetEmployeeId(101);
		System.out.println("my employee id is:"+e.GetEmployeeId());
		e.SetEmployeeSalary(30000);
		System.out.println("my monthly salary is:"+e.GetEmployeeSalary());
		e.SetEmployeeName("sirisha");
		System.out.println("my name is:"+e.GetEmployeeName());

	}

}
