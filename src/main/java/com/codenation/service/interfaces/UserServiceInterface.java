package com.codenation.service.interfaces;


import com.codenation.entity.User;

import java.util.Optional;

public interface UserServiceInterface {

    Optional<User> findById(Long userId);

    Optional<User> findByEmail(String email);

}
