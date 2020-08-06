package com.sy.demo10;

/**
 * @Title: IOSPhone
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/6/16 0016 16:08
 */
public class IOSPhone extends Phone {


    /**
     * 升级了来电显示
     */
    public void show() {
        // 在原有的基础上 扩展功能
        super.show();
        System.out.println("显示头像.....");
    }


    public void movie() {
        System.out.println("看电影。。。。。");
    }
}
