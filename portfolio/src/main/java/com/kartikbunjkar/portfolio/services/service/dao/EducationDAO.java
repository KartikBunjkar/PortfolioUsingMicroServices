package com.kartikbunjkar.portfolio.services.service.dao;

import java.util.Objects;

import jakarta.persistence.Column;

public class EducationDAO {

	private String stage;
	
	private String grades;

	private String completionYear;

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getGrades() {
		return grades;
	}

	public void setGrades(String grades) {
		this.grades = grades;
	}

	public String getCompletionYear() {
		return completionYear;
	}

	public void setCompletionYear(String completionYear) {
		this.completionYear = completionYear;
	}

	@Override
	public int hashCode() {
		return Objects.hash(completionYear, grades, stage);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EducationDAO other = (EducationDAO) obj;
		return Objects.equals(completionYear, other.completionYear) && Objects.equals(grades, other.grades)
				&& Objects.equals(stage, other.stage);
	}

	@Override
	public String toString() {
		return "EducationDAO [stage=" + stage + ", grades=" + grades + ", completionYear=" + completionYear + "]";
	}
	
	

}
