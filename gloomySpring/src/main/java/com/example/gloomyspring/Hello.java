package com.gloomystore.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 1. ���� ȣ�� ������ ���α׷����� ���
@Controller
public class Hello {
	int iv = 10;
	static int cv = 20;
	// 2. url�� �޼ҵ带 ����
	@RequestMapping("/hello")
	private void main() {
		System.out.print("hell");
		System.out.println(cv);
	}
}
