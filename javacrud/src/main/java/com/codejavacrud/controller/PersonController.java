package com.codejavacrud.controller;

import java.util.ArrayList;
import java.util.List;

import com.codejavacrud.model.Person;

public class PersonController {
    private List<Person> people = new ArrayList<>();

    public void createPerson(int id, String name, String email) {
        Person person = new Person(id, name, email);
        people.add(person);

    }

    public List<Person> ListPeople() {
        return people;
    }

    public boolean updatePerson(int id, String name, String email) {
        for (Person p : people) {
            if (p.getId() == id) {
                p.setName(name);
                p.setEmail(email);
                return true;
            }
        }
        return false;

    }

    public boolean deletePerson(int id) {
        return people.removeIf(person -> person.getId() == id);
    }

}
