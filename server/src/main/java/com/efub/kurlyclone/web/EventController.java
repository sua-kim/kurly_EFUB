package com.efub.kurlyclone.web;

import com.efub.kurlyclone.domain.event.Event;
import com.efub.kurlyclone.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/event")
public class EventController {

    @Autowired
    EventService eventService;

    @GetMapping("")
    public List<Event> getEvent() {
        return eventService.getAllEvents();
    }

    @PostMapping("/create")
    public Event create(@RequestBody Event event) {
        return eventService.registerEvent(event);
    }

}
