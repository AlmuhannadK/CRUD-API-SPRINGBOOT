package com.almuhannad.app.rest.Repository;

import com.almuhannad.app.rest.Dto.OrderResponse;
import com.almuhannad.app.rest.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserRepo extends JpaRepository<User, Long> {

    //          JPQL
    @Query(value = "SELECT new com.almuhannad.app.rest.Dto.OrderResponse(u.name , p.productName) FROM User u JOIN u.products p") //
    List<OrderResponse> getJoinInformation();


    @Query(value = "SELECT u FROM User u WHERE u.email LIKE '%@gmail.com' ")
    List<User> getGmailAccounts();

    @Transactional
    @Modifying // for DML operations
    @Query(value = "UPDATE User u SET u.email = :email WHERE u.id =:id")
    void resetEmailJPQL(String email, long id);

    //          DERIVED QUERIES
    List<User> getAllByNameStartingWith(String name);

}


