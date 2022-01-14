package com.techreturners.school;

import com.techreturners.student.Student;
import com.techreturners.student.StudentInfoImpl;

public class AppMain {

	public static void main(String[] args) throws Exception {
		/**Student detils:
		 * 
		 * 	Student stud1 = new Student("Prish", "Log", 'a', 1, 11);
			Student stud2 = new Student("July", "Dan", 'b', 2, 12);
			Student stud3 = new Student("Maya", "Karan", 'c', 3, 13);
			Student stud4 = new Student("Jack", "Ken", 'd', 1, 14);
			Student stud5 = new Student("Rev", "Sek", 'e', 4, 15);
			Student stud6 = new Student("Nad", "Kan", 'f', 5, 16);
		 */
		
		StudentInfoImpl student = new StudentInfoImpl();
		//get student grade
		System.out.println("-------------------------");
		System.out.println(" Get student Grade");
		System.out.println("-------------------------\n");
		System.out.println("Student Grade is : "+student.getStudenGrade(11));
		
		//Update student grade
		System.out.println("\n-------------------------");
		System.out.println("Upgrade Student Grade");
		System.out.println("-------------------------\n");
		System.out.println(student.upgradeStudentGrade(13));
		
		System.out.println("\n-------------------------");
		System.out.println("Downgrade Student Grade");
		System.out.println("-------------------------\n");
		System.out.println(student.downGradeStudentGrade(15));
		

		System.out.println("\n-------------------------");
		System.out.println("Downgrade Student Grade");
		System.out.println("-------------------------\n");
		System.out.println(student.downGradeStudentGrade(15));
		
		System.out.println("\n-------------------------");
		System.out.println("Update Student Group");
		System.out.println("-------------------------\n");
		System.out.println(student.updateStudentGroup(11,3));
		
		System.out.println("\n-------------------------");
		System.out.println("Get Student Fullname");
		System.out.println("-------------------------\n");
		System.out.println(student.getStudentName(11));
		
		System.out.println("\n-------------------------");
		System.out.println("Get Student Fullname");
		System.out.println("-------------------------\n");
		System.out.println(student.getStudentName(11));
		

	}

}
