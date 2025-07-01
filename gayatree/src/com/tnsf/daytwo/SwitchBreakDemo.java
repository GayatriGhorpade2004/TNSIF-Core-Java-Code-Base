package com.tnsf.daytwo;

public class SwitchBreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int user_input=1;
		switch(user_input)
		{
		case 1:System.out.println("Current Recharge Details");
		break;
		
		case 2:System.out.println("Current Recharge Expiry");
		break;
		
		case 3:System.out.println("New Offers");
		break;
		
		case 4:System.out.println("Talk to customer support");
		break;
		
		default:
			System.out.println(user_input+"is not a valid input given by you");
		}
	}

}
