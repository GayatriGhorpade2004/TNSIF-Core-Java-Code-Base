package com.tnsf.dayeleven.trycatch;

public class UncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[];
		try {
			x=new int[] {1,2,3,4,5};
			System.out.println(x[7]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Specified index does not exist: "+e.getMessage());
		}
	}

}
