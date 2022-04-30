package com.dizitalpods.Project.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jobdetails")
public class Jobdetails{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private int jobid;
	private String jobname;
	private String jobtype;
	private String jobvacancy;
	private String jobdesc;
	public Jobdetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Jobdetails(int jobid, String jobname, String jobtype, String jobvacancy, String jobdesc) {
		super();
		this.jobid = jobid;
		this.jobname = jobname;
		this.jobtype = jobtype;
		this.jobvacancy = jobvacancy;
		this.jobdesc = jobdesc;
	}
	public int getJobid() {
		return jobid;
	}
	public void setJobid(int jobid) {
		this.jobid = jobid;
	}
	public String getJobname() {
		return jobname;
	}
	public void setJobname(String jobname) {
		this.jobname = jobname;
	}
	public String getJobtype() {
		return jobtype;
	}
	public void setJobtype(String jobtype) {
		this.jobtype = jobtype;
	}
	public String getJobvacancy() {
		return jobvacancy;
	}
	public void setJobvacancy(String jobvacancy) {
		this.jobvacancy = jobvacancy;
	}
	public String getJobdesc() {
		return jobdesc;
	}
	public void setJobdesc(String jobdesc) {
		this.jobdesc = jobdesc;
	}
	
	}
