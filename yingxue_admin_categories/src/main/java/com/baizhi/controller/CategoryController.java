package com.baizhi.controller;

import com.baizhi.entity.Category;
import com.baizhi.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 分类(Category)表控制层
 *
 * @author sunt
 * @since 2021-03-18 15:57:22
 */
@RestController
//@RequestMapping("category")
public class CategoryController {
    private static final Logger log = LoggerFactory.getLogger(CategoryController.class);
    /**
     * 服务对象
     */
    @Resource
    private CategoryService categoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public Category selectOne(Integer id) {
        return this.categoryService.queryById(id);
    }

    @GetMapping("/admin/categories")
    public List<Category> queryAll() {
        return categoryService.queryAllByLimit(0, Integer.MAX_VALUE);
    }

    /**
     * 通过主键修改
     *
     * @param id
     * @param category
     * @return
     */
    @PatchMapping(value = "/admin/categories/{id}")
    public Map<String, String> updateById(@PathVariable("id") Integer id, @RequestBody Category category) {
        category.setId(id);
        return categoryService.update(category);
    }

    /**
     * 通过主键删除
     *
     * @param id
     */
    @DeleteMapping("/admin/categories/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
        categoryService.deleteById(id);
    }

    @PostMapping("/admin/categories")
    public Map<String, String> insert(@RequestBody Category category) {
        return categoryService.insert(category);
    }
}