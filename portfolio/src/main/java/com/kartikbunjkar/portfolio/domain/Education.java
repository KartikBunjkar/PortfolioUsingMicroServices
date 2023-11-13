package com.kartikbunjkar.portfolio.domain;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "education")
public class Education {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "stage")
	private String stage;
	
	@Column(name = "grades")
	private String grades;

	@Column(name = "completion_year")
	private String completionYear;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
		return Objects.hash(completionYear, grades, id, stage);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Education other = (Education) obj;
		return Objects.equals(completionYear, other.completionYear) && Objects.equals(grades, other.grades)
								&& Objects.equals(id, other.id) && Objects.equals(stage, other.stage);
	}

	@Override
	public String toString() {
		return "Education [id=" + id + ", stage=" + stage + ", grades=" + grades + ", completionYear=" + completionYear
							+ "]";
	}
	
	
	
}
