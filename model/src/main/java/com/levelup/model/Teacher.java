package com.levelup.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by GEO on 26.02.15.
 */

@Entity
@Table(name = "TEACHER")
public class Teacher {

    private Long id;
    private String firstName;
    private String lastName;


    //private List <Student> students;

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

    /**@OneToMany(fetch = FetchType.EAGER)
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    */


}

