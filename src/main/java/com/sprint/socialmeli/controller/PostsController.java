package com.sprint.socialmeli.controller;

import com.sprint.socialmeli.dto.post.PostDTO;
import com.sprint.socialmeli.dto.post.PromoDTO;
import com.sprint.socialmeli.dto.post.PromoPostCountResponseDTO;
import com.sprint.socialmeli.service.post.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class PostsController {

    @Autowired
    IPostService postService;

    // US0005.
    @PostMapping("/post")
    public ResponseEntity<?> createPost(@RequestBody PostDTO post){
        this.postService.createPost(post);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    // US0006.
    @GetMapping("/followed/{userId}/list")
    public ResponseEntity<?> getFollowedPosts(@PathVariable Integer userId,
                                              @RequestParam(required = false) String order){
        return new ResponseEntity<>(postService.getFollowedProductsList(userId, order), HttpStatus.OK);
    }

    // US0010.
    @PostMapping("/promo-post")
    public ResponseEntity<Void> createPromoPost(@RequestBody PromoDTO promo){
        this.postService.createPromo(promo);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    // US0011
    @GetMapping("/promo-post/count")
    public ResponseEntity<PromoPostCountResponseDTO> getPromoPostCount(@RequestParam Integer user_id){
        return new ResponseEntity<>(postService.getPromoPostCount(user_id), HttpStatus.OK);
    }

}
