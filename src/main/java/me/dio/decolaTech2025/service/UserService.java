package me.dio.decolaTech2025.service;

import me.dio.decolaTech2025.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
