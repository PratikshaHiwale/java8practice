package com.flatmap.demo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

class Student{
	int sid;
	String sname;
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	
}
public class FlatMapTest3 {
	public static void main(String[] args) {
		List<Student> studentList1=Arrays.asList(new Student(101,"ram"),new Student(102,"sham"),new Student(103,"siya"));
		List<Student> studentList2=Arrays.asList(new Student(201,"smith"),new Student(202,"john"));
		
		List<List<Student>> studentList=Arrays.asList(studentList1,studentList2);
		studentList.stream().flatMap(list->list.stream()).forEach(list->System.out.println(list.sname));
		
	}

}
