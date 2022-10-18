package com.api.consume.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eventId;
    private String eventName;

    @ManyToMany
    @JoinTable(name = "join_event_delegate", joinColumns = {@JoinColumn(name = "eventId")},inverseJoinColumns = {
            @JoinColumn(name = "delegateId")
    })
    private List<Delegate> delegate;

    public List<Delegate> getDelegate() {
        return delegate;
    }

    public void setDelegate(List<Delegate> delegate) {
        this.delegate = delegate;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
}