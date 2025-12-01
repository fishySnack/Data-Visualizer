package com.visualizer.data.Entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import lombok.Data;

@Data
@Entity
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID data_id;
    
    @Email
    private String email;
    private String password;
}
