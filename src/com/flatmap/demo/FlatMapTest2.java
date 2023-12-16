package com.flatmap.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapTest2 {
	public static void main(String[] args) {
		List<String> team1 = Arrays.asList("smith", "rok", "paul");
		List<String> team2 = Arrays.asList("riya", "purvi", "smitha");
		List<String> team3 = Arrays.asList("dhoni", "kohli", "rohit");
		List<List<String>> worldCupTeam = Arrays.asList(team1, team2, team3);

		/*
		 * //enhanced for loop List<String> names=new ArrayList<>(); for(List<String>
		 * team:worldCupTeam) { for(String name:team) {
		 * 
		 * names.add(name); } } System.out.println(names);
		 */
		
		
		//using streams
		/*
		 * List<String>
		 * names=worldCupTeam.stream().flatMap(team->team.stream()).collect(Collectors.
		 * toList()); System.out.println(names);
		 */
		
		worldCupTeam.stream().flatMap(team->team.stream()).forEach(name->System.out.println(name));
	}

}
