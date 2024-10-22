package com.UserRegisteration.Login.repo;

import com.UserRegisteration.Login.Modell.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Userepo extends JpaRepository<User,Integer> {
}