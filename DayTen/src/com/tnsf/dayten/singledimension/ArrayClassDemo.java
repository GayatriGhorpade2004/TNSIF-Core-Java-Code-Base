package com.tnsf.dayten.singledimension;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intArr[]= {35,78,56,23,66};
		System.out.println(Arrays.toString(intArr));
		
		for(int i=0;i<intArr.length;i++)
		{
			System.out.println(intArr[i]+" ");
		}
		
		System.out.println();
		//sort
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		//binary search
		System.out.println(Arrays.binarySearch(intArr, 50));
		
		int intArr1[]={35,78,56,23,66};
		System.out.println(Arrays.toString(intArr1));
		Arrays.sort(intArr1);
		//comparison both the array
		if(Arrays.compare(intArr, intArr1)==0)
		{
			System.out.println("same arrays");
		}
		else
		{
			System.out.println("not same arrays");
		}
		
		
		//copy array
		int intArr2[]=Arrays.copyOf(intArr1, 2);
		System.out.println(Arrays.toString(intArr2));
		
		int intArr3[]=Arrays.copyOfRange(intArr1, 2,4);
		System.out.println(Arrays.toString(intArr3));
		
		//fill method
		Arrays.fill(intArr3, 7);
		System.out.println(Arrays.toString(intArr3));
		
		
	}

}
