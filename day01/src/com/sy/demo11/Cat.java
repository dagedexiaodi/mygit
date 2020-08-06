package com.sy.demo11;

/**
 * @Title: Cat
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/6/16 0016 16:27
 * 猫
 */
public class Cat extends Mammal{

    /**
     *  上级开发人员制定标准时候
     *  认为  凡是怓就必须要有 吃方法
     *
     *  重写父类的抽象方法
     *
     */
    public  void eat() {
        System.out.println("猫吃鱼....");
    }



    public  void play() {
        System.out.println("捕捉老鼠...");
    }

//    public void type() {
//        System.out.println("胎生......s");
//    }
}
