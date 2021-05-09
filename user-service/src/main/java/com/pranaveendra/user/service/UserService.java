package com.pranaveendra.user.service;

import com.pranaveendra.user.entity.User;
import com.pranaveendra.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User findUserByUserId(Long userId) {
        return userRepository.findUserById(userId);
    }
}
