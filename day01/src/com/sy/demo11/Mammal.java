package com.sy.demo11;

/**
 * @Title: Mammal
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/6/16 0016 16:31
 * public abstract class Mammal
 *
 */
public abstract class Mammal extends  Animal {

    /**
     * eat 方法  没有用  只是为了告诉 子类   必须要有eat方法
     *   至于 如何实现这个方法 我不管
     *  可以将这样的方法定义成 抽象方法
     *  抽象方法的公式
     *    权限修饰符
     *      public abstract 返回值类型  方法名();
     *
     *
     *  抽象方法不能存在在非抽象类中
     *
     */
   public abstract void  eat();

    public void type() {
        System.out.println("胎生......");
    }
}
