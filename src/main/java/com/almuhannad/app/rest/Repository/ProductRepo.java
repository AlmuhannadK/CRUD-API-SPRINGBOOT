package com.almuhannad.app.rest.Repository;

import com.almuhannad.app.rest.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Integer> {

    //          Derived Query

    List<Product> getProductsByProductNameContaining(String product);
}
