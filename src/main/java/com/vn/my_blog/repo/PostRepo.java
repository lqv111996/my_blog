package com.vn.my_blog.repo;

import com.vn.my_blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostRepo extends JpaRepository<Post, Integer> {
    Optional<Post> findPostById(Integer id);

    void deletePostById(Integer id);
}
