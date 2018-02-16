package com.nizar.abdelhedi.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class SiteSZ implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6925893908771351455L;

	@Id @GeneratedValue
	private int SiteNudoss;
	private int week;
	private String siteLabel;
	private Date startDate;
	
	@ManyToOne//(fetch=FetchType.EAGER)
    @JoinColumn(name = "ID_CYCLE")
	private CycleSZ cycleSz;
	
	
	
	
	
	
	public CycleSZ getCycleSz() {
		return cycleSz;
	}


	public void setCycleSz(CycleSZ cycleSz) {
		this.cycleSz = cycleSz;
	}
	


	public int getSiteNudoss() {
		return SiteNudoss;
	}


	public void setSiteNudoss(int siteNudoss) {
		SiteNudoss = siteNudoss;
	}


	public SiteSZ(int week, String siteLabel, Date startDate) {
		super();
		this.week = week;
		this.siteLabel = siteLabel;
		this.startDate = startDate;
	}


	public SiteSZ() {
	}


	public int getWeek() {
		return week;
	}
	
	
	public void setWeek(int week) {
		this.week = week;
	}
	public String getSiteLabel() {
		return siteLabel;
	}
	public void setSiteLabel(String siteLabel) {
		this.siteLabel = siteLabel;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	
}
