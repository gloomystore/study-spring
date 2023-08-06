package com.gloomystore.spring;

public class PrivateMethodCall {
	public static void main(String[] args) throws Exception {
		//Hello hello = new Hello();
		// hello.main(); // private�� ������
		
		// Reflection API����ϸ� �ذ� ����
		// java.lang.reflect ��Ű��
		
		Class HelloClass = Class.forName("com.gloomystore.spring.Hello");
		Hello hello = (Hello)HelloClass.newInstance();
		
		java.lang.reflect.Method main = HelloClass.getDeclaredMethod("main"); 
		main.setAccessible(true); // private�� main�� ȣ�� �����ϰ� ��
		
		main.invoke(hello); // hello.main()
		
	}
}
