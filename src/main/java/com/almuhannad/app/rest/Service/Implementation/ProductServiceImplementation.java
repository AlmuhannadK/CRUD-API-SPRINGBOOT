package com.almuhannad.app.rest.Service.Implementation;

import com.almuhannad.app.rest.Entity.Product;
import com.almuhannad.app.rest.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImplementation {

    @Autowired
    private ProductRepo productRepo;


    public Product addProduct(Product product){
        if(product != null){
            return this.productRepo.save(product);
        }else{
            return null;
        }
    }
    public List<Product> getProduct(){
        return this.productRepo.findAll();
    }
    public Optional<Product> getProductById(Integer productId){
        Optional<Product> opt = this.productRepo.findById(productId);
        if(opt.isPresent()){
            return opt;
        } else{
            return null;
        }
    }
    public void deleteProduct(Integer productId){
        Optional<Product> product = this.productRepo.findById(productId);
        if(product.isPresent()){
            this.productRepo.deleteById(productId);
        }
    }
}
