package com.almuhannad.app.rest.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class User {
    //primary key in db (unique for each user)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //each will be a column in the mysql database
    @Column
    @NotNull
    private String firstName;
    @Column
    @NotNull
    private String lastName;
    @Column
    private int age;
    @Column
    @NotNull
    private String occupation;

    //Getters & Setters for fields
    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
