package com.tnsf.dayten.singledimension;

class ArrayOperations
{
	static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"\t");
			System.out.println();
		}
	}
	
	//variable argument function
	public static int getSum(int... n)
	{
		int sum=0;
		for(int no : n)
			sum+=no;
		return sum;
	}
	
	//count no. odd elements
	public static int getOddCount(int b[])
	{
		int count=0;
		for(int i=0;i<b.length;i++)
		{
			if(b[i]%2!=0)
				count++;			
		}
		return count;
	}
	
	//count of even elements
	public static int getEvenCount(int b[])
	{
		return b.length-getOddCount(b);
	}
}




public class ArrayDemoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int a[];
		a=new int[n];
		
		ArrayOperations.printArray(a);//displaying the array
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=5*i;
			ArrayOperations.printArray(a);
		}
		
		int b[]= {10,20,30,40,50};//initialization
		ArrayOperations.printArray(b);
		
		System.out.println("Sum of array is:"+ ArrayOperations.getSum(b));
		System.out.println("Sum of array is:"+ArrayOperations.getSum(10,20,30,40,60,80));
		
		b[2]=999;
		ArrayOperations.printArray(b);
		
		//displaying total odd and even no
		System.out.println("Odd Number:"+ArrayOperations.getOddCount(b)+"\t  Even no:"+ArrayOperations.getEvenCount(b));
		
		System.out.println();
	}

}
