package com.example.git_pratice.repository;

import com.example.git_pratice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
