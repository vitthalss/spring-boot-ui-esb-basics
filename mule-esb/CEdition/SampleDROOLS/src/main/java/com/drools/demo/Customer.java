package com.drools.demo;

import java.math.BigDecimal;

public class Customer {
	private String name;
	private int age;
	private BigDecimal purchase;
	private String customerType;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public BigDecimal getPurchase() {
		return purchase;
	}
	public void setPurchase(BigDecimal purchase) {
		this.purchase = purchase;
	}
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
}
