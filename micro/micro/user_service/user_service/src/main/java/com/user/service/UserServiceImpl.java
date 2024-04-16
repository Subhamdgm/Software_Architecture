package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;
import java.util.List;

import java.awt.*;

@Service
public class UserServiceImpl implements UserService {

    //fake user list

    List<User> list=List.of(
            new User(1311L,"Shivang","7058360560"),
            new User(1312L,"Shubham","7058360562"),
            new User(1313L,"Amit","7058360564")
    );
    @Override
    public User getUser(Long id) {
        return list.stream().filter(user-> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
