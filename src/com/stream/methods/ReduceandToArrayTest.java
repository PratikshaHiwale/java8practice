package com.stream.methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceandToArrayTest {
	public static void main(String[] args) {
		List<String> stringList=Arrays.asList("A","B","C","1","2","3");
		//reduce()
		Optional<String> reduced=stringList.stream().reduce((value,combinedValue)->{
			return combinedValue+value;
		});
		System.out.println(reduced.get());
		//toArray
		Object[] array=stringList.stream().toArray();
		System.out.println(array.length);
		 
		for(Object obj:array) {
			System.out.println(obj);
		}
		
	}
  
}
