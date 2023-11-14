package com.kartikbunjkar.portfolio.services.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kartikbunjkar.portfolio.domain.Education;
import com.kartikbunjkar.portfolio.repositories.EducationRepositories;
import com.kartikbunjkar.portfolio.services.service.dao.EducationDAO;
import com.kartikbunjkar.portfolio.services.service.dao.EducationService;

@Service
public class EducationServiceImpl implements EducationService{
	
	@Autowired
	private EducationService educationService;
	
	@Autowired
	private EducationRepositories educationRepositories;

	private Education education;
	
	@Override
	public String insertEducationDetails(EducationDAO educationDao) {

		education = new Education();
		
		education.setStage(educationDao.getStage());
		education.setGrades(educationDao.getGrades());
		education.setCompletionYear(educationDao.getCompletionYear());

		if(education != null) {
			educationRepositories.save(education);
			return "education details saved successfully";
		}else {
			return null;
		}
		
	}
	
	@Override
	public EducationDAO getEducationDetail (String stage) {
		
		List<Education> educationList = educationRepositories.findByStage(stage);
		
		EducationDAO educationDao1 = new EducationDAO();
		
		educationDao1.setStage(educationList.get(0).getStage());
		educationDao1.setCompletionYear(educationList.get(0).getCompletionYear());
		educationDao1.setGrades(educationList.get(0).getGrades());
				
		return educationDao1;
	}
	
	

}
