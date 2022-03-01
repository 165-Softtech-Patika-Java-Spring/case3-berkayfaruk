package com.example.study3.service;

import com.example.study3.dao.CommentDao;
import com.example.study3.entity.Comment;
import com.example.study3.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentEntityService {

    private final CommentDao commentDao;

    public List<Comment> findAll(){
        return commentDao.findAll();
    }
    public Comment save(Comment comment){
        return commentDao.save(comment);
    }
    public void deleteUser(Long id){
        Comment comment= commentDao.getById(id);
        commentDao.delete(comment);
    }
    public List<Comment> listProductByComment(long id){
        return commentDao.findAllByProductId(id);
    }

    public List<Comment> findByUserId(long id){
        return commentDao.findByUserId(id);
    }
}
