package com.gloomystore.spring;

import java.lang.reflect.*;

public class Main {
	public static void main(String[] args) throws Exception{
		//Hello hello = new Hello();
		// hello.main(); // private라 에러남
		
		// Reflection API사용하면 해결 가능
		// java.lang.reflect 패키지
		
		Class HelloClass = Class.forName("com.gloomystore.spring.Hello");
		Hello hello = (Hello)HelloClass.newInstance();
		
		java.lang.reflect.Method main = HelloClass.getDeclaredMethod("main"); 
		main.setAccessible(true); // private인 main을 호출 가능하게 함
		
		main.invoke(hello); // hello.main()
		
	}
}
