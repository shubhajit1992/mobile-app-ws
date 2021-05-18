package com.shubhajit.mobileappws.io.repository;

import com.shubhajit.mobileappws.io.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByEmail(String email);

    UserEntity findByUserId(String userId);

    Optional<UserEntity> findByEmailVerificationToken(String token);
}
