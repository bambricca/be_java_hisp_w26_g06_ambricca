package com.sprint.socialmeli.dto.post;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class PostResponseDTO extends PostDTO implements Serializable {
    private final Integer post_id;

    public PostResponseDTO(Integer user_id, Integer post_id, String date, ProductDTO product, Integer category,
                           Double price) {
        super(user_id, date, product, category, price);
        this.post_id = post_id;
    }
}
