package com.example.study3.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Table(name = "COMMENT")
@Getter
@Setter
public class Comment {
    @Id
    @GeneratedValue(generator = "Comment")
    @SequenceGenerator(name = "Comment" , sequenceName = "COMMENT_ID_SEQ")
    private Long id;

    @Column(name = "TEXT", length = 500, nullable = false)
    private String text;

    @Column(name = "ID_USER")
    private int userId;

    @Column(name = "ID_PRODUCT")
    private Long productId;

}
