package com.lwl.elasticsearchdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lwl.elasticsearchdemo.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, String> {

}
