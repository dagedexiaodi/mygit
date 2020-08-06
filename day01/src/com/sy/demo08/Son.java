package com.sy.demo08;

/**
 * @Title: Son
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/6/16 0016 14:32
 *
 *  1)  类中变量的查找关系
 *    本着就近原则查找
 *       找局部变量
 *       局部变量不存在   找 成员变量
 *       成员变量不存在   找  父类
 *    强行查找:
 *       局部变量 访问变量的时候  前面什么都不用加
 *       成员变量  变量前面添加 this
 *       父级变量   变量强前面添加 super
 *
 *    方法的查找也是如此
 *      1） 方法中不能够嵌套方法
 *
 *
 */
public class Son extends Father{

    //public String name = "我是子类";

    public void fun(String  n) {
        System.out.println(name);
        // this 本类对象
        System.out.println(this.name);
        // super 代指父类对象
        System.out.println(super.name);
        fun2();
        this.fun2();
        super.fun2();
    }

    public void fun2() {
        System.out.println("我是子类方法.....");
    }


    public static void main(String[] args) {
          // 1 调用子类的 fun 函数
          Son son = new Son();
          son.fun("我是局部变量");
    }
}
