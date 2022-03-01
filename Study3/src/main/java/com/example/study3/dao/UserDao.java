package com.example.study3.dao;

import com.example.study3.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User,Long> {
    User findById(long id);
    User findByName(String name);

}

