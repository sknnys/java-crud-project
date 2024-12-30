package com.codejavacrud.model;

public class Person {
    private int id;
    private String name;
    private String email;

    public Person(int id, String name, String email) {
        this.setId(id);
        this.setName(name);
        this.setEmail(email);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\nPerson [id=" + id + ", name=" + name + ", email=" + email + "]";
    }

}