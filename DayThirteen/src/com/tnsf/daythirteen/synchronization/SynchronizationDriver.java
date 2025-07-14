package com.tnsf.daythirteen.synchronization;

public class SynchronizationDriver  {

	public static void main(String[] args) throws InsufficientBalanceException {
		// TODO Auto-generated method stub
		Account a=new Account(1001,"Rita",45000);
		System.out.println(a);
		
	
		
		AccountThread t[]=new AccountThread[10];
		for (int i=0;i<10;i++)
		{
			t[i]=new AccountThread(a,1000* (i+1));
		}
		try
		{
			for(int i=0;i<10;i++)
			{
				t[i].join();
			}
		}
		catch(InterruptedException e)
		{
			System.err.println(e.getMessage());
		}
		
		System.out.println("------------------------------------------");
		System.out.println(a);
	}

}
