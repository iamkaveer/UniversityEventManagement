package com.universityeventmanagement.UniversityEvent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.universityeventmanagement.UniversityEvent.model.StudentModel;

public interface IStudentRepository extends JpaRepository<StudentModel, Integer> {

}
