package com.ashwin.ngobeta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventController implements EventService {
 private EventRepository eventRepository;

 public EventController(EventRepository eventRepository) {
     this.eventRepository = eventRepository;
 }

 public Event createEvent(String username, String email, String password) {
     Event newEvent = new Event();
     return eventRepository.save(newEvent);
 }

 public Event getEventById(int eventId) {
     return eventRepository.findById(eventId);
 }

 public void updateEvent(Event event) {
     eventRepository.update(event);
 }

 public void deleteEvent(int eventId) {
     eventRepository.delete(eventId);
 }
}
