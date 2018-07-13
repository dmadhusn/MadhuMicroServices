package com.org.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {
	
	@GetMapping("/Hello")
	
	public String hello() {
		
		return "Helo";
	}
	
	
@GetMapping(path="/User/{id}")
	
	public User getUser(@PathVariable String id) {
	
	User usr=new User();
	
	usr.setId(id);
	
	usr.setName("Madhu");
		
		return usr;
	}

}
