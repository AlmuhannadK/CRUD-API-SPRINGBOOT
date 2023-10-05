package com.almuhannad.app.order.service;

import com.almuhannad.app.order.dto.OrderResponse;
import com.almuhannad.app.order.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<User> getAllUsers();

    String saveUser(User user);

    void updateUser(long id,  User user);

    void deleteUser(long id);

    List<OrderResponse> getJoinInformation();

    List<User> getGmailAccounts();

    void resetEmailJPQL(String email, long id);

    List<User> getAllByNameStartingWith(String name);
}
