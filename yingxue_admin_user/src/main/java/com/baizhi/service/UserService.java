package com.baizhi.service;

import com.baizhi.entity.User;
import java.util.List;
import java.util.Map;

/**
 * 用户(User)表服务接口
 *
 * @author sunt
 * @since 2021-03-18 14:18:45
 */
public interface UserService {

    /**
     * 查询总数
     * @return
     */
    Integer total();
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    User queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    Map<String, Object> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    User insert(User user);

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    User update(User user);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}