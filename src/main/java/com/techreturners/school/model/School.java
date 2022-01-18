package com.techreturners.school.model;

public class School {
	private int id; 
	private String name;
	private String stade;
	private String address;
	private int studentCapacity;
	private int teacherCapacity;
	private String ofstedRate;
	private int fundType;
	private int contactNo;
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getStade() {
		return stade;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getStudentCapacity() {
		return studentCapacity;
	}
	
	public int getTeacherCapacity() {
		return teacherCapacity;
	}
	
	public String getOfstedRate() {
		return ofstedRate;
	}
	
	public int getFundType() {
		return fundType;
	}
	
	public int getContactNo() {
		return contactNo;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setStade(String stade) {
		this.stade = stade;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setStudentCapacity(int studentCapacity) {
		this.studentCapacity = studentCapacity;
	}
	
	public void setTeacherCapacity(int teacherCapacity) {
		this.teacherCapacity = teacherCapacity;
	}
	
	public void setOfstedRate(String ofstedRate) {
		this.ofstedRate = ofstedRate;
	}
	
	public void setFundType(int fundType) {
		this.fundType = fundType;
	}
	
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}


}
