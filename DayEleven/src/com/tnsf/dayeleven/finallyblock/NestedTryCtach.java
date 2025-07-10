package com.tnsf.dayeleven.finallyblock;

public class NestedTryCtach {

	public static void check()
	{
		String str="TNS";
		int strLen=str.length();
		System.out.println("String length:"+strLen);
		String anotherString=null;
		int y=6;
		try {
			//inner try block
			try {
				System.out.println(str.charAt(y));
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.err.println(e.getMessage());
			}
			System.out.println("String Length:"+anotherString);
		}
		catch(NullPointerException e)
		{
			System.err.println(e.getMessage());
		}
	}
}
