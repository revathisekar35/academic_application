package com.techreturners.student.service;

import java.util.ArrayList;
import java.util.List;

import com.techreturners.student.model.Student;
import com.techreturners.student.model.StudentInfo;

public class StudentInfoImpl implements StudentInfo {
	public List<Student> studentList = new ArrayList<Student>();

	public enum Grade {
		MAX_GRADE('A'), MIN_GRADE('F');
		public char grade;
		Grade(char grade){
			this.grade = grade;
		}

	}

	public enum Group{
		MAX_GROUP(5),MIN_GROUP(1);
		int group;
		Group(int group){
			this.group = group;
		}
	}
	public StudentInfoImpl() {
		studentList.add(new Student("Prish", "Log", 'A', 1, 11));
		studentList.add(new Student("July", "Dan", 'B', 2, 12));
		studentList.add(new Student("Maya", "Karan", 'C', 3, 13));
		studentList.add(new Student("Jack", "Ken", 'D', 1, 14));
		studentList.add(new Student("Rev", "Sek", 'E', 4, 15));
		studentList.add(new Student("Nad", "Kan", 'F', 5, 16));
	}

	/**
	 * Get student object for given id
	 * 
	 * @param studentId
	 * @return Student
	 */
	private Student getStudentById(int studentId) {
		try {
			Student student = studentList.stream().filter(n -> n.getId() == studentId).findAny().orElse(null);
			if (student != null) {
				return student;
			}
		} catch (NullPointerException ne) {
			System.out.println("Student is Null");
		} catch (Exception e) {
			System.out.println("Exception in getStudentById " + e.getMessage());
		}
		return null;
	}

	/**
	 * Get student grade by given student id
	 */
	public char getStudenGrade(int studentId) {
		return getStudentById(studentId).getGrade();
	}

	/**
	 * This method used to upgrade the student if it reach MAX grade will throw
	 * exception
	 */
	public String upgradeStudentGrade(int studentId) throws Exception {
		Student stud = getStudentById(studentId);
		char currentGrade = stud.getGrade();
		if (currentGrade == Grade.MAX_GRADE.grade) {
			throw new Exception("Cannot upgrade the student. Student already have a maximum grade ");
		}
		char upgrade = (char) (currentGrade - 1);
		stud.setGrade(upgrade);
		return stud.getFirstName() + " " + stud.getLastName() + " grade updated from " + currentGrade + " to "
				+ upgrade;
	}

	/**
	 * This method used to downgrade the student if it reach MIN grade will throw
	 * exception
	 */
	public String downGradeStudentGrade(int studentId) throws Exception {
		Student stud = getStudentById(studentId);
		char currentGrade = stud.getGrade();
		if (currentGrade == Grade.MIN_GRADE.grade) {
			throw new Exception("Cannot downgrade the student. Student already have a minimum grade ");
		}
		char downGrade = (char) (currentGrade + 1);
		stud.setGrade(downGrade);
		return stud.getFirstName() + " " + stud.getLastName() + " grade updated from " + currentGrade + " to "
				+ downGrade;
	}

	/***
	 * This method used to update the student group. If group doen't exit it will
	 * throw exception
	 */
	public String updateStudentGroup(int studentId, int group) throws Exception {
		Student stud = getStudentById(studentId);
		int currentGroup = stud.getGroup();
		if (group >= Group.MAX_GROUP.group || group <= Group.MIN_GROUP.group) {
			throw new Exception("Student group doesn't exit.");
		}
		stud.setGroup(group);
		return stud.getFirstName() + " " + stud.getLastName() + " updated group from " + currentGroup + " to "
				+ stud.getGroup();
	}

	/**
	 * This method will return the student fullname
	 */
	public String getStudentName(int studentId) {
		Student student = getStudentById(studentId);
		return "Student Full Name : " + student.getFirstName() + " " + student.getLastName();
	}

	/**
	 * This method will return the student detail
	 */
	public String getStudentDetail(int studentId) {
		Student student = getStudentById(studentId);
		return "Student Full Name : " + student.getFirstName() + " " + student.getLastName() + ", Grade : "
				+ student.getGrade() + ", Group : " + student.getGroup();
	}

	public Student editStudentDetail(int studentId) {
		Student student = getStudentById(studentId);
		return student;
	}

	/**
	 * This method is used to delete the student .
	 */
	public void removeStudent(int studentId) {
		System.out.println("\nStudent list before deletion:\n");
		studentList.stream().forEach(n -> {
			System.out.println("Remaining student Id's : " + n.getId());
		});
		Student student = getStudentById(studentId);
		studentList.remove(student);
		System.out.println("\nStudent list after deletion:\n");
		studentList.stream().forEach(n -> {
			System.out.println("Remaining student Id's : " + n.getId());
		});
	}

}
