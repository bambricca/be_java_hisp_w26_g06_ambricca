package com.sprint.socialmeli.repository.post;

import com.sprint.socialmeli.entity.Post;
import com.sprint.socialmeli.entity.Promo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class PostRepositoryImpl implements IPostRepository{
    Map<Integer, List<Post>> postMap = new HashMap<>();

    List<Promo> promosList = new ArrayList<>();

    @Override
    public void save(Post post, Integer sellerId) {
        List<Post> postList = findBySellerId(sellerId);
        postList.add(post);
        postMap.put(sellerId, postList);
    }

    @Override
    public List<Post> findBySellerId(Integer sellerId) {
        return postMap.getOrDefault(sellerId, new ArrayList<>());
    }

    @Override
    public List<Promo> findPromosBySellerId(Integer sellerId) {
        List<Post> posts = findBySellerId(sellerId);
        return promosList.stream().filter(promo -> posts.stream().filter(post -> post.getId() == promo.getPost().getId()).findAny().orElse(null) != null).toList();

    }

    @Override
    public void savePromo(Promo promo) {
        promosList.add(promo);
    }
}
