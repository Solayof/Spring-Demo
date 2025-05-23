package com.example.demo.repository;

import com.example.demo.constant.ERole;
import com.example.demo.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
    Optional<RoleEntity> findByName(ERole name);
}