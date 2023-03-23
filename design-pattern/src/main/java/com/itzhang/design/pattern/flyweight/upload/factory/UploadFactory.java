package com.itzhang.design.pattern.flyweight.upload.factory;

import com.itzhang.design.pattern.flyweight.upload.AbstractUpload;
import com.itzhang.design.pattern.flyweight.upload.imp.ImageFile;
import com.itzhang.design.pattern.flyweight.upload.imp.VideoFile;
import com.itzhang.design.pattern.flyweight.upload.type.UploadType;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2315:47
 * @Descripton:
 */
public class UploadFactory {
    private Map<UploadType, AbstractUpload> uploadMap;

    public UploadFactory() {
        this.uploadMap = new HashMap<UploadType, AbstractUpload>();
        this.uploadMap.put(UploadType.IMAGE,new ImageFile());
        this.uploadMap.put(UploadType.VIDEO,new VideoFile());
    }

    public void upload(UploadType type){
        uploadMap.get(type).upload();
    }
}
