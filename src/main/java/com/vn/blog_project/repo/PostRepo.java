package com.vn.blog_project.repo;

import com.vn.blog_project.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostRepo extends JpaRepository<Post, Integer> {
    Optional<Post> findPostById(Integer id);

    void deletePostById(Integer id);
}
