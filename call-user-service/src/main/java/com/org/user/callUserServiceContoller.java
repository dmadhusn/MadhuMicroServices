package com.org.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class callUserServiceContoller {
	
	@Autowired
	private UserServiceProxy proxy;

	@GetMapping(path="/callUsersrvs/{idval}")
	public Userproxy callUserSrvice(@PathVariable String idval)
	{
		Userproxy usr=proxy.getUser(idval);
		return usr;
		
	}
	
	@GetMapping(path="/callUsersrvs")
	public Userproxy callUserSrvice()
	{
		Userproxy usr=proxy.getUser("Dummy");
		return usr;
		
	}
	
	@GetMapping("/test")
	public String test()
	{
		//User usr=proxy.getUser("working");
		//return usr;
		
		return "Succes";
		
	}
}
