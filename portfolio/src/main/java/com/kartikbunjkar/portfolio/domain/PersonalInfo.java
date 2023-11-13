package com.kartikbunjkar.portfolio.domain;

import java.util.Objects;

import com.kartikbunjkar.portfolio.domain.enumerations.GenderEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity(name = "personal_info")
public class PersonalInfo {
	
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column (name = "first_name")
	private String firstName;
	
	@Column (name = "middle_name")
	private String middleName;
	
	@Column (name = "last_name")
	private String lastName;
	
	@Column (name = "age")
	private Integer age;
	
	@Column (name = "gender")
	private GenderEnum gender;
	
	@Column (name = "mother_tongue")
	private String mothertongue;
	
	@Column (name = "address_first_line")
	private String addressFirstLine;
	
	@Column (name = "village")
	private String village;
	
	@Column (name = "city")
	private String city;
	
	@Column (name = "pincode")
	private Integer pincode;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public GenderEnum getGender() {
		return gender;
	}
	public void setGender(GenderEnum gender) {
		this.gender = gender;
	}
	public String getMothertounge() {
		return mothertongue;
	}
	public void setMothertounge(String mothertounge) {
		this.mothertongue = mothertounge;
	}
	public String getAddressFirstLine() {
		return addressFirstLine;
	}
	public void setAddressFirstLine(String addressFirstLine) {
		this.addressFirstLine = addressFirstLine;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(addressFirstLine, age, city, firstName, gender, lastName, middleName, mothertongue, pincode,
								village);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonalInfo other = (PersonalInfo) obj;
		return Objects.equals(addressFirstLine, other.addressFirstLine) && Objects.equals(age, other.age)
								&& Objects.equals(city, other.city) && Objects.equals(firstName, other.firstName)
								&& gender == other.gender && Objects.equals(lastName, other.lastName)
								&& Objects.equals(middleName, other.middleName) && Objects.equals(mothertongue, other.mothertongue)
								&& Objects.equals(pincode, other.pincode) && Objects.equals(village, other.village);
	}
	
	@Override
	public String toString() {
		return "PersonalInfo [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
								+ ", age=" + age + ", gender=" + gender + ", mothertounge=" + mothertongue + ", addressFirstLine="
								+ addressFirstLine + ", village=" + village + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	
	
}
