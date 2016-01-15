package com.example.services;

import com.example.model.Person;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PeopleRepository {
    private ArrayList<Person> people = new ArrayList<>(Arrays.asList(
            new Person("Mateusz", "Fedoryszak", LocalDate.of(1988,4,16), "member"),
            new Person("Marta", "Fedoryszak", LocalDate.of(1989,10,1), "member")));

    public List<Person> getAll() {
        return people;
    }

    public void add(Person p) {
        people.add(p);
    }

    public void activate(int i) {
        people.get(i).setActive(true);
    }
}
