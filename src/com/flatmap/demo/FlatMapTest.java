package com.flatmap.demo;

import java.util.Arrays;
import java.util.List;

public class FlatMapTest {
public static void main(String[] args) {
	List<Integer> list1=Arrays.asList(1,2,3);
	List<Integer> list2=Arrays.asList(4,5,6);
	List<Integer> list3=Arrays.asList(7,8,9);
	
	List<List<Integer>> resultList=Arrays.asList(list1,list2,list3);
	resultList.stream().flatMap(list->list.stream().map(n->n+10)).forEach(list->System.out.println(list));
}
}
