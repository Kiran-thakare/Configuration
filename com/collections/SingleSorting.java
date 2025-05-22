package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {

	private int id;
	private String name;
	private int age;

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		if (this.age > o.age) {
			return 1;
		} else if (this.age < o.age) {
			return -1;
		}
		return 0;
	}

	/*
	 * @Override public int compareTo(Student o) {
	 * 
	 * return this.name.compareTo(o.getName()); }
	 */

}

public class SingleSorting {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "Manoj", 24));
		list.add(new Student(2, "Kiran", 22));
		list.add(new Student(3, "Lokesh", 21));

		Collections.sort(list);
		for (Student s : list) {
			System.out.println(s.getId() + " " + s.getName() + " " + s.getAge());
		}

	}
}
