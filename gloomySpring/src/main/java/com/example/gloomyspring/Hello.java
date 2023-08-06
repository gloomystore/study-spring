package com.example.gloomyspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 1. 원격 호출 가능한 프로그램으로 등록
@Controller
public class Hello {
	int iv = 10;
	static int cv = 20;
	// 2. url과 메소드를 연결
	@RequestMapping("/hello")
	private void main() {
		System.out.print("hell");
		System.out.println(cv);
	}
}
