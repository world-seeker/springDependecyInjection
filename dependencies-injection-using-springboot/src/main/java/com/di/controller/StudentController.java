package com.di.controller;



import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.di.model.Student;
import com.di.service.StudentService;

@RestController
public class StudentController
{

    private final StudentService studentService;

    public StudentController( @Autowired StudentService studentService )
    {
        this.studentService = studentService;
    }

    @GetMapping( "/student/{id}" )
    Student findById( @PathVariable( "id" ) Long id )
    {
        return studentService.findById( id );
    }
    
    @PostMapping("/student")
    public Student add(@RequestBody Student student){
    	
    	return studentService.add(student);
    }
    
    @DeleteMapping("/deleteStudent/{id}")
	String deleteStudent(@PathVariable Long id)
	{
		return studentService.delete(id);
	}
    
    @GetMapping("/student")
    public HashMap<Long,Student> getAll(){
    	return studentService.getAll();
    }
    
    
    
}
