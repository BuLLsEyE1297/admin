package com.chainsys.nestedclass.employee;

public class TestEmployee {
	public static void main(String[] args) {
		
	
	Employee employee=new Employee();
	employee.empid=100;
	employee.name = "james";
	employee.department=new Department();
	employee.department.deptid=1001;
	employee.department.name="functional";
	System.out.println(employee.empid+"   "+employee.department.name);
	
	}
}
