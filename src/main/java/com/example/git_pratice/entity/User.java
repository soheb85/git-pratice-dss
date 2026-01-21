package com.example.git_pratice.entity;

import com.example.git_pratice.enums.UserRole;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "tbl_user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    private Long id;

    private String fullName;

    private String email;

    private String rawPassword;

    private UserRole role;
}
