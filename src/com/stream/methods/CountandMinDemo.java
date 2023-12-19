package com.stream.methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CountandMinDemo {
public static void main(String[] args) {
	List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	//find the number of even numbers 
	long count=numbers.stream().filter(number->number%2==0).count();
	System.out.println(count);
	
	//min 
	Optional<Integer> minVal=numbers.stream().min((val1,val2)->{
		return val1.compareTo(val2);
		});
	System.out.println(minVal.get());
	
	//max
	Optional<Integer>maxVal=numbers.stream().max((val1,val2)->{
		return val1.compareTo(val2);
	});
	System.out.println(maxVal.get());
	
}
}
