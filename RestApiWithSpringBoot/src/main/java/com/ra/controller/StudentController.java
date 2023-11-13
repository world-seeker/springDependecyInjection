package com.ra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ra.data.Student;
import com.ra.service.StudentService;

@RestController
public class StudentController {

	private StudentService studentService;
	
	public StudentController(@Autowired StudentService studentService) {
		this.studentService =studentService;
	}
	
	@GetMapping("/student")
	public Iterable<Student> all() {
		return studentService.all();
	}
	
	@GetMapping("/student/{id}")
    public Student get(@PathVariable("id") int studentId )
    {
        return  studentService.get(studentId);
    }
	
	@PostMapping("/student")
	public void save(@RequestBody Student student) {
	  studentService.save(student);	
	}
	
	@DeleteMapping("/student/{id}")
	public void delete(@PathVariable int id) {
		studentService.delete(id);
	}
	
	@PutMapping("/student/{id}")
	public void  update(@PathVariable int id,@RequestBody Student student) {
		studentService.update(id, student);
	}
	
	@GetMapping("/byName")
    public List<Student> findStudentsByNameStartsWith(@RequestParam("name") String namePrefix) {
        return studentService.findStudentsByNameStartsWith(namePrefix);
    }
	
	
}