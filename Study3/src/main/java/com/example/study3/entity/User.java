package com.example.study3.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "USER")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(generator = "User")
    @SequenceGenerator(name = "User" , sequenceName = "USER_ID_SEQ")
    private Long id;

    @Column(name = "NAME", length = 100, nullable = false)
    private String name;

    @Column(name = "MAİL", length = 100, nullable = false)
    private String mail;

    @Column(name = "PHONE", length = 11, nullable = false)
    private Long phone;

    @Enumerated(EnumType.STRING)
    @Column(name = "USER_TYPE", length = 30)
    private UserType userType;



}
