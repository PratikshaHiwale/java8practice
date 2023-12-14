package com.streams.filterdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTest3 {
	public static void main(String[] args) {
		List<String> words=Arrays.asList("java",null,"python","php",null,"ruby");
		//except null print all the values
		/*
		 * List<String>
		 * result=words.stream().filter(word->word!=null).collect(Collectors.toList())
		 * ; System.out.println(result);
		 */
		
		words.stream().filter(word->word!=null).forEach(System.out::println);
	}

}
