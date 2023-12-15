package com.map.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethodTest {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("siya", "raj", "smith", "robert");
		// convert the names to upper case
		List<String> upperCaseNames = new ArrayList<>();

		/*
		 * //before java8 for(String name:names) { upperCaseNames.add(
		 * name.toUpperCase()); } System.out.println(upperCaseNames);
		 */

		//upperCaseNames = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		//System.out.println(upperCaseNames);
		names.stream().map(name->name.toUpperCase()).forEach(System.out::println);

	}
}
