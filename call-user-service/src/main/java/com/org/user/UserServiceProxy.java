package com.org.user;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="user-service", url="localhost:8000")
public interface UserServiceProxy {
@GetMapping(path="/User/{id}")
	
	public Userproxy getUser (@PathVariable("id") String id);

}
