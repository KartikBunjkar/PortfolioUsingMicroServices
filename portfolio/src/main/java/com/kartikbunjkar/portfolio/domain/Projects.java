package com.kartikbunjkar.portfolio.domain;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity (name = "projects")
public class Projects {

	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (name = "title")
	private String title;
	
	@Column (name = "description")
	private String description;
	
	@Column (name = "toolsUsed")
	private String toolsUsed;
	
	@Column (name = "fromDate")
	private LocalDate fromDate;
	
	@Column (name = "toDate")
	private LocalDate toDate;
	
}
