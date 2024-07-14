package com.studentms.StudentManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentms.StudentManagement.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
