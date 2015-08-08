package com.vv.spring.maven;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NewController {
	public NewController() {
		System.out.println("Created ###");
	}
    @RequestMapping(value="/message")
	public String getMessage(){
		System.out.println("Message");
		return "Hai ! Spring-Maven";
	}
}
