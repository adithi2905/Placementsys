package com.entitylayer;

public class Post {
	private int jobid;
	private String title;
	private String company;
	private String location;
	private String type;
	private String dept;
	private String presd;
	private String ond;
	private String ind;
	public int getJobid() {
		return jobid;
	}
	public void setJobid(int jobid) {
		this.jobid = jobid;
	}
	@Override
	public String toString()
	{
		return title+"\n"+company+"\n"+location+"\n"+type+"\n"+dept+"\n"+presd+"\n"+ond+"\n"+ind;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getPresd() {
		return presd;
	}
	public void setPresd(String presd) {
		this.presd = presd;
	}
	public String getOnd() {
		return ond;
	}
	public void setOnd(String ond) {
		this.ond = ond;
	}
	public String getInd() {
		return ind;
	}
	public void setInd(String ind) {
		this.ind = ind;
	}
	

}
