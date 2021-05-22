package com.baizhi.dao;

import com.baizhi.entity.Video;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 视频(Video)表数据库访问层
 *
 * @author sunt
 * @since 2021-03-18 15:09:15
 */
public interface VideoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Video queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Video> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit
                        ,@Param("id") Integer id,
                                @Param("uploader_name") String uploader_name,
                                        @Param("name") String name,
                                        @Param("category_id") Integer category_id
                        );


    /**
     * 通过实体作为筛选条件查询
     *
     * @param video 实例对象
     * @return 对象列表
     */
    List<Video> queryAll(Video video);

    /**
     * 新增数据
     *
     * @param video 实例对象
     * @return 影响行数
     */
    int insert(Video video);

    /**
     * 修改数据
     *
     * @param video 实例对象
     * @return 影响行数
     */
    int update(Video video);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    /**
     * 查询总页数
     * @return
     */
    Integer total();

}