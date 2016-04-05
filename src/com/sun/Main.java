package com.sun;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {

		Student stu = new Student();
		stu.setAge("12");
		stu.setName("12");

		Student stu0 = new Student();
		stu0.setAge("122");
		stu0.setName("122");

		Student stu1 = new Student();
		stu1.setAge("122");
		stu1.setName("122");

		Student stu2 = new Student();
		stu2.setAge("123");
		stu2.setName("123");

		HashSet<Student> sets = new HashSet<>();
		sets.add(stu);
		sets.add(stu0);
		sets.add(stu1);
		sets.add(stu2);

		Iterator<Student> ss = sets.iterator();
		while (ss.hasNext()) {
			Student st = ss.next();
			System.out.println(st.toString());
		}
	}
}
