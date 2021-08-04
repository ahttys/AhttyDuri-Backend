package com.ahttys.server.domain.user;

import com.ahttys.server.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    public Optional<User> findById(Long id);
    public Optional<User> findByEmail(String email);
    public Optional<User> findByName(String name);
}
