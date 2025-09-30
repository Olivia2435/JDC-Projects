package com.jdc.school_mgmt_sys;

public class Main {
	public static void main(String[] args) {
		SchoolManagementSystem sys = new SchoolManagementSystem("Java Developer Class");
		
		//Create Students
		Student  student1 = new Student("S001","Olivia","olivia@gmail.com","Grade 12");
		Student  student2 = new Student("S002","Tarry","tarry@gmail.com","Grade 11");
		Student  student3 = new Student("S003","Juu","juu@gmail.com","Grade 10");
		
		//Create Teachers
		Teacher  teacher1 = new Teacher("T001","Kyaw Kyaw Lwin","kkl@gmail.com","Spring");
		Teacher  teacher2 = new Teacher("T002","Min Khant Thu","mkt@gmail.com","Database");
		
		//Add people to the system
		System.out.println("Adding Person To Classroom\n***************************");
		sys.addPerson(student1);
		sys.addPerson(student2);
		sys.addPerson(student3);
		
		sys.addPerson(teacher1);
		sys.addPerson(teacher2);
		System.out.println();
		
		Classroom c1 = new Classroom("C001", "Grade 10-A");
		Classroom c2 = new Classroom("C002", "Grade 11-B");
	
		System.out.println("Adding Classroom\n******************");
		sys.addClassroom(c1);
		sys.addClassroom(c2);
		
		// assign teacher to classroom
		sys.addStudentToClassroom("T001", "C001");
		sys.assignTeacherToClassroom("T002", "C002");
		
		sys.addStudentToClassroom("S001", "C001");
		sys.addStudentToClassroom("S002", "C001");
		sys.addStudentToClassroom("S003", "C002");
		System.out.println();
		
		sys.displayPeople();
		
		System.out.println("\nDisplay Classroom\n***********************");
		sys.displayClassrooms();
	}
	

}
