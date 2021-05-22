package com.baizhi.entity;

import java.util.Date;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * 分类(Category)实体类
 *
 * @author sunt
 * @since 2021-03-18 15:57:22
 */
public class Category implements Serializable {
    private static final long serialVersionUID = 973375836945837205L;
    
    private Integer id;
    /**
    * 名称
    */
    private String name;
    /**
    * 父级分类id
    */
    private Integer parent_id;

    private List<Category> children;
    
    private Date createdAt;
    
    private Date updatedAt;
    
    private Date deletedAt;


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

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
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

    public List getChildren() {
        return children;
    }

    public void setChildren(List children) {
        this.children = children;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return id.equals(category.id) && name.equals(category.name) && parent_id.equals(category.parent_id) && children.equals(category.children) && createdAt.equals(category.createdAt) && updatedAt.equals(category.updatedAt) && deletedAt.equals(category.deletedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, parent_id, children, createdAt, updatedAt, deletedAt);
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parent_id=" + parent_id +
                ", children=" + children +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", deletedAt=" + deletedAt +
                '}';
    }
}