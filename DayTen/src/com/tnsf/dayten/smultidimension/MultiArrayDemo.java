package com.tnsf.dayten.smultidimension;

class MlArray
{
	static void printArray(int c[][]) 
	{
		System.out.println("Array of elements are as follows");
		
		for (int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}



public class MultiArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c[][]= { {12,13,14} , {20,30,40} , {3,6} , {2,4} };
		
		System.out.println("No of row in c array :"+c.length);
		
		MlArray .printArray(c);
		
	}

}
