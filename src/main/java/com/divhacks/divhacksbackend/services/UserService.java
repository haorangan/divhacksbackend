package com.divhacks.divhacksbackend.services;
/*
import com.divhacks.divhacksbackend.models.User;
import com.divhacks.divhacksbackend.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public User register(User user) {
        if(userRepo.findByUsername(user.getUsername()) != null) {
            return null;
        }
        else {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
        }
        return userRepo.save(user);
    }

    public User findByUsername(String username) {
        return userRepo.findByUsername(username);
    }
    public User login(String username, String password) {
        User user = userRepo.findByUsername(username);
        if(passwordEncoder.matches(password, user.getPassword())) {
            return user;
        }
        return null;
    }


}

 */