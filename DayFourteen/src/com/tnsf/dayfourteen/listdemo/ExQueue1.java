package com.tnsf.dayfourteen.listdemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExQueue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Queue<Integer> r=new LinkedList<Integer>();
		r.add(6);
		r.add(8);
		r.add(10);
		r.add(12);
		
		System.out.println(r);
		
		int positionPeek =r.peek();
		System.out.println("Using Peek operation first value is:"+positionPeek);
		
		
		int positionelements=r.element();
		System.out.println("Using element operation first value is:"+positionelements);
		
		System.out.println();
		System.out.println(r.remove());
		System.out.println(r);
		
		Iterator itr=r.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next()+"\t");
		}
		System.out.println(r.poll());
		System.out.println(r);
		
		System.out.println(r.retainAll(r));
	}

}
