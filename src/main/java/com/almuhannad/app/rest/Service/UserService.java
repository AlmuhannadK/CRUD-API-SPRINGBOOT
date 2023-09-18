package com.almuhannad.app.rest.Service;

import com.almuhannad.app.rest.Dto.OrderResponse;
import com.almuhannad.app.rest.Entity.User;
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
