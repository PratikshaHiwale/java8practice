package com.stream.methods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedTest {
	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(2,4,6,8,1,3,2,5,7,9,0);
		//sorted
		List<Integer> sortedList=list1.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		//reverse sort
		List<Integer> reverseSortedList=list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverseSortedList);
		
		List<String> list2=Arrays.asList("java", "python", "groovy", "scala");
		List<String> sortedList2=list2.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList2);
		//reverse
		list2.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);;
	}

}
