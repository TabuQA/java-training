package com.training.annotations;

import java.lang.reflect.Method;

public class Myclass {
	@CustomAnnotation(value=12)
	public void sayHello() {
		System.out.println("my custom annotation");
		
	}
	
	public static void main(String [] args) throws NoSuchMethodException, SecurityException {
		Myclass c1 = new Myclass();
		Method method = c1.getClass().getMethod("sayHello");
		CustomAnnotation annotation = method.getAnnotation(CustomAnnotation.class);
		System.out.println(annotation.value());
	}

}
