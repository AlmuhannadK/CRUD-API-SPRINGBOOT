package com.almuhannad.app.order.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long productId;
    @Column
    private String productName;
    @Column
    private Integer quantity;
    @Column
    private Integer price;
}
