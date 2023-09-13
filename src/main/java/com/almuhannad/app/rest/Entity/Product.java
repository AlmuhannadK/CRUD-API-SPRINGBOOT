package com.almuhannad.app.rest.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Product {
    @Id
    private Integer productId;
    private String productName;
    private Integer quantity;
    private Integer price;
}
