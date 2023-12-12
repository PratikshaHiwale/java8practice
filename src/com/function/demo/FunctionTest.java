package com.function.demo;

import java.util.function.Function;

public class FunctionTest {
public static void main(String[] args) {
	/*
	 * Function<Integer,Integer> f=num->(num*num); System.out.println(f.apply(9));
	 */
	
	//take input as String value and retrun legth of the String
	Function<String,Integer> f=(name)->name.length();
	System.out.println(f.apply("Pratiksha"));
}
}
