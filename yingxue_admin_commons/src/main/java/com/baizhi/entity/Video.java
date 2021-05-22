package com.baizhi.entity;


import java.util.Date;
import java.io.Serializable;

/**
 * 视频(Video)实体类
 *
 * @author sunt
 * @since 2021-03-18 15:09:15
 */
public class Video implements Serializable {
    private static final long serialVersionUID = -71684860032595629L;
    
    private Integer id;
    /**
    * 标题
    */
    private String title;
    /**
    * 简介
    */
    private String intro;
    /**
    * up主id
    */
    private User uploader;
    /**
    * 视频封面链接
    */
    private String cover;
    /**
    * 视频播放链接
    */
    private String link;
    /**
    * 分类id
    */
    private Integer category_id;
    
    private Date createdAt;
    
    private Date updatedAt;
    
    private Date deletedAt;

    private String category;

    public Video() {
    }

    public Video(Integer id, String title, String intro, User uploader, String cover, String link, Integer category_id, Date createdAt, Date updatedAt, Date deletedAt, String category) {
        this.id = id;
        this.title = title;
        this.intro = intro;
        this.uploader = uploader;
        this.cover = cover;
        this.link = link;
        this.category_id = category_id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public User getUploader() {
        return uploader;
    }

    public void setUploader(User uploader) {
        this.uploader = uploader;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

}