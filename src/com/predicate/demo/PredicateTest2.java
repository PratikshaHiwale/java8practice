package com.predicate.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employee {
	String ename;
	long salary;
	int experience;

	public Employee(String ename, long salary, int experience) {

		this.ename = ename;
		this.salary = salary;
		this.experience = experience;
	}

}

public class PredicateTest2 {
	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee( "smith", 300000,2));
		employees.add(new Employee( "alex", 400000,3));
		employees.add(new Employee( "john", 500000,4));
		Predicate<Employee> p = e -> (e.salary > 300000&&e.experience<5);

		for (Employee employee : employees) {
			if (p.test(employee)) {
				System.out.println(employee.ename);
			}

		}

	}
}
