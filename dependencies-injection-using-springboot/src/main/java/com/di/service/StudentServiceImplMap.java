package com.di.service;





import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.di.model.Student;
import com.di.repository.StudentRepository;


@Service
public class StudentServiceImplMap implements StudentService {
  
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
    public HashMap<Long, Student> getAll() {
        List<Student> studentsList = studentRepository.findAll();
        HashMap<Long, Student> studentsMap = new HashMap<>();

        for (Student student : studentsList) {
            // Assuming student.getId() returns the unique identifier (e.g., student ID)
            studentsMap.put(student.getIdStudent(), student);
        }

        return studentsMap;
    }


	@Override
	public Student findById(Long id) {
		Student s=studentRepository.findById(id).get();
		return s;
		
	}

	@Override
	public List<Student> all() {
		// TODO Auto-generated method stub
		return null;
	}

}
