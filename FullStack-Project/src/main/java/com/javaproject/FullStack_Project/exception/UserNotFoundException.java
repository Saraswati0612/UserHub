package com.javaproject.FullStack_Project.exception;

import com.javaproject.FullStack_Project.model.User;
import org.springframework.web.bind.annotation.PathVariable;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(Long id){
       super("Could not found the user with id "+id);
 }
}
