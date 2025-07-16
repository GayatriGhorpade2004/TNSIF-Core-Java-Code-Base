package com.tnsf.dayfourteen.setdemo;

import java.util.HashSet;
import java.util.Set;

public class StudentSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Student> set=new HashSet<Student>();
		set.add(new Student(101,"Sima",80.90));
		set.add(new Student(119,"Rima",82.90));
		set.add(new Student(101,"Sima",80.90));
		set.add(new Student(102,"Vina",60.90));
		System.out.println(set);
		
	}

}
