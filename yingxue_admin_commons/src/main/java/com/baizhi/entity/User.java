package com.baizhi.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户(User)实体类
 *
 * @author sunt
 * @since 2021-03-18 14:18:45
 */
public class User implements Serializable {
    private static final long serialVersionUID = 918457844869326413L;
    
    private Integer id;
    /**
    * 用户名
    */
    private String name;
    /**
    * 头像链接
    */
    private String avatar;
    /**
    * 简介
    */
    private String intro;
    /**
    * 手机号
    */
    private String phone;
    /**
    * 是否绑定手机号
    */
    private Object phone_linked;
    /**
    * 微信openid
    */
    private String openid;
    /**
    * 是否绑定微信
    */
    private Object wechat_linked;
    /**
    * 关注数
    */
    private Integer followingCount;
    /**
    * 粉丝数
    */
    private Integer followersCount;
    
    private Date createdAt;
    
    private Date updatedAt;
    
    private Date deletedAt;

    public User() {
    }

    public User(Integer id, String name, String avatar, String intro, String phone, Object phone_linked, String openid, Object wechat_linked, Integer followingCount, Integer followersCount, Date createdAt, Date updatedAt, Date deletedAt) {
        this.id = id;
        this.name = name;
        this.avatar = avatar;
        this.intro = intro;
        this.phone = phone;
        this.phone_linked = phone_linked;
        this.openid = openid;
        this.wechat_linked = wechat_linked;
        this.followingCount = followingCount;
        this.followersCount = followersCount;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Object getPhone_linked() {
        return phone_linked;
    }

    public void setPhone_linked(Object phone_linked) {
        this.phone_linked = phone_linked;
    }

    public Object getWechat_linked() {
        return wechat_linked;
    }

    public void setWechat_linked(Object wechat_linked) {
        this.wechat_linked = wechat_linked;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }



    public Integer getFollowingCount() {
        return followingCount;
    }

    public void setFollowingCount(Integer followingCount) {
        this.followingCount = followingCount;
    }

    public Integer getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(Integer followersCount) {
        this.followersCount = followersCount;
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