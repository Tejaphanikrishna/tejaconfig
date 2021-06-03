package com.techprimers.kubernetes.springcloudkubernetesconfigexample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/welcome")
@RestController
public class WelcomeController {

	@Value("${message}")
	private String message;
	@Value("${greeter.message}")
	private String message1;

	@GetMapping("/")
	public String welcome() {
		String prefix = System.getenv().getOrDefault("USERNAME", "Unknown");
		System.out.println(message);
		System.out.println(message1);
		return "Hi " + prefix;
	}
}
