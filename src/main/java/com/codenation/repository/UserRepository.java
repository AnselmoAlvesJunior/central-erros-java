package com.codenation.repository;

import com.codenation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public Optional<User> findById(Long userId);

    public Optional<User> findByEmail(String email);

}
