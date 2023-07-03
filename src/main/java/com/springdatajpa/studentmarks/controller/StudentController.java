package com.springdatajpa.studentmarks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springdatajpa.studentmarks.entity.Student;
import com.springdatajpa.studentmarks.repository.StudentRepository;
import java.util.*
;@RestController
public class StudentController
{
 

    @Autowired
	private StudentRepository studentRepository;
	
	@PostMapping("/students")
    public ResponseEntity<String> createStudents(@RequestBody List<String> studentDataList)
    {
		 for (String studentData : studentDataList) 
		 {
             String[] data = studentData.trim().split(" ");
             
             
 	        if (data.length != 7)
 	        {
 	            return ResponseEntity.badRequest().body("Invalid student data format");
 	        }
 	        
 	       Student student=new Student();
 	       
 	       student.setName(data[0]);
           student.setId(Integer.parseInt(data[1]));
           student.setRollNo(Integer.parseInt(data[2]));
           student.setMathMarks(Integer.parseInt(data[3]));
           student.setEnglishMarks(Integer.parseInt(data[4]));
           student.setSocialMarks(Integer.parseInt(data[5]));
           student.setScienceMarks(Integer.parseInt(data[6]));

           studentRepository.save(student);
		 }
		 return ResponseEntity.ok("Students created successfully");
    }
	
	@GetMapping("/listofstudents")
	public ResponseEntity<List<Student>> getAllStudents() {
	    List<Student> students = studentRepository.findAll();

	    for (Student student : students) {
	        int totalMarks = student.getMathMarks() + student.getEnglishMarks() +
	                         student.getSocialMarks() + student.getScienceMarks();

	        if (student.getMathMarks() < 35 || student.getEnglishMarks() < 35 ||
	            student.getSocialMarks() < 35 || student.getScienceMarks() < 35)
	        {
	            student.setStatus("Fail");
	        } 
	        else 	
	        {
	            student.setStatus("Pass");
	        } 

	        student.setTotalMarks(totalMarks);
	    }

	    return ResponseEntity.ok(students);
	}	
}


