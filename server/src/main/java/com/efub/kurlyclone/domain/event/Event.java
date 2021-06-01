package com.efub.kurlyclone.domain.event;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "event")
@Data
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="event_id")
    private Long id;

    @Column(name="event_name")
    private String name;

    @Column(name="event_descript")
    private String descript;



}
