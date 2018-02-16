package com.nizar.abdelhedi.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="cycleSZ")
public class CycleSZ implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1116387404733022751L;
	
	@Id @GeneratedValue
	private int cycleNudoss;
	private String cycleLabel;
	private Date startDate;
	private Date endDate;
	private String accumulatedHours;
	@OneToMany(mappedBy = "cycleSz", fetch = FetchType.LAZY)
	private Set<SiteSZ> listOfSites;
	
	
	public CycleSZ() {
	}
	
	public CycleSZ(String cycleLabel, Date startDate, Date endDate, String accumulatedHours) {
		super();
		this.cycleLabel = cycleLabel;
		this.startDate = startDate;
		this.endDate = endDate;
		this.accumulatedHours = accumulatedHours;
	}
	public int getCycleNudoss() {
		return cycleNudoss;
	}
	public void setCycleNudoss(int cycleNudoss) {
		this.cycleNudoss = cycleNudoss;
	}
	
	
	public String getCycleLabel() {
		return cycleLabel;
	}
	public void setCycleLabel(String cycleLabel) {
		this.cycleLabel = cycleLabel;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getAccumulatedHours() {
		return accumulatedHours;
	}
	public void setAccumulatedHours(String accumulatedHours) {
		this.accumulatedHours = accumulatedHours;
	}
	public Set<SiteSZ> getListOfSites() {
		return listOfSites;
	}
	
	public void setListOfSites(Set<SiteSZ> listOfSites) {
		this.listOfSites = listOfSites;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}
