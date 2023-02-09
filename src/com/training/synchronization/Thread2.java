package com.training.synchronization;

public class Thread2 implements Runnable{
	MathUtil m2;
	
	 Thread2(MathUtil m2){
		 this.m2 =m2;
		 
	 }
	public void run() {
		m2.getMultiples(20);
		System.out.println("Thread2 is running");
	}

}
