package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Name {
	@Value("${name}")
	private String name;
	@GetMapping("/")
	public String dis()
	{
		return "My name is "+name;
	}
}
