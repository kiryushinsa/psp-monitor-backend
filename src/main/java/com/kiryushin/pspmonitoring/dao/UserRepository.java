package com.kiryushin.pspmonitoring.dao;


import com.kiryushin.pspmonitoring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String name);

}
