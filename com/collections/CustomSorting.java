package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CourseNameSorting implements Comparator<Course> {

	@Override
	public int compare(Course o1, Course o2) {

		return o1.getName().compareTo(o2.getName());
	}

}

public class CustomSorting {
	public static void main(String[] args) {

		List<Course> c = new ArrayList<Course>();

		c.add(new Course(1, "Python", 65000));
		c.add(new Course(2, "Java", 60000));
		c.add(new Course(3, "UI/UX", 35000));

		Collections.sort(c, new CourseNameSorting());

		for (Course co : c) {
			System.out.println(co.getId() + " " + co.getName() + " " + co.getFess());
		}
	}
}
