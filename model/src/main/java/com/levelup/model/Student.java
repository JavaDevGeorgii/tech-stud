package com.levelup.model;

import javax.persistence.*;


/**
 * Created by GEO on 26.02.15.
 */

@Entity
@Table(name = "STUDENT")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(nullable = false, name = "FIRSTNAME")
    private String firstName;

    @Column(nullable = false, name = "LASTNAME")
    private String lastName;

    @Column(nullable = false, name = "TEACHERS_ID")
    private long teachId;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "teacher")
    private Teacher teacher;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getTeachId() {
        return teachId;
    }

    public void setTeachId(long teachId) {
        this.teachId = teachId;
    }

}
