package com.itzhang.design.pattern.flyweight.upload.imp;

import com.itzhang.design.pattern.flyweight.upload.AbstractUpload;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2315:45
 * @Descripton:
 */
public class VideoFile implements AbstractUpload {
    public void upload() {
        System.out.println("上传视频文件。。。。");
    }
}
