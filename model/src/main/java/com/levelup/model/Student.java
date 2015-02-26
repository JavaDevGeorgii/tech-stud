package com.levelup.model;

import javax.persistence.*;


/**
 * Created by GEO on 26.02.15.
 */

@Entity
@Table(name = "STUDENT")
public class Student {

    private Long id;
    private String firstName;
    private String lastName;
    private long teachId;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(nullable = false)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(nullable = false)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(nullable = false)
    public long getTeachId() {
        return teachId;
    }

    public void setTeachId(long teachId) {
        this.teachId = teachId;
    }


}
