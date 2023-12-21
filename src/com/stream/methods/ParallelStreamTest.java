package com.stream.methods;

import java.util.Arrays;
import java.util.List;

class Student {
	String name;
	int score;

	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

}

public class ParallelStreamTest {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("ram", 70), new Student("smith", 80),
				new Student("mathew", 60), new Student("robert", 90), new Student("alex", 85),
				new Student("tiger", 89));
		
		students.stream().filter(student->student.getScore()>=80).limit(3).forEach(student->System.out.println(student.getName()+" "+student.getScore()));
		
		students.parallelStream().filter(student->student.getScore()>=80).limit(3).forEach(student->System.out.println(student.getName()+" "+student.getScore()));
		students.stream().parallel().filter(student->student.getScore()>=80).limit(3).forEach(student->System.out.println(student.getName()+" "+student.getScore()));

	}

}
