package com.sprint.socialmeli.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Promo {

    private Post post;
    private boolean hasPromo;
    private double discount;
}
