package com.almuhannad.app.rest.Controller;

import com.almuhannad.app.rest.Models.User;
import com.almuhannad.app.rest.Repo.UserRepo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiControllers {

    @Autowired
    private UserRepo userRepo;


    @GetMapping(value = "/")
    public String getPage(){
        return "Welcome To The CRUD Demo!";
    }

    //get all user records
    @GetMapping(value="/users")
    public List<User> getUsers(){
        return userRepo.findAll();
    }

    //add new user records
    @PostMapping(value ="/save")
    public String saveUser(@RequestBody @Valid User user){
        userRepo.save(user);
        return "New User Saved! ...";
    }

    //update user records
    @PutMapping(value = "/update/{id}")
    public String updateUser(@PathVariable long id, @RequestBody @Valid User user){
        User updatedUser = userRepo.findById(id).get(); //return the user with this id
        //update the following fields
        updatedUser.setFirstName(user.getFirstName());
        updatedUser.setLastName(user.getLastName());
        updatedUser.setOccupation(user.getOccupation());
        updatedUser.setAge(user.getAge());
        //save changes made
        userRepo.save(updatedUser);
        return "User Updated! ...";
    }

    //delete user records
    @DeleteMapping(value = "/delete/{id}")
    public String deleteUser(@PathVariable long id){

        User deleteUser = userRepo.findById(id).get();
        userRepo.delete(deleteUser);

        return "Deleted User With The ID --> " + id;

    }

}
