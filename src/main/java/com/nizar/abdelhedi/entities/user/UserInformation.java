package com.nizar.abdelhedi.entities.user;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class UserInformation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 809164965920418235L;

	@Id
	@GeneratedValue
	private int id;

	private String country;
	private String jobTile;
	private String company;
	private String experience;
	@OneToMany(mappedBy = "userInformation", fetch = FetchType.LAZY)
	private List<Skills> skills;
	@OneToOne
	private User user;
	

	public UserInformation(String country, String jobTile, String company, String experience, List<Skills> skills) {
		super();
		this.country = country;
		this.jobTile = jobTile;
		this.company = company;
		this.experience = experience;
		this.skills = skills;
	}

	public UserInformation() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getJobTile() {
		return jobTile;
	}

	public void setJobTile(String jobTile) {
		this.jobTile = jobTile;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public List<Skills> getSkills() {
		return skills;
	}

	public void setSkills(List<Skills> skills) {
		this.skills = skills;
	}
}