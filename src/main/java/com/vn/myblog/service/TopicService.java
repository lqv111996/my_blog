package com.vn.myblog.service;

import com.vn.myblog.exception.TopicNotFoundException;
import com.vn.myblog.model.Topic;
import com.vn.myblog.repo.TopicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {
    private final TopicRepo topicRepo;

    @Autowired
    public TopicService(TopicRepo topicRepo) {
        this.topicRepo = topicRepo;
    }

    public Topic addTopic(Topic topic) {
        return topicRepo.save(topic);
    }

    public List<Topic> listTopic() {
        return topicRepo.findAll();
    }

    public Topic getTopic(Integer id) {
        return topicRepo.findTopicById(id).orElseThrow(() -> new TopicNotFoundException("Not found topic id: " + id));
    }

    public void deleteTopic(Integer id) {
        topicRepo.deleteById(id);
    }
}
