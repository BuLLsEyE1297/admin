package com.chainsys.emp.category;

import java.util.Scanner;

public class TestEmployeeproject {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Project project = new Project();
		project.proid = 100;
		project.proname = "robin";

		project.employee = new Employee[2];
		for (int i = 0; i < 2; i++) {
			Employee e = new Employee();
			e.empid = scanner.nextInt();
			e.name = scanner.next();
			project.employee[i] = e;
		}

		// project
		System.out.println("Project Details");
		System.out.println(project.proid + "-" + project.proname);
		
		System.out.println("Employee Details");
		Employee [] emp = project.employee;
		for (Employee employee : emp) {
			System.out.println(employee.empid + "-" + employee.name);
		}

		scanner.close();
	}
}
