package com.sprint.socialmeli.dto.post;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PromoPostCountResponseDTO {
    private int user_id;
    private String user_name;
    private int promo_products_count;
}
