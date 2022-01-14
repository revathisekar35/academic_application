package com.techreturners.student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.techreturners.school.School;

public class StudentInfoImpl implements StudentInfo {
	private char MAXGRADE = 'f';
	private char MINGRADE = 'a';
	private int MAXGROUP = 1;
	private int MINGROUP = 5;
	List<Student> studentList = new ArrayList<Student>();

	public StudentInfoImpl() {
		Student stud1 = new Student("Prish", "Log", 'a', 1, 11);
		Student stud2 = new Student("July", "Dan", 'b', 2, 12);
		Student stud3 = new Student("Maya", "Karan", 'c', 3, 13);
		Student stud4 = new Student("Jack", "Ken", 'd', 1, 14);
		Student stud5 = new Student("Rev", "Sek", 'e', 4, 15);
		Student stud6 = new Student("Nad", "Kan", 'f', 5, 16);
		studentList.add(stud1);
		studentList.add(stud2);
		studentList.add(stud3);
		studentList.add(stud4);
		studentList.add(stud5);
		studentList.add(stud6);
	}

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

	public char getStudenGrade(int studentId) {
		return getStudentById(studentId).getGrade();
	}

	public String upgradeStudentGrade(int studentId) throws Exception {
		Student stud = getStudentById(studentId);
		char currentGrade = stud.getGrade();
		if (currentGrade == MAXGRADE) {
			throw new Exception("Cannot upgrade the student. Student already have a maximun grade ");
		}
		char upgrade = (char) (currentGrade - 1);
		stud.setGrade(upgrade);
		return stud.getFirstName() + " " + stud.getLastName() + " grade updated from " + currentGrade + " to "
				+ upgrade;
	}

	public String downGradeStudentGrade(int studentId) throws Exception {
		Student stud = getStudentById(studentId);
		char currentGrade = stud.getGrade();
		if (currentGrade == MINGRADE) {
			throw new Exception("Cannot downgrade the student. Student already have a minimum grade ");
		}
		char downGrade = (char) (currentGrade + 1);
		stud.setGrade(downGrade);
		return stud.getFirstName() + " " + stud.getLastName() + " grade updated from " + currentGrade + " to "
				+ downGrade;
	}

	public String updateStudentGroup(int studentId, int group) throws Exception {
		Student stud = getStudentById(studentId);
		int currentGroup = stud.getGroup();
		if (group == MAXGROUP || group == MINGROUP) {
			throw new Exception("Student group doesn't exit.");
		}
		stud.setGroup(group);
		return stud.getFirstName() + " " + stud.getLastName() + " updated group from " + currentGroup + " to "
				+ stud.getGroup();
	}

	public String getStudentName(int studentId) {
		Student student = getStudentById(studentId);
		return "Student Full Name : " + student.getFirstName() + " " + student.getLastName();
	}

	public String getStudentDetail(int studentId) {
		Student student = getStudentById(studentId);
		return "Student Full Name : " + student.getFirstName() + " " + student.getLastName() + ", Grade : "
				+ student.getGrade() + ", Group : " + student.getGroup();
	}

	public Student editStudentDetail(int studentId) {
		Student student = getStudentById(studentId);
		return student;
	}

	public String updateStudentDetail(int studentId) {
		Student student = getStudentById(studentId);
		student.setMealType("Free");
		student.setAge(10);
		student.setContactNumber("123456789");
		School school = new School();
		student.setSchool(school);
		return student.getFirstName() + " " + student.getLastName() + " updated information are:\n Mealtype :"
				+ student.getMealType() + "\n Age: " + student.getAge() + "\n ContactNo: " + student.getContactNumber()
				+ "\n";
	}

	public void deleteStudent(int studentId) {
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
