package com.sy.demo10;

/**
 * @Title: TestDemo
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/6/16 0016 16:10
 */
public class TestDemo {

    public static void main(String[] args) {
        // 1 实例化老款手机
        Phone p = new Phone();
        p.call();
        p.sendMessage();
        p.show();


        // 2 实例化新款手机
        IOSPhone iosPhone = new IOSPhone();
        iosPhone.call();
        iosPhone.sendMessage();
        iosPhone.show();
        iosPhone.movie();
    }
}
