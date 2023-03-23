package comg.itzhang.design.pattern.flyweight.upload.imp;

import comg.itzhang.design.pattern.flyweight.upload.AbstractUpload;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2315:44
 * @Descripton:
 */
public class ImageFile implements AbstractUpload {
    public void upload() {
        System.out.println("上传图片文件。。。。");
    }
}
