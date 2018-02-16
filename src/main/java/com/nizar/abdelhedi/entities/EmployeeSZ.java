package com.nizar.abdelhedi.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class EmployeeSZ implements Serializable{

	/**
	 * Nizar Abdelhedi
	 */
	private static final long serialVersionUID = -2327721671776761L;
	
	@Id @GeneratedValue
	private int nudoss;
	private int matcle;
	private String name;
	private String lastName;
	private String contrat;
	private String role;
	
	
	
	public EmployeeSZ() {
	}
	
	public EmployeeSZ(int matcle, String name, String lastName, String contrat, String role) {
		super();
		this.matcle = matcle;
		this.name = name;
		this.lastName = lastName;
		this.contrat = contrat;
		this.role = role;
	}
	public int getNudoss() {
		return nudoss;
	}
	public void setNudoss(int nudoss) {
		this.nudoss = nudoss;
	}
	public int getMatcle() {
		return matcle;
	}
	public void setMatcle(int matcle) {
		this.matcle = matcle;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getContrat() {
		return contrat;
	}
	public void setContrat(String contrat) {
		this.contrat = contrat;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	

}
