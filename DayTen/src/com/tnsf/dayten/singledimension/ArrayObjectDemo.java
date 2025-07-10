package com.tnsf.dayten.singledimension;

public class ArrayObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Student s=new Student(0,null);
		Student [] arr;
		
		arr=new Student[5];   //declared memory for 5 object or type students
		
		arr[0]=new Student(101,"Mina");
		arr[1]=new Student(102,"Tina");
		arr[2]=new Student(103,"Rina");
		arr[3]=new Student(104,"Vina");
		arr[4]=new Student(105,"Jina");
		//arr[5]=new Student(106,"Nina");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Elements at "+ i+ ":"+arr[i].getRollno()+" "+arr[i].getName());
		}
		
		
		
	}

}
