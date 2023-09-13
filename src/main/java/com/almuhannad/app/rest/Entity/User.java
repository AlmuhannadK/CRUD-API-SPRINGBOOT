package com.almuhannad.app.rest.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class User {
    //primary key in db (unique for each user)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //each will be a column in the mysql database
    @Column
    @NotNull
    private String name;

    @Column
    @Email
    @NotNull
    private String email;

    @Column
    @NotNull
    private Integer age;

    @Column
    @NotNull
    private String occupation;

    @OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "up_fk", referencedColumnName = "id")
    private List<Product> products;


}
