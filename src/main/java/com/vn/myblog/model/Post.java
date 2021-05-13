package com.vn.myblog.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Post implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Integer id;
    private String title;
    private String content;
    private Integer topicId;
    private Long createdTime;
    private Long updatedTime;
    private String creator;


    public Post(String title, String content, Integer topicId, Long createdTime, Long updatedTime, String creator) {
        this.title = title;
        this.content = content;
        this.topicId = topicId;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
        this.creator = creator;
    }

    public Post() {
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public Long getCreatedTime() {
        return createdTime;
    }

    public Long getUpdatedTime() {
        return updatedTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    public void setUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}
