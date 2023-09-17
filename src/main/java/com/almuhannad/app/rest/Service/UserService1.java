package com.almuhannad.app.rest.Service;

import com.almuhannad.app.rest.Dto.OrderResponse;
import com.almuhannad.app.rest.Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService1 {

    public List<User> getAllUsers();

    public String saveUser(User user);

    public void updateUser(long id,  User user);

    public void deleteUser(long id);

    public List<OrderResponse> getJoinInformation();

    public List<User> getGmailAccounts();

    public void resetEmailJPQL(String email, long id);
}
