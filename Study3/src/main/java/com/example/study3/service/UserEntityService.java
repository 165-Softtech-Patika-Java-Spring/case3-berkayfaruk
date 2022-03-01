package com.example.study3.service;


import com.example.study3.dao.UserDao;
import com.example.study3.entity.Product;
import com.example.study3.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.io.NotActiveException;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserEntityService {
    private final UserDao userDao;

    public List<User> findAll(){
        return userDao.findAll();
    }
    public User save(User product){
        return userDao.save(product);
    }
    public void deleteUser(Long id){
        User user= userDao.getById(id);
        userDao.delete(user);
    }
    public User findByUserId(long id){
        return userDao.findById(id);
    }
    public User findByUserName(String name){
        return userDao.findByName(name);
    }
    public User updateUser(User user){
        Optional<User> userOptional = userDao.findById(user.getId());

        User updateUser;
        if (userOptional.isPresent()){
            updateUser = userOptional.get();
        } else {
            throw new NotFoundException("Item not found!");
        }

        user.setName(user.getName());
        updateUser.setUserType(user.getUserType());
        updateUser.setMail(user.getMail());
        updateUser.setPhone(user.getPhone());


        return userDao.save(updateUser);
    }
    public void delete(Long id,String userName,long phoneNumber){
        Optional<User> userOptional = userDao.findById(id);
        User deleteUser;
        if (userOptional.isPresent()){
            deleteUser = userOptional.get();
            if (deleteUser.getName()==userName && deleteUser.getPhone()==phoneNumber){
                userDao.delete(deleteUser);
            }
            else {
                throw new NotFoundException("Kullanıcı adı ve telefon bilgileri uyuşmamaktadır !");
            }

        } else {
            throw new NotFoundException("Item not found!");
        }


    }



}
