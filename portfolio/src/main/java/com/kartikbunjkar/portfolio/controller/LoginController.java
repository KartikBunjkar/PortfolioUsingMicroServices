package com.kartikbunjkar.portfolio.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kartikbunjkar.portfolio.services.service.dao.LoginService;
import com.kartikbunjkar.portfolio.services.service.dao.UserDAO;
import com.kartikbunjkar.portfolio.services.serviceImpl.LoginServiceImpl;

@RestController
@RequestMapping("/api")
public class LoginController {
	
	 private final LoginService loginService;

	    // Use constructor injection for LoginService
	    public LoginController(LoginService loginService) {
	        this.loginService = loginService;
	    }
	
	@RequestMapping(value = "/login", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	private String login(@RequestBody UserDAO userDao) {
		
		if(userDao.getUserName().equals("Kartik")) return "Successfull";
		else return "NotSuccessfull";
	}
	
	@RequestMapping(value = "/createuser", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	private String createUser(@RequestBody UserDAO userDao) {
		
		return loginService.createUser(userDao);
		
	}
	
	
}
