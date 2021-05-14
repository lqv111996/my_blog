package com.vn.blog_project.resource;


import com.vn.blog_project.model.Topic;
import com.vn.blog_project.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topic")
public class TopicResource {
    private final TopicService topicService;

    @Autowired
    public TopicResource(TopicService topicService) {
        this.topicService = topicService;
    }

    @GetMapping
    public ResponseEntity<List<Topic>> listTopic() {
        List<Topic> result = topicService.listTopic();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Topic> getTopic(@PathVariable("id") Integer id) {
        Topic result = topicService.getTopic(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Topic> addTopic(@RequestBody Topic topic) {
        Topic result = topicService.addTopic(topic);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    @PutMapping("")
    public ResponseEntity<Topic> updateTopic(@RequestBody Topic topic) {
        Topic result = topicService.addTopic(topic);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTopic(@PathVariable Integer id) {
        topicService.deleteTopic(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
