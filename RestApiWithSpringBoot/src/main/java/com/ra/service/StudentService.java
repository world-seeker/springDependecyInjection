package com.ra.service;

import java.util.List;

import com.ra.data.Student;

public interface StudentService
{

    Iterable<Student> all();

    Student get( int studentId );

    void save( Student student );

    void delete( int studentId );
    
    void update(int studentId,Student updatedStudent);
    
    List<Student> findStudentsByNameStartsWith(String namePrefix);
}