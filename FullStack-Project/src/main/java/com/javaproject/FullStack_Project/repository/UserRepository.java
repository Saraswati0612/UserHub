package com.javaproject.FullStack_Project.repository;


import com.javaproject.FullStack_Project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
