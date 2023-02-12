package com.universityeventmanagement.UniversityEvent.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class StudentModel {
	@Id
	@GeneratedValue
	private int studentId;
	private String firstName;
	private String lastName;
	private int age;
	private String dept;

}
