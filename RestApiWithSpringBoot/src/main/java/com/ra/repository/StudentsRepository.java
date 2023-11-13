package com.ra.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ra.data.Student;

public interface StudentsRepository
    extends JpaRepository<Student, Integer>
{

    Student findById( int id );

    List<Student> findByNameStartsWith(String namePrefix);

}