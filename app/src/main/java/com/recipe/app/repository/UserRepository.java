package com.recipe.app.repository;

import com.recipe.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    // Найти пользователя по email
    Optional<User> findByEmail(String email);

    // Проверить, существует ли пользователь с таким email
    boolean existsByEmail(String email);

    // Найти пользователя по username
    Optional<User> findByUsername(String username);
}