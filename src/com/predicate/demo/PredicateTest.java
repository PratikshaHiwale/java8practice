package com.predicate.demo;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		/*
		 * Predicate<Integer> p = num -> (num < 10); System.out.println(p.test(20));
		 */
		/*
		 * Predicate<Integer> p = num -> (num % 2 != 0); System.out.println(p.test(10));
		 */
		Predicate<String> p = name -> (name.length() > 3);

		String[] names = { "ram", "siya", "krishna", "sham" };
		// print the names whose length is greater than 3
		for (String name : names) {
			if (p.test(name)) {
				System.out.println(name);

			}

		}
	}

}
