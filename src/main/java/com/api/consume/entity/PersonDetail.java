package com.api.consume.entity;

import javax.persistence.*;

@Entity
public class PersonDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int personDetailId;
    private String address;
    private int zipCode;
    private double income;

    @OneToOne(mappedBy = "personDetail")
    @JoinColumn(name = "person_id")
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }


    public int getPersonDetailId() {
        return personDetailId;
    }

    public void setPersonDetailId(int personDetailId) {
        this.personDetailId = personDetailId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }


}
