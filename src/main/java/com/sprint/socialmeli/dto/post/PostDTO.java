package com.sprint.socialmeli.dto.post;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@Getter
@AllArgsConstructor
public class PostDTO implements Serializable {
    private final Integer user_id;
    private final String date; //Entra como dd/MM/yyyy
    private final ProductDTO product;
    private final Integer category;
    private final Double price;
}
