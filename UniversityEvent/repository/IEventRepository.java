package com.universityeventmanagement.UniversityEvent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.universityeventmanagement.UniversityEvent.model.EventModel;

public interface IEventRepository extends JpaRepository<EventModel, Integer>{

}
