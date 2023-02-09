package com.training.autoboxing;

public class BoxUnbox {
	public static void main(String [] args) {
		int i=99;
		char c='a';
		
		//boxing int primitive to Integer wrapper object
		Integer box = Integer.valueOf(i);
		System.out.println(box);
		Character v = Character.valueOf(c);
		System.out.println(v);
		
	}

}
