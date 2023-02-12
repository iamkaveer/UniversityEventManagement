package com.universityeventmanagement.UniversityEvent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.universityeventmanagement.UniversityEvent.model.EventModel;
import com.universityeventmanagement.UniversityEvent.repository.IEventRepository;

@Service
public class EventService {
	@Autowired
	private IEventRepository eventRepo;
	
	//add event
	public EventModel createEvent(EventModel event) {
		return eventRepo.save(event);
	}
	
	//get all event
	public List<EventModel> getAllEvent(){
		return eventRepo.findAll();
	}
	
	//update
	public void updateEvent(int id,EventModel newEvent) {
		EventModel events=eventRepo.findById(id).get();
		events.setEventId(newEvent.getEventId());
		events.setDate(newEvent.getDate());
		events.setStartTime(newEvent.getStartTime());
		events.setEndTime(newEvent.getEndTime());
		events.setEventName(newEvent.getEventName());
		events.setLocation(newEvent.getLocation());
		
		eventRepo.save(events);
    }
	//delete
	public void deleteEvent(int id) {
		eventRepo.deleteById(id);
	}
	
	
}
