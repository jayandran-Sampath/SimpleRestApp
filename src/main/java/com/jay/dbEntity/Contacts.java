package com.jay.dbEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contacts {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String emailID;

    protected Contacts() {}

    public Contacts(String firstName, String lastName,String emailID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailID = emailID;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s' , emailId='%s']",
                id, firstName, lastName,emailID);
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailID(){
        return emailID;
    }
}
