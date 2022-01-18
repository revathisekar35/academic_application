package com.techreturners.student.model;

import com.techreturners.school.model.School;

public class Student {
	private int id;
	private String firstName;
	private String lastName;
	private char grade;
	private int group;
	private String secretName;
	private int age;
	private String studentClass;
	private String address;
	private String contactNumber;
	private String mealType;
	private School school;
	
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

	public int getAge() {
		return age;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public String getAddress() {
		return address;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public String getMealType() {
		return mealType;
	}

	public School getSchool() {
		return school;
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

	public void setAge(int age) {
		this.age = age;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public void setMealType(String mealType) {
		this.mealType = mealType;
	}

	public void setSchool(School school) {
		this.school = school;
	}

}
