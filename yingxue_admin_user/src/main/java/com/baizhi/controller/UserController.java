package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 用户(User)表控制层
 *
 * @author sunt
 * @since 2021-03-18 14:18:46
 */
@RestController
//@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public User selectOne(Integer id) {
        return this.userService.queryById(id);
    }


    @GetMapping("/admin/users")
    public Map<String, Object> queryAll(Integer page,Integer per_page) {
        return userService.queryAllByLimit(page, per_page);
    }

}