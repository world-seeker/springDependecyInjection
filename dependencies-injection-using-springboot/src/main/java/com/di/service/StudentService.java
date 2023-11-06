package com.di.service;



import java.util.HashMap;
import java.util.List;

import com.di.model.Student;

public interface StudentService
{
    Student add( Student student );

    String delete( Long id );

    List<Student> all();
    
    HashMap<Long,Student> getAll();

    Student findById( Long id );

}
