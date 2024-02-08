package com.ashwin.ngobeta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



	
	@Repository
	public interface EventRepository extends JpaRepository<Event, Long> {
	
	

	public Event save(Event newEvent);

	public Event findById(int eventId);

	public void update(Event event);

	public void delete(int eventId) ;
}
