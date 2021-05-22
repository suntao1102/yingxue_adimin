package com.baizhi.service.impl;

import com.baizhi.entity.User;
import com.baizhi.dao.UserDao;
import com.baizhi.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户(User)表服务实现类
 *
 * @author sunt
 * @since 2021-03-18 14:18:45
 */
@Service("userService")
@Transactional(propagation = Propagation.REQUIRED)
public class UserServiceImpl implements UserService {
    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
    @Resource
    private UserDao userDao;

    /**
     * 查询总数
     * @return
     */
    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Integer total() {
        return userDao.total();
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public User queryById(Integer id) {
        return this.userDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public Map<String,Object> queryAllByLimit(int offset, int limit) {
        log.info("offset:{}",offset);
        log.info("limit:{}",limit);
        Integer rows = (offset - 1) * limit ;
        List<User> users = this.userDao.queryAllByLimit(rows, limit);
        log.info("user:{}", users);
        Integer total = this.total();
        log.info("total:{}", total);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("total_count", total);
        map.put("items", users);
        return map;
    }

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public User insert(User user) {
        this.userDao.insert(user);
        return user;
    }




    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User update(User user) {
        this.userDao.update(user);
        return this.queryById(user.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.userDao.deleteById(id) > 0;
    }
}