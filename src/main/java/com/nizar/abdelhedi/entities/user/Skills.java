package com.nizar.abdelhedi.entities.user;

import java.io.Serializable;

import javax.persistence.Entity;
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
	private int id;
	private String skillName;
	@ManyToOne//(fetch=FetchType.EAGER)
    @JoinColumn(name = "ID_SKILLS")
	private UserInformation userInformation;
	
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
