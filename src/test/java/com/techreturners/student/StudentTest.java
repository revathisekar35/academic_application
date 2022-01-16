package com.techreturners.student;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StudentTest {
	/**
	 *
	 * StudentS Mock data details:
	 * 
	 * Student stud1 = new Student("Prish", "Log", 'a', 1, 11); 
	 * Student stud2 = new Student("July", "Dan", 'b', 2, 12); 
	 * Student stud3 = new Student("Maya","Karan", 'c', 3, 13); 
	 * Student stud4 = new Student("Jack", "Ken", 'd', 1, 14);
	 * Student stud5 = new Student("Rev", "Sek", 'e', 4, 15);
	 * Student stud6 = new Student("Nad", "Kan", 'f', 5, 16);
	 */

	private StudentInfoImpl student;

	@Before
	public void setUp() {
		student = new StudentInfoImpl();

	}

	@Rule
	public ExpectedException expectedEx = ExpectedException.none();

	@Test
	public void getStudenGradeTest() {
		assertEquals('F', student.getStudenGrade(16));
	}

	@Test
	public void upgradeStudentGradeTest() throws Exception {
		assertEquals("Rev Sek grade updated from E to D", student.upgradeStudentGrade(15));
	}

	@Test
	public void downGradeStudentGradeTest() throws Exception {
		assertEquals("Rev Sek grade updated from E to F", student.downGradeStudentGrade(15));
	}

	@Test
	public void updateStudentGroupTest() throws Exception {
		assertEquals("Jack Ken updated group from 1 to 3", student.updateStudentGroup(14, 3));
	}

	@Test
	public void getStudentNameTest() {
		assertEquals("Student Full Name : Prish Log", student.getStudentName(11));
		assertEquals("Student Full Name : Maya Karan", student.getStudentName(13));
	}

	@Test
	public void getStudentDetailTest() {
		assertEquals("Student Full Name : Prish Log, Grade : A, Group : 1", student.getStudentDetail(11));
		assertEquals("Student Full Name : Nad Kan, Grade : F, Group : 5", student.getStudentDetail(16));
	}

	@Test
	public void updateStudentDetailTest() throws Exception {
		assertEquals("Nad Kan updated information are:\n Mealtype :Free\n Age: 10\n ContactNo: 123456789\n",
				student.updateStudentDetail(16));
		assertEquals("Prish Log updated information are:\n Mealtype :Free\n Age: 10\n ContactNo: 123456789\n",
				student.updateStudentDetail(11));

	}

	@Test
	public void removeStudentTest() throws Exception {
		student.removeStudent(13);
		assertEquals(5, student.studentList.size());

	}

	@Test
	public void shouldThrowExceptionWhenTheStudentUpgradeFromMAXGrade() throws Exception {
		expectedEx.expect(Exception.class);
		expectedEx.expectMessage("Cannot upgrade the student. Student already have a maximum grade ");
		student.upgradeStudentGrade(11);
	}

	@Test
	public void shouldThrowExceptionWhenTheStudentDowngradeFromMINGrade() throws Exception {
		expectedEx.expect(Exception.class);
		expectedEx.expectMessage("Cannot downgrade the student. Student already have a minimum grade ");
		student.downGradeStudentGrade(16);
	}

	@Test
	public void shouldThrowExceptionWhenTheStudentUpdateWithInvalidGroup() throws Exception {
		expectedEx.expect(Exception.class);
		expectedEx.expectMessage("Student group doesn't exit.");
		student.updateStudentGroup(16, 9);
	}

}
