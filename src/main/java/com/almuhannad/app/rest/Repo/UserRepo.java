package com.almuhannad.app.rest.Repo;

import com.almuhannad.app.rest.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
//this interface will allow us to connect to db and use its methods like findById(), etc...