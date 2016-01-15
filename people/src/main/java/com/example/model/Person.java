package com.example.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class Person {
    @NotBlank
    private String givenNames;
    @NotBlank
    private String surname;
    @NotNull
    private LocalDate dateOfBirth;
    @NotBlank
    private String membership;
    private boolean active;

    public Person() {}

    public Person(String givenNames, String surname, LocalDate dateOfBirth, String membership) {
        this.givenNames = givenNames;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.membership = membership;
    }

    public String getGivenNames() {
        return givenNames;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getMembership() {
        return membership;
    }

    public boolean isActive() {
        return active;
    }

    public void setGivenNames(String givenNames) {
        this.givenNames = givenNames;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
