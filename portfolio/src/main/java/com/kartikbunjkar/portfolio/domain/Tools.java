package com.kartikbunjkar.portfolio.domain;

import java.util.Objects;

import com.kartikbunjkar.portfolio.domain.enumerations.RatingEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity(name = "tools")
public class Tools {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name;

	@Column(name = "proficiency")
	private RatingEnum proficiency;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RatingEnum getProficiency() {
		return proficiency;
	}

	public void setProficiency(RatingEnum proficiency) {
		this.proficiency = proficiency;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, proficiency);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tools other = (Tools) obj;
		return id == other.id && Objects.equals(name, other.name) && proficiency == other.proficiency;
	}

	@Override
	public String toString() {
		return "Tools [id=" + id + ", name=" + name + ", proficiency=" + proficiency + "]";
	}
	
	
}

