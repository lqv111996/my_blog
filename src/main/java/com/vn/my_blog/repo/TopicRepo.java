package com.vn.my_blog.repo;

import com.vn.my_blog.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface TopicRepo extends JpaRepository<Topic, Integer> {
    void deleteTopicById(Integer id);

    Optional<Topic> findTopicById(Integer id);
}