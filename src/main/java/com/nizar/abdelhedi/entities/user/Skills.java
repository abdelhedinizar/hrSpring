package com.nizar.abdelhedi.entities.user;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Skills implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4780584666313328987L;
	@Id
	@GeneratedValue
	@Column(name = "ID_SKILL")
	private int id;
	private String skillName;

	


	public Skills() {
		super();
	}
	
	public Skills(String skillName) {
		super();
		this.skillName = skillName;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	
	
	
	
	
	
}
