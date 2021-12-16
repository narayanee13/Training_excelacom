package com.mobile;

public class Main {
	public static double findAmount(String planName) {
		switch(planName) {
		case ("prepaid"):
			return 200;
		  
		case ("postpaid"):
			return 300;
		 default:
			 return 0;
		}
	}
	public static void main(String[] args) {
        MobileBill mob = new MobileBill();
        mob.setPlanName("prepaid");
        
        mob.setCustomerName("narayanee");
        System.out.println(mob.getCustomerName());
        mob.setMobileNumber(54321);
        System.out.println(mob.getMobileNumber());
        Address add = new Address();
        add.setCity("chennai");
        System.out.println(add.getCity());
        add.setStreet("ranganathan");
        System.out.println(add.getStreet());
        add.setPinCode(78565);
        System.out.println(add.getPinCode());
       
        System.out.println(findAmount(mob.getPlanName()));
	}

}
