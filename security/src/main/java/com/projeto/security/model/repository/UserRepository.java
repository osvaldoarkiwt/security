package com.projeto.security.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.security.model.User;
import java.util.Optional;


public interface UserRepository extends JpaRepository<User,Long>{
    
    Optional<User> findByUserName(String userName);
}
