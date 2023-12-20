package com.stream.methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatTest {
	public static void main(String[] args) {
		List<String> list1=Arrays.asList("java","python","ruby","scala");
		List<String> list2=Arrays.asList("robert","paul","smith","john");
		Stream<String> stream1=list1.stream();
		Stream<String> stream2=list2.stream();
		
		Stream<String> concatStream=Stream.concat(stream1, stream2);
		concatStream.forEach(System.out::println);
	}

}
