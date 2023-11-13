package com.ra.service;




import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ra.data.Student;
import com.ra.repository.StudentsRepository;

@Service
public class StudentServiceMySQL
    implements StudentService
{

    private final StudentsRepository studentsRepository;

    public StudentServiceMySQL( @Autowired StudentsRepository studentsRepository )
    {
        this.studentsRepository = studentsRepository;
    }

    @Override
    public Iterable<Student> all()
    {
        return studentsRepository.findAll();
    }

    @Override
    public Student get( int studentId )
    {
        return studentsRepository.findById( studentId );
    }

    @Override
    public void save( Student student )
    {
        studentsRepository.save( student );
    }

    @Override
    public void delete( int studentId )
    {
        studentsRepository.deleteById( studentId );
    }
    
    @Override
    public List<Student> findStudentsByNameStartsWith(String namePrefix) {
        return studentsRepository.findByNameStartsWith(namePrefix);
    }
    

    @Override
    public void update(int studentId, Student updatedStudent) {
        Optional<Student> optionalStudent = Optional.of(studentsRepository.findById(studentId));

        if (optionalStudent.isPresent()) {
            Student existingStudent = optionalStudent.get();

            // Update the fields of the existing student with the values from the updatedStudent
            existingStudent.setName(updatedStudent.getName());
            existingStudent.setAddress(updatedStudent.getAddress());
            existingStudent.setEmail(updatedStudent.getEmail());
            existingStudent.setBirthDate(updatedStudent.getBirthDate());

            // Save the updated student back to the database
            studentsRepository.save(existingStudent);
        } else {
            // Handle the case where the student with the given ID is not found
            // You can throw an exception or handle it based on your application's requirements
        }
    }

}