package com.user.user_service.service;

import java.util.List;

import com.user.user_service.entity.User;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{


    List<User> list= List.of(

    new User(130L, "Pradyumna", "9842675501"),
    new User(131L, "Pragya", "9803620311"),
    new User(132L, "Satyendra", "984276897")

    );

    @Override
    public User getUser(Long userId) {
      
      
        return list.stream().filter(user->user.getUserId().equals(userId)).findAny().orElse(null);
    }

}

