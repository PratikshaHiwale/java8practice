package com.map.demo;

import java.util.Arrays;
import java.util.List;

class Employee {
	int empNo;
	String ename;
	double salary;

	public Employee(int empNo, String ename, double salary) {
		super();
		this.empNo = empNo;
		this.ename = ename;
		this.salary = salary;
	}

}

public class MapAndFilterTest {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(102, "smith", 250000), new Employee(102, "john", 300000),
				new Employee(103, "robert", 400000));
		employees.stream().filter(employee->employee.salary<400000).map(employee-> employee.ename).forEach(System.out::println);
	}

}
