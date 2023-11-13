package com.kartikbunjkar.portfolio.domain;

import java.util.Objects;

import com.kartikbunjkar.portfolio.domain.enumerations.RatingEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity(name = "skills")
public class Skills {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "ratings")
	private RatingEnum ratings;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public RatingEnum getRatings() {
		return ratings;
	}

	public void setRatings(RatingEnum ratings) {
		this.ratings = ratings;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, ratings, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Skills other = (Skills) obj;
		return id == other.id && ratings == other.ratings && Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Skills [id=" + id + ", title=" + title + ", ratings=" + ratings + "]";
	}
	
	
	
}
