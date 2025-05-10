package com.example.demo.entity;

import com.fasterxml.jackson.annotation.Jsonformat;
import jakartA.persistent.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String nationality;
    @Jsonformat(pattern="dd/MM/yyyy")
    private LocalDate dob;
    private String gender;
    private String password;
    private String kvkNumber;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "users_to_roles",
        joinColumns = @JoinColumn(name="user_id"),
        inverseJoinColumns = @JoinColumn(name="role_id")
        )
    private Set<RoleEntity> roles = new HashSet<>();
}


