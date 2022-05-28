package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Student Name is Amuthan");
	}

	public void studentDept() {
		System.out.println("Student Department is BioTech");
	}

	public void studentId() {
		System.out.println("Student ID is BT0032");
	}

	public static void main(String[] args) {
		Student studentInfo = new Student();
		studentInfo.collegeCode();
		studentInfo.collegeName();
		studentInfo.collegeRank();
		studentInfo.deptName();
		studentInfo.studentName();
		studentInfo.studentDept();
		studentInfo.studentId();

	}

}
