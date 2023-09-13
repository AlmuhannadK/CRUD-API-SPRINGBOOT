package com.almuhannad.app.rest.Repository;

import com.almuhannad.app.rest.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
