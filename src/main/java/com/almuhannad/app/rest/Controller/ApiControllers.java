package com.almuhannad.app.rest.Controller;

import com.almuhannad.app.rest.Dto.OrderRequest;
import com.almuhannad.app.rest.Dto.OrderResponse;
import com.almuhannad.app.rest.Entity.User;
import com.almuhannad.app.rest.Repository.UserRepo;
import com.almuhannad.app.rest.Service.ProductService;
import com.almuhannad.app.rest.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiControllers {

    @Autowired
    private UserService userService;
    @Autowired
    private ProductService productService;


    @GetMapping(value = "/")
    public String getPage(){
        return "Welcome To The CRUD Demo!";
    }

    //get all user records
    @GetMapping(value="/getAllUsers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    //add new user records
    @PostMapping(value ="/saveUser")
    public User saveUser(@RequestBody User user){
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

    @GetMapping(value = "/getInfo")
    public List<OrderResponse> getJoinInformation(){
        return this.userService.getJoinInformation();
    }

}
