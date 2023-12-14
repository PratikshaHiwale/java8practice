package com.streams.filterdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTest2 {
	public static void main(String[] args) {
		List<String> namesList=Arrays.asList("Pratik", "Dnyandev", "Kishore", "Shreya", "Anuradha");
		List<String> longNames=new ArrayList<>();
		/*
		 * longNames=namesList.stream().filter(name->name.length()>6 &&
		 * name.length()<8).collect(Collectors.toList()); System.out.println(longNames);
		 */
		//namesList.stream().filter(name->name.length()>4 && name.length()<7).forEach(name->System.out.println(name));
		namesList.stream().filter(name->name.length()>4 && name.length()<7).forEach(System.out::println);
	}

}
