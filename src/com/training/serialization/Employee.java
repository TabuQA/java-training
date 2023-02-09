package com.training.serialization;

import java.io.Serializable;

public class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String bloodgroup;
	private String worklocation;
	
	
	public Employee(String name, int age, String bloodgroup, String worklocation ) {
		this.name=name;
		this.age=age;
		this.bloodgroup =bloodgroup;
		this.worklocation= worklocation;
	}
	
	public void setName(String name) {
		this.name =name;
	}
	
	public void setAge(int age) {
		this.age=age;		
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup =bloodgroup;
	}
	public void setWorklocation(String worklocation) {
		this.worklocation =worklocation;
	}
	
	public int getAge() {
		return this.age;		
	}
	public String getName() {
		return this.name;
	}
	public String setBloodgroup() {
		return this.setBloodgroup();
	}
	public String setWorklocation() {
		return this.worklocation;
	}
	

}
