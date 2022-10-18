package com.api.consume.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class College {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int collegeId;

    @OneToMany(targetEntity = Student.class,mappedBy = "college" ,cascade = CascadeType.ALL,fetch =FetchType.LAZY)
    private List<Student> students;
    private String collegeName;


    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
}
