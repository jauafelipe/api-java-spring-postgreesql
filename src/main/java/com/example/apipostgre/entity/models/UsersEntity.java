package com.example.apipostgre.entity.models;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter
@Setter
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "users")
public class UsersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserId")
    private int user_id;
    @Column(name = "Name", length = 50,nullable = false)
    private String name;
    @Column(name = "Surname",length = 50 ,nullable = false)
    private String surname;
    @Column(name = "Email", length = 60, nullable = false)
    private String email;
    @Column(name = "Password", length = 60, nullable = false)
    private String password;
    @Column(name = "Created_at")
    @CreatedDate
    private LocalDateTime created_at;
    @Column(name = "Updated_at")
    @LastModifiedDate
    private LocalDateTime updated_at;
}
