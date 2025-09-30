package com.jdc.school_mgmt_sys;

public class Classroom {
	private String classId; // unique
	private String className; // Grade 10-A
	private Teacher teacher; // assign to classroom
	private Student[] students; // to store students in classroom
	private int studentCount; // trace num of Student
	private static final int MAX_STUDENTS = 5; // max Students per classroom

	public Classroom(String classId, String className) {
		this.classId = classId;
		this.className = className;
		this.students = new Student[MAX_STUDENTS];
		this.studentCount = 0;
	}

	// assign a teacher to the classroom
	public void assignTeacher(Teacher teacher) {
		this.teacher = teacher;
		System.out.println("Teacher assigned :" + teacher.getDetails() + " "+"to"+" " + className);
	}

	public boolean addStudent(Student student) {
		if (studentCount < MAX_STUDENTS) {
			students[studentCount] = student;
			studentCount++;
			System.out.println("Student assigned : " + student.getDetails() +" " +"to"+" " + className);
			return true;
		}
		return false;
	}

	public String getDetails() {
		String teacherDetails = (teacher != null) ? teacher.getName() : "No teacher!!";
		return String.format("Classroom :: ID = %s, Name = %s, Teacher = %s Student Count = %d", classId, className,
				teacherDetails, studentCount);
	}

	public void displayStudents() {
		if (studentCount == 0) {
			System.out.println("No Students in " + className);
		} else {
			System.out.println("\nStudents in" + className + "\n***************************************************");
			for (int i = 0; i < studentCount; i++) {
				System.out.println(students[i].getDetails());
			}
		}
	}

	public String getClassId() {
		return classId;
	}
}