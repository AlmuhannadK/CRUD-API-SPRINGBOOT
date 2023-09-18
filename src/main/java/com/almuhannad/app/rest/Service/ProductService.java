package com.almuhannad.app.rest.Service;


import com.almuhannad.app.rest.Entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductService {

    Product addProduct(Product product);

    List<Product> getProduct();

    Optional<Product> getProductById(Integer productId);

    void deleteProduct(Integer productId);

    List<Product> getProductsByProductNameContaining(String product);
}
