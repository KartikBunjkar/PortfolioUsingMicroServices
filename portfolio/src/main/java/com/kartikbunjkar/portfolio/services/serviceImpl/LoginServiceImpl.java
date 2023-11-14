package com.kartikbunjkar.portfolio.services.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kartikbunjkar.portfolio.domain.User;
import com.kartikbunjkar.portfolio.repositories.UserRepository;
import com.kartikbunjkar.portfolio.services.service.dao.LoginService;
import com.kartikbunjkar.portfolio.services.service.dao.UserDAO;

@Service
public class LoginServiceImpl implements LoginService{
	
	public LoginServiceImpl() {
		super();
	}

	private User user;
	
	@Autowired
	private UserRepository userRepository; 
	
	@Override
	public String createUser(UserDAO userDao) {
		
		user = new User();
		
		user.setUserName(userDao.getUserName());
		user.setPassword(userDao.getPassword());
		
		if(user != null) {
			userRepository.save(user);
			return "User created Successfully";
		}
		else {
			return "Mandatory parameters required to create user";
		}
			

	}
	
	
	
}
