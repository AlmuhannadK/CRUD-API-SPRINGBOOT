package com.almuhannad.app.rest.Controller;

import com.almuhannad.app.rest.Entity.Product;
import com.almuhannad.app.rest.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    // get all products
    @GetMapping(value = "/get-product")
    public List<Product> getProduct(){
        return this.productService.getProduct();
    }

    //add products
    @PostMapping(value = "/admin/add-product")
    public Product addProduct(@RequestBody Product product){
        return this.productService.addProduct(product);
    }

    //delete product by id
    @DeleteMapping(value = "/admin/delete-product/{productId}")
    public String deleteProduct(@PathVariable Integer productId){
        Optional<Product> opt = this.productService.getProductById(productId);
        if(opt.isPresent()){
            this.productService.deleteProduct(productId);
            return "User data deleted!";
        } else{
            return "No data found for this id";
        }
    }
}
