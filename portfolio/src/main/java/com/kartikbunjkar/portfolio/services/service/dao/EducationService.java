package com.kartikbunjkar.portfolio.services.service.dao;

import org.springframework.stereotype.Service;

@Service
public interface EducationService {

	String insertEducationDetails(EducationDAO educationDao);
	
	EducationDAO getEducationDetail(String stage);
	
}
