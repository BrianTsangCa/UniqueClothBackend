package com.example.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
