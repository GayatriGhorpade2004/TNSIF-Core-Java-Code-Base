package com.tnsf.dayeight.interfaces;
//plain entity=plain class
public class Customer {

		 private String name;
		 private String city;
		 
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		
		
		public Customer() {
			super();
		}
		
		public Customer(String name, String city) {
			
			this.name = name;
			this.city = city;
		}
		
		
		 
}
