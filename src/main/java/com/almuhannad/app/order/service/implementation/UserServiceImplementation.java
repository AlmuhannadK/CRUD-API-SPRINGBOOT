package com.almuhannad.app.order.service.implementation;

import com.almuhannad.app.order.dto.OrderResponse;
import com.almuhannad.app.order.entity.User;
import com.almuhannad.app.order.repository.UserRepo;
import com.almuhannad.app.order.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    private UserRepo userRepo;

    //private User user;
    @Override
    public List<User> getAllUsers(){
        return this.userRepo.findAll();
    }

    @Override
    public String saveUser(User user){
        Optional<User> opt = Optional.of(user);
        if(opt.isPresent()){
            this.userRepo.save(user);
            return "Saved user data!";
        }else{
            return "Cannot save user data! ...";
        }
    }

    @Override
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

    @Override
    public void deleteUser(long id){
        User deleteUser = userRepo.findById(id).get();
        userRepo.deleteById(deleteUser.getId());
    }

    //           JPQL Queries
    @Override
    public List<OrderResponse> getJoinInformation(){
        return this.userRepo.getJoinInformation();
    }

    @Override
    public List<User> getGmailAccounts(){
        return this.userRepo.getGmailAccounts();
    }

    @Override
    public void resetEmailJPQL(String email, long id){
        Optional<User> opt = this.userRepo.findById(id);
        if(opt.isPresent() && !(opt.get().getEmail().isEmpty()) ){
            this.userRepo.resetEmailJPQL(email, id);
        }else{
            if(opt.isPresent() && (opt.get().getEmail().isEmpty())){
                System.out.println("CONTACT ADMIN TO ADD EMAIL ADDRESS");
            }
        }
    }

    // Derived Queries
    @Override
    public List<User> getAllByNameStartingWith(String name){
        return this.userRepo.getAllByNameStartingWith(name);
    }
}
