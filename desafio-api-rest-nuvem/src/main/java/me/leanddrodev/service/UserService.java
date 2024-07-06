package me.leanddrodev.service;

import me.leanddrodev.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
