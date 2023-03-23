package com.itzhang.design.pattern.flyweight.upload.test;

import com.itzhang.design.pattern.flyweight.upload.factory.UploadFactory;
import com.itzhang.design.pattern.flyweight.upload.type.UploadType;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2315:55
 * @Descripton:
 */
public class UplaodTest {
    public static void main(String[] args) {
        UploadFactory uploadFactory = new UploadFactory();
        uploadFactory.upload(UploadType.VIDEO);
        uploadFactory.upload(UploadType.IMAGE);
    }
}
