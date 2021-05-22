package com.baizhi.service.impl;

import com.baizhi.entity.Video;
import com.baizhi.dao.VideoDao;
import com.baizhi.service.VideoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 视频(Video)表服务实现类
 *
 * @author sunt
 * @since 2021-03-18 15:09:15
 */
@Transactional(propagation = Propagation.REQUIRED)
@Service("videoService")
public class VideoServiceImpl implements VideoService {
    @Resource
    private VideoDao videoDao;


    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Integer total() {
        return videoDao.total();
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Video queryById(Integer id) {
        return this.videoDao.queryById(id);
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
    public Map<String, Object> queryAllByLimit(int offset, int limit,Integer id,
                                               String uploader_name,String name,Integer category_id) {
        Integer rows = (offset - 1) * limit;
        List<Video> videos = this.videoDao.queryAllByLimit(rows, limit,id,uploader_name,name,category_id);
        Integer total = this.total();
        Map<String, Object> map = new HashMap<>();
        map.put("total_count", total);
        map.put("items", videos);
        return map;
    }

    /**
     * 新增数据
     *
     * @param video 实例对象
     * @return 实例对象
     */
    @Override
    public Video insert(Video video) {
        this.videoDao.insert(video);
        return video;
    }

    /**
     * 修改数据
     *
     * @param video 实例对象
     * @return 实例对象
     */
    @Override
    public Video update(Video video) {
        this.videoDao.update(video);
        return this.queryById(video.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.videoDao.deleteById(id) > 0;
    }
}