package com.backend.StudentManagmentSystem.repostatory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.StudentManagmentSystem.entity.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
