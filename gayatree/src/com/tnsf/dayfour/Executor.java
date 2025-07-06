package com.tnsf.dayfour;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AccessModifier a=new AccessModifier();
        a.methodDefault();
        a.methodPublic();
        a.methodProtected();
        
        a.vardefault=11;
        a.methodDefault();
        
        a.varProtected=11;
        a.methodProtected();
        
        
        
	}

}
