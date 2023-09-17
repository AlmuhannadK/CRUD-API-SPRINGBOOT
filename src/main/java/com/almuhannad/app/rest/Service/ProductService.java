package com.almuhannad.app.rest.Service;


import com.almuhannad.app.rest.Entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductService {

    public Product addProduct(Product product);

    public List<Product> getProduct();

    public Optional<Product> getProductById(Integer productId);

    public void deleteProduct(Integer productId);
}
