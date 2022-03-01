package com.example.study3.dao;

import com.example.study3.entity.Comment;
import com.example.study3.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentDao extends JpaRepository<Comment,Long> {

    Comment findById(long id);


    List<Comment> findAllByProductId(long id);

    List<Comment> findByUserId(long id);


}
