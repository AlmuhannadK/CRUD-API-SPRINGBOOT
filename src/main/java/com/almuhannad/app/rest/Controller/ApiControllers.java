package com.almuhannad.app.rest.Controller;

import com.almuhannad.app.rest.Dto.OrderRequest;
import com.almuhannad.app.rest.Dto.OrderResponse;
import com.almuhannad.app.rest.Entity.Product;
import com.almuhannad.app.rest.Entity.User;
import com.almuhannad.app.rest.Service.ProductService;
import com.almuhannad.app.rest.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ApiControllers {

    @Autowired
    private UserService userService;
    @Autowired
    private ProductService productService;

/*
    @GetMapping(value = "/")
    public String getPage(){
        return "Welcome To The CRUD Demo!";
    }

 */

}
