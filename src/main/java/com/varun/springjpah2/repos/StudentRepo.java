package com.varun.springjpah2.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.varun.springjpah2.entities.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

}
