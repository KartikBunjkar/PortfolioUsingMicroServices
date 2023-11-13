package com.kartikbunjkar.portfolio.domain;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity (name = "projects")
public class Projects {

	@Id
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getToolsUsed() {
		return toolsUsed;
	}

	public void setToolsUsed(String toolsUsed) {
		this.toolsUsed = toolsUsed;
	}

	public LocalDate getFromDate() {
		return fromDate;
	}

	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}

	public LocalDate getToDate() {
		return toDate;
	}

	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, fromDate, id, title, toDate, toolsUsed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Projects other = (Projects) obj;
		return Objects.equals(description, other.description) && Objects.equals(fromDate, other.fromDate)
				&& Objects.equals(id, other.id) && Objects.equals(title, other.title)
				&& Objects.equals(toDate, other.toDate) && Objects.equals(toolsUsed, other.toolsUsed);
	}

	@Override
	public String toString() {
		return "Projects [id=" + id + ", title=" + title + ", description=" + description + ", toolsUsed=" + toolsUsed
				+ ", fromDate=" + fromDate + ", toDate=" + toDate + "]";
	}
	
	
	
}
