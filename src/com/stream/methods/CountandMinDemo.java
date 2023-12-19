package com.stream.methods;

import java.util.Arrays;
import java.util.List;

public class CountandMinDemo {
public static void main(String[] args) {
	List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	//find the number of even numbers 
	long count=numbers.stream().filter(number->number%2==0).count();
	System.out.println(count);
}
}
