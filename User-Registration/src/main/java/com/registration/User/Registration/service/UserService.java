package com.registration.User.Registration.service;

import com.registration.User.Registration.model.User;
import com.registration.User.Registration.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userrepository;

    public UserService(UserRepository userRepository) {
        this.userrepository = userrepository;
    }


    public User saveuser(User user){
        return UserRepository.save(user);
    }

}
