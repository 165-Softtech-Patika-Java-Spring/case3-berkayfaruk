package com.example.study3.controller;
import com.example.study3.entity.Comment;
import com.example.study3.entity.User;
import com.example.study3.service.CommentEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.webjars.NotFoundException;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class CommentController {
    private final CommentEntityService commentService;

    @PostMapping("/comment")
    public ResponseEntity save(@RequestBody Comment comment){

        var newComment = commentService.save(comment);

        return ResponseEntity.ok(newComment);
    }
    @GetMapping("/comment/{productID}")
    public ResponseEntity findAllByProductId(@PathVariable long id){

        var data = commentService.listProductByComment(id);
        if (data.isEmpty()){
            throw new NotFoundException("Ürüne henüz bir yorum yapılmamış");
        }

        return ResponseEntity.ok(data);
    }
    @GetMapping("/comment/{userId}")
    public ResponseEntity findByUserId(@PathVariable Long id){


        var data = commentService.findByUserId(id);
        if (data.isEmpty()){
            throw new NotFoundException("kullanıcı henüz bir yorum yazmamıştır");
        }

        return ResponseEntity.ok(data);
    }


}
