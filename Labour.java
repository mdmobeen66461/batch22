package com.assesment1;

public class Labour extends Employee {
	
	private int overTime;
	private int rate;
	
	
	public Labour(int employeeId, String employeeName, int employeeSalary,int overTime, int rate) {
		super(employeeId, employeeName, employeeSalary);
		this.overTime = overTime;
		this.rate = rate;
	}


	public int getOverTime() {
		return overTime;
	}


	public void setOverTime(int overTime) {
		this.overTime = overTime;
	}


	public int getRate() {
		return rate;
	}


	public void setRate(int rate) {
		this.rate = rate;
	}
	
	
	public int calculateSalary() {
		return super.calculateSalary()+ getOverTime() * getRate();
	}
	
	

}
