package com.kartikbunjkar.portfolio.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kartikbunjkar.portfolio.domain.Education;
import com.kartikbunjkar.portfolio.services.service.dao.EducationDAO;
import com.kartikbunjkar.portfolio.services.service.dao.EducationService;

@RestController
@RequestMapping("/education")
public class EducationController {
	
	private final EducationService educationService;
	
	public EducationController(EducationService educationService) {
		this.educationService = educationService;
	}
	
	
	@RequestMapping(value = "/insert-education-details",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	private String insertEducationDetails(@RequestBody EducationDAO educationDao) {
		
		return educationService.insertEducationDetails(educationDao);
		
	}
	
	@RequestMapping(value = "/get-education-detail", method = RequestMethod.GET, consumes = MediaType.ALL_VALUE)
	private EducationDAO getEducationDetail(@RequestParam String stage) {	
		
		return educationService.getEducationDetail(stage);
		
	}
	

}
