package com.vn.blog_project.repo;

import com.vn.blog_project.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface TopicRepo extends JpaRepository<Topic, Integer> {
    void deleteTopicById(Integer id);

    Optional<Topic> findTopicById(Integer id);
}