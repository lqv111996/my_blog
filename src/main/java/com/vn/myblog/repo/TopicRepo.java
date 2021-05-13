package com.vn.myblog.repo;

import com.vn.myblog.model.Topic;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface TopicRepo extends JpaRepository<Topic, Integer> {
    void deleteTopicById(Integer id);

    Optional<Topic> findTopicById(Integer id);
}
