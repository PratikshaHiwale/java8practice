package com.streams.filterdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterTest {
	public static void main(String[] args) {
		/*
		 * List<Integer> numbersList=new ArrayList<>(); numbersList.add(5);
		 * numbersList.add(10); numbersList.add(15); numbersList.add(20);
		 * numbersList.add(25);
		 */
		List<Integer> numbersList = Arrays.asList(5, 10, 15, 20, 25, 30);
		List<Integer> evenNumbersList = new ArrayList<>();
		// evenNumbersList=numbersList.stream().filter(n->n%2==0).collect(Collectors.toList());

		numbersList.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));

		// numbersList.stream().filter(n->n%2==0).forEach(System.out::println);

	}

}
