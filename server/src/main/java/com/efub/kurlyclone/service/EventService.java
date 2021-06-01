package com.efub.kurlyclone.service;

import com.efub.kurlyclone.domain.event.Event;
import com.efub.kurlyclone.domain.event.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    EventRepository eventRepository;

    public Event registerEvent(Event event) {
        Event newEvent = eventRepository.save(event);
        return newEvent;
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

}
