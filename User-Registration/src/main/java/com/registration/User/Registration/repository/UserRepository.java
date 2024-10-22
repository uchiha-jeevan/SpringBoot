package com.registration.User.Registration.repository;

import com.registration.User.Registration.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
