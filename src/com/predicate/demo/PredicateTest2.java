package com.predicate.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employee {
	int eid;
	String ename;
	long salary;

	public Employee(int eid, String ename, long salary) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

}

public class PredicateTest2 {
	public static void main(String[] args) {
	   
	List<Employee> employees=new ArrayList<>();
	employees.add(new Employee(101,"smith",300000));
	employees.add(new Employee(102,"alex",400000));
	employees.add(new Employee(103,"john",500000));
	Predicate<Employee> p=e->(e.salary>300000);
	
	for(Employee employee:employees) {
		if(p.test(employee)) {
			System.out.println(employee.ename);
		}
		
	}
	
	
}
}
