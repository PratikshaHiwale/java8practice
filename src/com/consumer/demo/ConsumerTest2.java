package com.consumer.demo;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
	String ename;
	long salary;
	String gender;

	public Employee(String ename, long salary, String gender) {
		super();
		this.ename = ename;
		this.salary = salary;
		this.gender = gender;
	}

}

public class ConsumerTest2 {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee("smith", 30000, "male"));
		employees.add(new Employee("john", 40000, "male"));
		employees.add(new Employee("siya", 50000, "female"));
		employees.add(new Employee("robert", 60000, "male"));
		// calculate bonus and return it
		Function<Employee, Long> f = e -> (e.salary * 10 / 100);
		// check bonus is less than 5000
		Predicate<Long> p = bonus -> (bonus < 5000);
		// print the employee details
		Consumer<Employee> c = emp -> {
			System.out.println(emp.ename + " " + emp.salary + " " + emp.gender);
		};

		for (Employee e : employees) {
			Long bonus = f.apply(e);

			if (p.test(bonus)) {
				c.accept(e);
			}
		}

	}
}
