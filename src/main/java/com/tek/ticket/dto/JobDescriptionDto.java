package com.tek.ticket.dto;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;


public class JobDescriptionDto {
	private int jobId;

	private String jobTitle;

	private String jobDescription;
	
	private int minYrs;
	
	private int maxYrs;
	
	private int openPositions;

	private String createdBy;

	private String modifiedBy;

	@Temporal(TemporalType.DATE)
	private Date createdAt = new Date(System.currentTimeMillis());

	@Temporal(TemporalType.DATE)
	private Date modifiedAt = new Date(System.currentTimeMillis());

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public int getMinYrs() {
		return minYrs;
	}

	public void setMinYrs(int minYrs) {
		this.minYrs = minYrs;
	}

	public int getMaxYrs() {
		return maxYrs;
	}

	public void setMaxYrs(int maxYrs) {
		this.maxYrs = maxYrs;
	}

	public int getOpenPositions() {
		return openPositions;
	}

	public void setOpenPositions(int openPositions) {
		this.openPositions = openPositions;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(Date modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

}
