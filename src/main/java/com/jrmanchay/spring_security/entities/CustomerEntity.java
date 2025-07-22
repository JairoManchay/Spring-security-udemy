package com.jrmanchay.spring_security.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "customers")
@Data
public class CustomerEntity implements Serializable {

    @Id
    private Long id;

    private String email;
    @Column(name = "pwd")
    private String password;
    @Column(name = "rol")
    private String role;
}
