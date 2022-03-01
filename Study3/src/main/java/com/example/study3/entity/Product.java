package com.example.study3.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "COMMENT")
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(generator = "Product")
    @SequenceGenerator(name = "Product" , sequenceName = "PRODUCT_ID_SEQ")
    private Long id;

    @Column(name = "NAME", length = 100, nullable = false)
    private String name;

}
