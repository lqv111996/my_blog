package com.vn.my_blog.service;

import com.vn.my_blog.exception.PostNotFoundException;
import com.vn.my_blog.model.Post;
import com.vn.my_blog.repo.PostRepo;
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
