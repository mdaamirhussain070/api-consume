package com.api.consume.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Delegate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int delegateId;
    private String delegateName;

    @ManyToMany
    @JoinTable(name = "join_event_delegate" , joinColumns = {
            @JoinColumn(name = "delegateId")
    }, inverseJoinColumns = {
            @JoinColumn(name = "eventId")
    })
    private List<Event> event;



    public int getDelegateId() {
        return delegateId;
    }

    public void setDelegateId(int delegateId) {
        this.delegateId = delegateId;
    }

    public String getDelegateName() {
        return delegateName;
    }

    public void setDelegateName(String delegateName) {
        this.delegateName = delegateName;
    }
}
