package com.vn.blog_project.service;

import com.vn.blog_project.exception.PostNotFoundException;
import com.vn.blog_project.model.Post;
import com.vn.blog_project.repo.PostRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private final PostRepo postRepo;

    public PostService(PostRepo postRepo) {
        this.postRepo = postRepo;
    }

    public List<Post> listPost() {
        return postRepo.findAll();
    }

    public Post getPost(Integer id) {
        return postRepo.findPostById(id).orElseThrow(() -> new PostNotFoundException("Not found post id: " + id));
    }

    public Post addPost(Post post) {
        return postRepo.save(post);
    }

    public Post updatePost(Post post) {
        return postRepo.save(post);
    }

    public void deletePost(Integer id) {
        postRepo.deleteById(id);
    }
}
