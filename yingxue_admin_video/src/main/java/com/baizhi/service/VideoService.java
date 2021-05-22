package com.baizhi.service;

import com.baizhi.entity.Video;
import java.util.List;
import java.util.Map;

/**
 * 视频(Video)表服务接口
 *
 * @author sunt
 * @since 2021-03-18 15:09:15
 */
public interface VideoService {

    Integer total();

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Video queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    Map<String, Object> queryAllByLimit(int offset, int limit,Integer id,
                                        String uploader_name,String name,Integer category_id);

    /**
     * 新增数据
     *
     * @param video 实例对象
     * @return 实例对象
     */
    Video insert(Video video);

    /**
     * 修改数据
     *
     * @param video 实例对象
     * @return 实例对象
     */
    Video update(Video video);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}