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
public class EventModel {
	@Id
	@GeneratedValue
	private int eventId;
	private String eventName;
	private String location;
	private String date;
	private String startTime;
	private String endTime;

}
