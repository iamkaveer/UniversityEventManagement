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

import com.universityeventmanagement.UniversityEvent.model.EventModel;
import com.universityeventmanagement.UniversityEvent.service.EventService;

@RestController
public class EventController {
	@Autowired
	private EventService eventService;
	
	@PostMapping("/add-event")
	public EventModel addEvent(@RequestBody EventModel event) {
		return eventService.createEvent(event);
	}
	
	@GetMapping("/find-all-event")
	public List<EventModel> getAllEvents(){
		return eventService.getAllEvent();
	}
	
	
	@PutMapping("update-event/id/{id}")
    public void updateEvent(@PathVariable int id,@RequestBody EventModel newEvent) {
		eventService.updateEvent(id,newEvent);
    }
	
	@DeleteMapping("delete-event/id/{id}")
    public void deleteStudent(@PathVariable int id) {
		eventService.deleteEvent(id);
    }

}
