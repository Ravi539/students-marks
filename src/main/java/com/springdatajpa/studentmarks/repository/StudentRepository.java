package com.springdatajpa.studentmarks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springdatajpa.studentmarks.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>
{

}
