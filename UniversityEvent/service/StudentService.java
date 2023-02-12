package com.universityeventmanagement.UniversityEvent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.universityeventmanagement.UniversityEvent.model.StudentModel;
import com.universityeventmanagement.UniversityEvent.repository.IStudentRepository;

@Service
public class StudentService {
	@Autowired
	private IStudentRepository studentRepo;
	
	//create student
	public StudentModel createStudent(StudentModel student) {
		return studentRepo.save(student);
	}
	
	//get student by id
	public StudentModel getStudentById(int id) {
		return studentRepo.findById(id).get();
	}
	
	//get all student
	public List<StudentModel> getAllStudent(){
		return studentRepo.findAll();
	}
	
	//update
	public void updateStudent(int id,StudentModel newStudent) {
        //step 1: find todo to be update
        //Step 2: update todo

		StudentModel students=studentRepo.findById(id).get();
		students.setStudentId(newStudent.getStudentId());
		students.setFirstName(newStudent.getFirstName());
		students.setLastName(newStudent.getLastName());
		students.setAge(newStudent.getAge());
		students.setDept(newStudent.getDept());
		
		studentRepo.save(students);
    }
	
	//delete
	public void deleteStudent(int id) {
		studentRepo.deleteById(id);
	}

}
