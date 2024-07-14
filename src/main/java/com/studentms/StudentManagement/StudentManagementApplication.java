package com.studentms.StudentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.studentms.StudentManagement.Entity.Student;
import com.studentms.StudentManagement.Repository.StudentRepository;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Student student1 = new Student("abc", "bca", "abcbca@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("abc", "bca", "abcbca@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("abc", "bca", "abcbca@gmail.com");
//		studentRepository.save(student3);
		
	}

}
