package DistinctLimitandCountDemo;

import java.util.Arrays;
import java.util.List;

public class DistinctLimitandCountTest {
public static void main(String[] args) {
	List<String> vehicles=Arrays.asList("bus","car","bus","truck","car");
	
	vehicles.stream().distinct().forEach(System.out::println);
}
}
