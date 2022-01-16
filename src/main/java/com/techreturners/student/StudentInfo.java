package com.techreturners.student;

public interface StudentInfo {

	char getStudenGrade(int studentId);

	String upgradeStudentGrade(int studentId) throws Exception;

	String downGradeStudentGrade(int studentId) throws Exception;

	String updateStudentGroup(int studentId, int group) throws Exception;

	String getStudentName(int studentId);

	String getStudentDetail(int studentId);

	Student editStudentDetail(int studentId);

	String updateStudentDetail(int studentId);

	void removeStudent(int studentId);

}
