package com.UserRegisteration.Login.Service;
import com.UserRegisteration.Login.repo.Userepo;
import com.UserRegisteration.Login.Modell.User;
import com.UserRegisteration.Login.repo.Userepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private Userepo userepo;

    public User registerUser(User user) {
        return userepo.save(user);
    }

    public List<User> getAllUsers() {
        return userepo.findAll();
    }
}
