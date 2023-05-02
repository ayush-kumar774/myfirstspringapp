package com.learn.cruddemo;

import com.learn.cruddemo.dao.StudentDAO;
import com.learn.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			//createStudent(studentDAO);
			//createMultipleStudents(studentDAO);
			//readStudent(studentDAO);
			//queryForStudents(studentDAO);
			//queryForStudentsByLastName(studentDAO);
			updateStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		// create the student object
		System.out.println("Creating multiple student objects ...");
		Student tempStudent = new Student("Paul", "Deo", "paul@luv2code.com");

		// save the student object
		System.out.println("Saving the student ...");
		studentDAO.save(tempStudent);

		// display id of the saved student
		System.out.println("Saved student. Generated id: " + tempStudent.getId());
	}

	private void createMultipleStudents (StudentDAO studentDAO) {
		// create the student object
		System.out.println("Creating new student object ...");
		Student tempStudent1 = new Student("Steve", "Rogers", "captain.america@avengers.com");
		Student tempStudent2 = new Student("Tony", "Stark", "ironman@avengers.com");
		Student tempStudent3 = new Student("Natasha", "Roman-off", "black.widow@avengers.com");

		// save the student object
		System.out.println("Saving the students ...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

		// display id of the saved student
		System.out.println("Saved students.");
		System.out.println("Generated id #1 = : " + tempStudent1.getId());
		System.out.println("Generated id #2 = : " + tempStudent2.getId());
		System.out.println("Generated id #3 = : " + tempStudent3.getId());
	}

	private void readStudent(StudentDAO studentDAO) {

		// create a student object
		System.out.println("Creating new student object ...");
		Student tempStudent = new Student("Daffy" , "Duck", "daffy@duck.com") ;

		// save the student
		System.out.println("Saving the student ...");
		studentDAO.save(tempStudent);

		// display id of the saved student
		int studentId = tempStudent.getId();
		System.out.println("Saved the student ");
		System.out.println("Generated id is - " + studentId);

		// retrieve student bases on the id : primary key
		System.out.println("Retrieving student with id " + studentId);
		Student myStudent = studentDAO.findById(studentId);

		// display student
		System.out.println("Found the student: " + myStudent);
	}

	private void queryForStudents(StudentDAO studentDAO) {

		//get list of students
		List<Student> theStudents = studentDAO.findAll();

		// display list of students
		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {

		//get list of students
		List<Student> theStudents = studentDAO.findByLastName("Stark");

		// display list of students
		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

	private void updateStudent(StudentDAO studentDAO) {
		// find the student on the basis of id : primary key
		int studentId = 4 ;
		System.out.println("Getting student with ID: " + studentId);
		Student myStudent = studentDAO.findById(studentId);
		System.out.println("Updating student ...");

		// update the first name to "Scooby"
		myStudent.setFirstName("Scooby");
		studentDAO.update(myStudent);

		// display updated student
		System.out.println("Updated student: " + myStudent);
	}

}
