package com.kartikbunjkar.portfolio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kartikbunjkar.portfolio.domain.Education;

@Repository
public interface EducationRepositories extends JpaRepository<Education, Long>{

	List<Education> findByStage(String stage);
	
}
