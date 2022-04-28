package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserService {
    List<User> users = new ArrayList<>();
    public List<User> getAllUser() {



        User us1 = new User(1, "Ashis", "Panasonic", "Manager");
        User us2 = new User(2, "Abhishek", "deloitee", "developer");
        User us3 = new User(3, "Amit", "oracle", "projectManager");
        User us4 = new User(4, "Ankit", "accenture", "senior developer");

        users.add(us1);
        users.add(us2);
        users.add(us3);
        users.add(us4);


        return users;
    }

    public void createUser(User user) {

        User ur = new User(user.id,user.getName(),user.getComapany(),user.getDesignation());
        users.add(ur);


    }

    public User getUser(int id){

        for(User ur :users){

            if(id == ur.getId()){
                return ur;
            }}


            return null;



}}




