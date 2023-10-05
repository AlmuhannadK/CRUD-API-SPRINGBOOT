package com.almuhannad.app.order.service.implementation;

import com.almuhannad.app.order.entity.Product;
import com.almuhannad.app.order.repository.ProductRepo;
import com.almuhannad.app.order.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImplementation implements ProductService {
    @Autowired
    private ProductRepo productRepo;

    @Override
    public Product addProduct(Product product){
//        Optional<Product> opt = Optional.of(product);
//        if(opt.isPresent()){
//            return this.productRepo.save(product);
//        }else{
//            return null;
//        }
        if(product != null){
            return this.productRepo.save(product);
        }else{
            return null;
        }
    }
    @Override
    public List<Product> getProduct(){
        return this.productRepo.findAll();
    }
    @Override
    public Optional<Product> getProductById(Integer productId){
        Optional<Product> opt = this.productRepo.findById(productId);
        if(opt.isPresent()){
            return opt;
        } else{
            return null;
        }
    }
    @Override
    public void deleteProduct(Integer productId){
        Optional<Product> product = this.productRepo.findById(productId);
        if(product.isPresent()){
            this.productRepo.deleteById(productId);
        }
    }

    @Override
    public List<Product> getProductsByProductNameContaining(String product){
        return this.productRepo.getProductsByProductNameContaining(product);
    }

}
