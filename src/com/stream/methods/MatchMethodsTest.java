package com.stream.methods;

import java.util.HashSet;
import java.util.Set;

public class MatchMethodsTest {
public static void main(String[] args) {
	Set<String> fruits=new HashSet<>();
	fruits.add("one apple");
	fruits.add("one mango");
	fruits.add("two banana");
	fruits.add("three starfruits");
	
	//anyMatch()
	boolean result=fruits.stream().anyMatch(val->val.startsWith("one"));
	System.out.println(result);
	
	//allMatch()
	result=fruits.stream().allMatch(val->val.startsWith("one"));
	System.out.println(result);
	
	//noneMatch()
	result=fruits.stream().noneMatch(val->val.startsWith("one"));
	System.out.println(result);
	
}
}
