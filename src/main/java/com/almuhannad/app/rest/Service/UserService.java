package com.almuhannad.app.rest.Service;

import com.almuhannad.app.rest.Dto.OrderRequest;
import com.almuhannad.app.rest.Dto.OrderResponse;
import com.almuhannad.app.rest.Entity.User;
import com.almuhannad.app.rest.Repository.UserRepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserService {

    @Autowired
    private UserRepo userRepo;
    //private User user;

    public List<User> getAllUsers(){
        return this.userRepo.findAll();
    }

    public String saveUser(User user){
        Optional<User> opt = Optional.of(user);
        if(opt.isPresent()){
            this.userRepo.save(user);
            return "Saved user data!";
        }else{
            return "Cannot save user data! ...";
        }
    }

    public void updateUser(long id,  User user) {
        User updatedUser = userRepo.findById(id).get(); //return the user with this id
        //update the following fields
        if (user.getName() != null) {
            updatedUser.setName(user.getName());
        }
        if (user.getEmail() != null) {
            updatedUser.setEmail(user.getEmail());
        }
        if (user.getOccupation() != null) {
            updatedUser.setOccupation(user.getOccupation());
        }
        if (user.getAge() != null) {
            updatedUser.setAge(user.getAge());
        }
        //save changes made
        userRepo.save(updatedUser);
    }

    public void deleteUser(long id){
        User deleteUser = userRepo.findById(id).get();
        userRepo.deleteById(deleteUser.getId());
    }


    //           JPQL Queries
    public List<OrderResponse> getJoinInformation(){
        return this.userRepo.getJoinInformation();
    }

    public List<User> getGmailAccounts(){
        return this.userRepo.getGmailAccounts();
    }




}
