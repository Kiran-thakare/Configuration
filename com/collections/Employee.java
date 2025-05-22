package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

class Person {

	private int id;

	private String name;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person p = (Person) obj;
		return id == p.getId() && name.equals(p.getName());
	}

	@Override
	public int hashCode() {

		return Objects.hash(id, name);
	}

}

public class Employee {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<Person>();
		list.add(new Person(1, "Kiran Thakare"));
		list.add(new Person(2, "Manoj Thakare"));
		list.add(new Person(1, "Kiran Thakare"));

		System.out.println("Simple Print ....");

		Iterator<Person> it = list.iterator();
		while (it.hasNext()) {
			Person p = it.next();
			System.out.println(p.getId() + " " + p.getName());
		}

		System.out.println();
		System.out.println("After Filter....");
		Set<Person> unique = new LinkedHashSet<Person>(list);
		for (Person p : unique) {
			System.out.println(p.getId() + "  " + p.getName());
		}

		int hash = Objects.hash("Kiran");

		System.out.println(hash);

	}
}
