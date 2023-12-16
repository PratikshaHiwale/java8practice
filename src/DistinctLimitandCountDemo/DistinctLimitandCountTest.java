package DistinctLimitandCountDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DistinctLimitandCountTest {
public static void main(String[] args) {
	List<String> vehicles=Arrays.asList("bus","car","bus","truck","car");
	
	vehicles.stream().distinct().forEach(System.out::println);
	long noVehicles=vehicles.stream().distinct().count();
	System.out.println(noVehicles);
	vehicles.stream().limit(4).forEach(vehicle->System.out.println(vehicle));
	
}
}
