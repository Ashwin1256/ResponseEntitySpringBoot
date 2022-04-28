package com.example.demo;

import javax.validation.constraints.Size;

public class User {

    int id;
    @Size(min =2, message = "name should have 2 characters")
    String Name;
    String Comapany;
    String Designation;

    public User(int id, String name, String comapany, String designation) {
        this.id = id;
        Name = name;
        Comapany = comapany;
        Designation = designation;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getComapany() {
        return Comapany;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setComapany(String comapany) {
        Comapany = comapany;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }


}
