package com.jdc.school_mgmt_sys;

public class SchoolManagementSystem {
	private String schoolName;
	private Managable[] people; // stu array vs teacher using manageable interface
	private Classroom[] classrooms; // to store classroom 
	private int personCount; // trace num of classroom
	private int classroomCount;
	private static final int MAX_PEOPLE = 20;
	private static final int MAX_CLASSROOM = 5;
	
	public SchoolManagementSystem(String schoolName) {
		this.schoolName = schoolName;
		this.people = new Managable[MAX_PEOPLE]; // Initialize people array with manageable type
		this.classrooms = new Classroom[MAX_CLASSROOM];
		this.personCount = 0;
		this.classroomCount = 0;
	}
	
	// add a person (stu vs teacher)
	public boolean addPerson(Managable person) {
		if(personCount < MAX_PEOPLE) {
			people[personCount] = person;
			personCount ++;
			System.out.println("Added : "+ person.getDetails());
			return true;
		}
		System.out.println("System is full.");
		return false;
	}
	
	public boolean addClassroom(Classroom classroom) {
		if(classroomCount < MAX_CLASSROOM) {
			classrooms[classroomCount] = classroom;
			classroomCount ++;
			System.out.println("Added: " + classroom.getDetails());
			return true;
		}
		System.out.println("System is full.");
		return false;
	}
	
	// Assign a teacher to classroom
	public boolean assignTeacherToClassroom(String teacherId, String classId) {
		Managable person = findPerson(teacherId);
		Classroom classroom = findClassroom(classId);
		if(person != null && classroom != null && person instanceof Teacher) {
			classroom.assignTeacher((Teacher)person);
			return true;
		}
		
		return false;
	}
	
	// Add a student to classroom
	public boolean addStudentToClassroom(String studentId, String classId) {
		Managable person = findPerson(studentId);
		Classroom classroom = findClassroom(classId);
		if(person != null && classroom != null && person instanceof Student) {
			return classroom.addStudent((Student)person);
		}
		
		return false;
	}

	public Classroom findClassroom(String classId) {
		for(int i = 0; i < classroomCount; i++) {
			if(classrooms[i].getClassId().equals(classId)) {
				return classrooms[i];
			}
		}
		return null;
	}

	public Managable findPerson(String teacherId) {
		for(int i = 0; i < classroomCount; i++) {
			if(people[i].getId().equals(teacherId)) {
				return people[i];
			}
		}
		return null;
	}
	
	//Display all people
	public void displayPeople() {
		if(personCount == 0) {
			System.err.println("No People in " + schoolName);
		}
		else {
			System.out.println("\nPeople list in "+ schoolName + "\n***********************************");
			for(int i = 0; i < personCount; i++) {
				System.out.println(people[i].getDetails());
			}
		}
	}
	
	public void displayClassrooms() {
		if(classroomCount == 0) {
			System.err.println("No Classrooms in "+ schoolName);
		}
		else {
			System.out.println("\nClassroom list in "+ schoolName + "\n*********************************");
			for(int i = 0; i < classroomCount; i++) {
				System.out.println(classrooms[i].getDetails());
				classrooms[i].getClassId();
			}
		}
	}
	

}
