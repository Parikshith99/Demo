package com.tek.ticket.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "job_description")
public class JobDescription {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "jd_id", nullable = false, updatable = false)
	private int jobId;

	@Column(name = "job_title", nullable = false)
	private String jobTitle;

	@Column(name = "job_desc", nullable = false, length = 2000)
	private String jobDescription;
	
	@Column(name = "min_years", nullable = false)
	private int minYrs;
	
	@Column(name = "max_years", nullable = false)
	private int maxYrs;
	
	@Column(name = "open_positions", nullable = false)
	private int openPositions;

	@Column(name = "created_by", nullable = false)
	private String createdBy;

	@Column(name = "modified_by", nullable = false)
	private String modifiedBy;

	@Column(name = "created_at")
	@Temporal(TemporalType.DATE)
	private Date createdAt = new Date(System.currentTimeMillis());

	@Temporal(TemporalType.DATE)
	@Column(name = "modified_at")
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
