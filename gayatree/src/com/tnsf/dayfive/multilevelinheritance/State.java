package com.tnsf.dayfive.multilevelinheritance;

public class State extends Country {
	
	//data members
	private String stateName;
	private String language;
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	//toString method
	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", language=" + language + ", getCountryname()=" + getCountryname()
				+ ", getCapital()=" + getCapital() + "]";
	}
	
	

}
