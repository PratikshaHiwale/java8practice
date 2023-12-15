package com.map.demo;

import java.util.Arrays;
import java.util.List;

public class MapMethodTest2 {
	public static void main(String[] args) {
		List<String> vehicles=Arrays.asList("car", "bus", "truck");
		/*for(String vehicle:vehicles) {
			System.out.println(vehicle.length());
		}
	*/
		vehicles.stream().map(vehicle->vehicle.length()).forEach(System.out::println);
	}

}
