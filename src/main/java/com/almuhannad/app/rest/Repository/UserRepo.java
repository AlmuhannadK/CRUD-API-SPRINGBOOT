package com.almuhannad.app.rest.Repository;

import com.almuhannad.app.rest.Dto.OrderResponse;
import com.almuhannad.app.rest.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepo extends JpaRepository<User, Long> {

    @Query(value = "SELECT new com.almuhannad.app.rest.Dto.OrderResponse(u.name , p.productName) FROM User u JOIN u.products p") //map to class for return
    List<OrderResponse> getJoinInformation();
}

