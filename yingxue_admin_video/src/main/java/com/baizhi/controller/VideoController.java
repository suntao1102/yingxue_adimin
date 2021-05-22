package com.baizhi.controller;

import com.baizhi.entity.Video;
import com.baizhi.service.VideoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 视频(Video)表控制层
 *
 * @author sunt
 * @since 2021-03-18 15:09:15
 */
@RestController
//@RequestMapping("video")
public class VideoController {
    /**
     * 服务对象
     */
    @Resource
    private VideoService videoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/admin/videos/selectOne")
    public Video selectOne(Integer id) {
        return this.videoService.queryById(id);
    }


    @GetMapping("/admin/videos")
    public Map<String, Object> queryAll(Integer page, Integer per_page,Integer id,
                                        String uploader_name,String name,Integer category_id) {
        return videoService.queryAllByLimit(page, per_page,id,uploader_name,name,category_id);
    }
}