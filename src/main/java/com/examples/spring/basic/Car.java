package com.examples.spring.basic;

public class Car {
	private String modelName;
	private String  dailyRent;
	
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public void setDailyRent(String dailyRent) {
		this.dailyRent = dailyRent;
	}
	@Override
	public String toString() {
		return "Car [modelName=" + modelName + ", dailyRent=" + dailyRent + "]";
	}

}
