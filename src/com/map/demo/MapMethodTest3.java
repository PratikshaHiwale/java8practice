package com.map.demo;

import java.util.Arrays;
import java.util.List;

public class MapMethodTest3 {
	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(3,4,6,7,9);
		/*
		 * for(int number:numbers) { System.out.println("square of "+ number+" is "
		 * +number*number); }
		 */
		numbers.stream().map(number->("square of the "+number+" is "+number*number)).forEach(System.out::println);
	}

}
