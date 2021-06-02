package com.efub.kurlyclone.domain.event;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table (name = "event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="event_id")
    private Long id;

    @Column(name="event_name")
    private String name;

    @Column(name="event_descript")
    private String descript;

    public Event(Long Id, String name, String descript) {
        this.descript = descript;
        this.name = name;
    }



}
