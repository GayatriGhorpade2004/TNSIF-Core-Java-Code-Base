package com.tnsf.dayfourteen.listdemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExDequeueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> deque1=new ArrayDeque <String>();
		deque1.add("Rahi");
		deque1.add("Mahi");
		deque1.add("Rohit");
		deque1.add("Vidya");
		deque1.add("Soni");
		
		System.out.println(deque1);
		
		deque1.pollLast();
		System.out.println(deque1);
		
		deque1.pollFirst();
		System.out.println(deque1);
		
		for(String str : deque1)
		{
			System.out.println("queue is: "+str);
		}
		System.out.println(deque1);
		
	}

}
