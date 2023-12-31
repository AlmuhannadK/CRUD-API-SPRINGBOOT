package com.almuhannad.app.order.controller;

import com.almuhannad.app.order.dto.OrderRequest;
import com.almuhannad.app.order.dto.OrderResponse;
import com.almuhannad.app.order.entity.User;
import com.almuhannad.app.order.service.UserService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserService userService;


    //get all user records
    @GetMapping(value="/getAllUsers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    //add new user records
    @PostMapping(value ="/saveUser")
    public User saveUser(@NonNull @RequestBody User user){
        this.userService.saveUser(user);
        return user;
    }

    //update user records
    @PutMapping(value = "/updateUser/{id}")
    public String updateUser(@PathVariable long id, @RequestBody User user){
        this.userService.updateUser(id, user);
        return "User data updated!";
    }

    //delete user records
    @DeleteMapping(value = "/deleteUser/{id}")
    public String deleteUser(@PathVariable long id){
        this.userService.deleteUser(id);
        return "Deleted User With The ID --> " + id;
    }

    @PostMapping(value = "/placeOrder")
    public String placeOrder(@RequestBody OrderRequest request){
        return this.userService.saveUser(request.getUser());
    }

    //          JPQL APIs
    @GetMapping(value = "/getInfo")
    public List<OrderResponse> getJoinInformation(){
        return this.userService.getJoinInformation();
    }

    @GetMapping(value = "/get-gmail-accounts")
    public List<User> getGmailAccounts(){
        return this.userService.getGmailAccounts();
    }


    @PutMapping(value = "/reset-email")
    public void resetEmailJPQL(@RequestBody User user){
       this.userService.resetEmailJPQL(user.getEmail(), user.getId());
    }

    //Derived Queries
    @GetMapping(value = "/name-starting-with")
    public List<User> getAllByNameStartingWith(@RequestParam String name){
        return this.userService.getAllByNameStartingWith(name);
    }

}
