package com.kartikbunjkar.portfolio.services.service.dao;

import org.springframework.stereotype.Service;

@Service
public interface LoginService {
	
	String createUser(UserDAO userDao);
}
