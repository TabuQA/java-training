package com.training.synchronization;


public class Thread1 extends Thread{
	MathUtil m1;
	
	Thread1(MathUtil m1) {
		this.m1 =m1;
		
	}



	public void run() {
		m1.getMultiples(10);
		System.out.println("Thread1 is running");
	}

}

