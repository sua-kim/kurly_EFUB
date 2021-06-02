package com.efub.kurlyclone.web;

import com.efub.kurlyclone.domain.event.Event;
import com.efub.kurlyclone.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/event")
public class EventController {

    @Autowired
    EventService eventService;

    @GetMapping("")
    public List<Event> getEvents() {
        return eventService.getAllEvents();
    }

    @GetMapping("/{id}")
    public Optional<Event> getEventById(@PathVariable Long id) {
        return eventService.getEventById(id);
    }

    @PostMapping("/create")
    public Event create(@RequestBody Map<String, String> list) {
        String name = list.get("event_name");
        String descript = list.get("event_descript");
        Event newEvent = Event.builder().name(name).descript(descript).build();

        return eventService.registerEvent(newEvent);
    }

    @PutMapping("/update/{id}")
    public Optional<Event> updateEventById(@PathVariable Long id, @RequestBody Map<String, String> list) {

        return eventService.updateEventById(id, list);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEventById(@PathVariable Long id) {
        return eventService.deleteEventById(id);
    }

}
