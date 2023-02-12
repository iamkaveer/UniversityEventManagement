package com.universityeventmanagement.UniversityEvent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.universityeventmanagement.UniversityEvent.model.StudentModel;
import com.universityeventmanagement.UniversityEvent.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	//add student
	@PostMapping("/add-student")
	public StudentModel addStudent(@RequestBody StudentModel student) {
		return studentService.createStudent(student);
	}
	
	//find student by id
	@GetMapping("/find-by-id/{id}")
	public StudentModel findStudentbyId(@PathVariable int id) {
		return studentService.getStudentById(id);
	}
	
	//find all
	@GetMapping("/find-all")
	public List<StudentModel> getAllStudents(){
		return studentService.getAllStudent();
	}
	
	//update 
	@PutMapping("update-student/id/{id}")
    public void updateStudent(@PathVariable int id,@RequestBody StudentModel newStudent) {
		studentService.updateStudent(id,newStudent);
    }
	
	//delete
	@DeleteMapping("delete-student/id/{id}")
    public void deleteStudent(@PathVariable int id) {
		studentService.deleteStudent(id);
    }
	

}
