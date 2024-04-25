package com.sprint.socialmeli.service.post;
import com.sprint.socialmeli.dto.post.FollowedProductsResponseDTO;
import com.sprint.socialmeli.dto.post.PostDTO;
import com.sprint.socialmeli.dto.post.PromoDTO;
import com.sprint.socialmeli.dto.post.PromoPostCountResponseDTO;

public interface IPostService {

    void createPost(PostDTO post);
    FollowedProductsResponseDTO getFollowedProductsList(Integer customer_id, String order);

    void createPromo(PromoDTO promoDTO);

    PromoPostCountResponseDTO getPromoPostCount(Integer sellerId);

}