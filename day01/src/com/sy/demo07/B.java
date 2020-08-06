package com.sy.demo07;

/**
 * @Title: B
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/6/16 0016 14:24
 *
 * 1) 继承只支持单继承
 * 2）多个子类可以继承同一个父类
 * 3）A继承 B  B 继承 C  那么   A 具有  B 和 C 的属性和函数
 *
 *
 *
 * 一个孩子只能有一个亲生父亲
 * 一个父亲可以有多个孩子
 *
 *
 *
 */
public class B extends A{


    public static void main(String[] args) {
        B b = new  B();
        System.out.println(b.name);
        System.out.println(b.str);
    }

}
