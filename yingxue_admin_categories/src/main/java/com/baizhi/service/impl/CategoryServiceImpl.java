package com.baizhi.service.impl;

import com.baizhi.entity.Category;
import com.baizhi.dao.CategoryDao;
import com.baizhi.service.CategoryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.*;

/**
 * 分类(Category)表服务实现类
 *
 * @author sunt
 * @since 2021-03-18 15:57:22
 */
@Transactional(propagation = Propagation.REQUIRED)
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {
    @Resource
    private CategoryDao categoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Category queryById(Integer id) {
        return this.categoryDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<Category> queryAllByLimit(int offset, int limit) {
        List<Category> categories = this.categoryDao.queryAllByLimit(offset, limit);
        List<Category> list = new ArrayList<>();
        for (int i = 0; i < categories.size(); i++) {
            if (categories.get(i).getParent_id() == null) {
                list.add(categories.get(i));
            }
        }

        return list;
    }

    /**
     * 新增数据
     *
     * @param category 实例对象
     * @return 实例对象
     */
    @Override
    public Map<String, String> insert(Category category) {
        Date date = new Date();
        category.setCreatedAt(date);
        category.setUpdatedAt(date);
        this.categoryDao.insert(category);
        Map<String, String> map = new HashMap<>();
        map.put("id", category.getId().toString());
        map.put("name", category.getName());
        if (category.getParent_id() == null) {
            map.put("parent_id", "");
        } else {
            map.put("parent_id", category.getParent_id().toString());
        }
        return map;
    }

    /**
     * 修改数据
     *
     * @param category 实例对象
     * @return 实例对象
     */
    @Override
    public Map<String, String> update(Category category) {
        this.categoryDao.update(category);
        Category category1 = this.queryById(category.getId());
        Map<String, String> map = new HashMap<>();
        return map;
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        Category category = categoryDao.queryById(id);
        if (category == null) {
            throw new RuntimeException("删除失败");
        }
        return this.categoryDao.deleteById(id) > 0;
    }
}