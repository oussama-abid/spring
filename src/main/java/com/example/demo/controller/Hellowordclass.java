package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellowordclass {
@RequestMapping("/hello")
	public String sayhello(){
	return "hello spring from azure";
}
}
