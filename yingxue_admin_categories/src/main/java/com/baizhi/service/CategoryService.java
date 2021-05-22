package com.baizhi.service;

import com.baizhi.entity.Category;
import java.util.List;
import java.util.Map;

/**
 * 分类(Category)表服务接口
 *
 * @author sunt
 * @since 2021-03-18 15:57:22
 */
public interface CategoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Category queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Category> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param category 实例对象
     * @return 实例对象
     */
    Map<String, String> insert(Category category);

    /**
     * 修改数据
     *
     * @param category 实例对象
     * @return 实例对象
     */
    Map<String, String> update(Category category);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}