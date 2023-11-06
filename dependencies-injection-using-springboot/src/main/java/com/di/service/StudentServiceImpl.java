package com.di.service;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.di.model.Student;
import com.di.repository.StudentRepository;



public class StudentServiceImpl implements StudentService {
  
	@Autowired
  public StudentRepository studentRepository;
	
	
	@Override
	public Student add(Student student) {
		
		return studentRepository.save(student);
		
	}

	@Override
	public String delete(Long id) {
		studentRepository.deleteById(id);
		return "Students got deleted successfully!!";
		
	}

	@Override
	public ArrayList<Student> all() {
		List<Student> studentsList = studentRepository.findAll();
        // Convert the List to an ArrayList
        ArrayList<Student> studentsArrayList = new ArrayList<>(studentsList);
        return studentsArrayList;
	}

	@Override
	public Student findById(Long id) {
		Student s=studentRepository.findById(id).get();
		return s;
		
	}

	@Override
	public HashMap<Long, Student> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
