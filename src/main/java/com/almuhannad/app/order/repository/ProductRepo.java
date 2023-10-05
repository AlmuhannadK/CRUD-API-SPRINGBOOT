package com.almuhannad.app.order.repository;

import com.almuhannad.app.order.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Integer> {

    //          Derived Query

    List<Product> getProductsByProductNameContaining(String product);
}
