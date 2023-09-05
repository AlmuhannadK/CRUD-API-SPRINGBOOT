package com.almuhannad.app.rest.Repo;

import com.almuhannad.app.rest.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
