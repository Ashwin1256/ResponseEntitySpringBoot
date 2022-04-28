package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController

public class UserController {
    @Autowired
    UserService us;
    @GetMapping("/allUser")
    public ResponseEntity<List<User>> getAllUsers(){

        List<User> user = us.getAllUser();

        return new ResponseEntity<>( user, HttpStatus.OK);


    }

        @PostMapping("/user")
    public ResponseEntity<Object> getUser(@Valid @RequestBody User user) {

        us.createUser(user);

           URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{/id}").buildAndExpand(user.getId()).toUri();

        return  ResponseEntity.created(location).build();
    }


    @PostMapping("/userid/{id}")
    public User  getuserid(@PathVariable("id") int id){

        User user = us.getUser(id);

        if(user== null){
            throw new UserNotFoundException("id is not found " +id);
        }

            else
            	
                return user;

    }


}
