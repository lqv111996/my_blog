package com.vn.blog_project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Account implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String avatarUrl;
    private Long createdTime;
    private Long updatedTime;

    public Account(String name, String avatarUrl, Long createdTime, Long updatedTime) {
        this.name = name;
        this.avatarUrl = avatarUrl;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
    }

    public Account() {

    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public Long getCreatedTime() {
        return createdTime;
    }

    public Long getUpdatedTime() {
        return updatedTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    public void setUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
    }
}
