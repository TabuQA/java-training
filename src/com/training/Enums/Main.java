package com.training.Enums;

public class Main {

	public static void main(String[] args) {
		Abbrevation c1 = Abbrevation.WHO;
		System.out.println(c1.name());
		System.out.println(c1.getvalue());
		
		for(Abbrevation col :Abbrevation.values()) {
			System.out.println(col.getvalue());
			
		}
	}
}
