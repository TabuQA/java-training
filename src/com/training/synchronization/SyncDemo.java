package com.training.synchronization;

public class SyncDemo {
	public static void main(String [] args) {
		MathUtil obj = new MathUtil();
		
	
		Thread1 t1 = new Thread1(obj);
		t1.start();
		Thread t2 = new Thread(new Thread2(obj));
		t2.start();
		
		
	}

}
