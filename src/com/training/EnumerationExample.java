package com.training;

public class EnumerationExample {

	public static void main(String[] args) {
		colorEnum c1 = colorEnum.WHO;
		System.out.println(c1.name());
		System.out.println(c1.getvalue());
		
		for(colorEnum col :colorEnum.values()) {
			System.out.println(col.getvalue());
			
		}
	}
}
