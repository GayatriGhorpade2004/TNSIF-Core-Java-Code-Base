package com.tnsf.dayfourteen.listdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List list= new ArrayList(); //dynamic binding
		System.out.println(list.isEmpty());
		
		
		list.add(10);
		list.add(20);
		list.add("Sakshi");
		list.add("Veena");
		list.add(false);
		list.add(true);
		list.add(20);
		list.add(10);
		list.add(9.56f);
		
		System.out.println("List is "+list);
		System.out.println("List is "+list.size());
		System.out.println("List is "+list.contains(1));
		list.remove(false);
		System.out.println(list);
		System.out.println(list.remove(list.lastIndexOf(20)));
		System.out.println(list.indexOf(10));
		System.out.println("List is "+list);
		list.clear();
		System.out.println("List is "+list);
		System.out.println("-------------******************------------");
		
		
		//Generics
		List<String> names=new ArrayList<String>();
		names.add("Riya");
		names.add("Meena");
		names.add("Vidya");
		names.add("Abhi");
		System.out.println(names);
		Collections.reverse(names);
		System.out.println(names);
		System.out.println(names.contains("Vidya"));
		Collections.sort(names);
		System.out.println(names);
		Collections.reverse(names);
		System.out.println(names);
		
		//traversing in list
		Iterator<String> i=names.iterator();
		while(i.hasNext())
		{
			String nm=i.next();
			System.out.println(nm+" ");
		}
		System.out.println();
		System.out.println(names);
		
		ListIterator<String> li=names.listIterator(names.size());//by using previous 
		while(li.hasPrevious()) {
			String nm=li.previous();
			System.out.println(nm);
		}
		
	}

}
