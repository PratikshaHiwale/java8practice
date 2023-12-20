package com.stream.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMethodsTest {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("ram", "smith", "aastha","mahi");
	
		//findAny()
		Optional<String>str=names.stream().findAny();
		System.out.println(str.get());
		
		//findFirst
		str=names.stream().findFirst();
		System.out.println(str.get());
	}

}
