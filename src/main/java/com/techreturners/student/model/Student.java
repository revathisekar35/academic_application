package com.techreturners.student.model;


public class Student {
	private int id;
	private String firstName;
	private String lastName;
	private char grade;
	private int group;
	private String secretName;
	
	public Student(String firstName, String lastName,char grade,int group,int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
		this.group = group;
		this.id = id;
	}
	

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public char getGrade() {
		return grade;
	}

	public int getGroup() {
		return group;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public void setSecretName(String secretName) {
		this.secretName = secretName;
	}

}
