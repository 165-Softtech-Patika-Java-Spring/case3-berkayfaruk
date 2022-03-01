package com.example.study3.controller;

import com.example.study3.entity.User;
import com.example.study3.service.UserEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserEntityService userService;

    @PostMapping("/users")
    public ResponseEntity save(@RequestBody User user){

        var newUser = userService.save(user);

        return ResponseEntity.ok(newUser);
    }
    @GetMapping("/users")
    public ResponseEntity findAllUSer(){

        List<User> userList = userService.findAll();

        return ResponseEntity.ok(userList);
    }
    @GetMapping("/users")
    public ResponseEntity findByUserId(@PathVariable long id){

        var user = userService.findByUserId(id);

        return ResponseEntity.ok(user);
    }
    @GetMapping("/users")
    public ResponseEntity findByUserName(@PathVariable String name){

        var user = userService.findByUserName(name);

        return ResponseEntity.ok(user);
    }
    @PostMapping()
    public ResponseEntity userUpdate(@RequestBody User user){

        var updateData = userService.updateUser(user);

        return ResponseEntity.ok(updateData);
    }



}
