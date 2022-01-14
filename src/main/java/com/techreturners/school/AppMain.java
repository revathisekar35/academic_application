package com.techreturners.school;

import com.techreturners.student.Student;
import com.techreturners.student.StudentInfoImpl;

public class AppMain {

	public static void main(String[] args) throws Exception {
		/**
		 *
		 * Student Mock data details:
		 * 
		 * Student stud1 = new Student("Prish", "Log", 'a', 1, 11); 
		 * Student stud2 = new Student("July", "Dan", 'b', 2, 12); 
		 * Student stud3 = new Student("Maya","Karan", 'c', 3, 13); 
		 * Student stud4 = new Student("Jack", "Ken", 'd', 1, 14);
		 * Student stud5 = new Student("Rev", "Sek", 'e', 4, 15);
		 * Student stud6 = new Student("Nad", "Kan", 'f', 5, 16);
		 */

		StudentInfoImpl student = new StudentInfoImpl();
		// get student grade
		System.out.println("-------------------------");
		System.out.println(" Get student Grade");
		System.out.println("-------------------------\n");
		System.out.println("Student Grade is : " + student.getStudenGrade(11));

		// Upgrade student grade
		System.out.println("\n-------------------------");
		System.out.println("Upgrade Student Grade");
		System.out.println("-------------------------\n");
		System.out.println(student.upgradeStudentGrade(13));

		// Downgrade student grade
		System.out.println("\n-------------------------");
		System.out.println("Downgrade Student Grade");
		System.out.println("-------------------------\n");
		System.out.println(student.downGradeStudentGrade(15));

		// Update student group
		System.out.println("\n-------------------------");
		System.out.println("Update Student Group");
		System.out.println("-------------------------\n");
		System.out.println(student.updateStudentGroup(11, 3));

		// Get student fullname
		System.out.println("\n-------------------------");
		System.out.println("Get Student Fullname");
		System.out.println("-------------------------\n");
		System.out.println(student.getStudentName(11));

		// Get student details
		System.out.println("\n-------------------------");
		System.out.println("Get Student Details");
		System.out.println("-------------------------\n");
		System.out.println(student.getStudentDetail(11));

		// update student details
		System.out.println("\n-------------------------");
		System.out.println("Update Student Details");
		System.out.println("-------------------------\n");
		/**
		 * can update Student stud6 = new Student("Nad", "Kan", 'f', 5, 16); this
		 * student
		 */
		System.out.println(student.updateStudentDetail(16));

		// Delete student Details
		System.out.println("\n-------------------------");
		System.out.println("Delete Details");
		System.out.println("-------------------------\n");
		student.deleteStudent(13);
	}

}
