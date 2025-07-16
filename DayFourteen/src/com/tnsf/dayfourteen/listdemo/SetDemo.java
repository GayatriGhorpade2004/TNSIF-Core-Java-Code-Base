package com.tnsf.dayfourteen.listdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<Integer> set=new HashSet<Integer>();
		set.add(100);
		set.add(10);
		set.add(50);
		set.add(90);
		System.out.println(set);
		boolean b=set.contains(set);
		System.out.println(b);
		boolean b1=set.isEmpty();
		System.out.println(b1);
		set.remove(60);
		System.out.println(set);
		Iterator<Integer> i =set.iterator();
		while (i.hasNext())
		{
			System.out.println(i.next()+ " ");
		}
		
		
		}

}
