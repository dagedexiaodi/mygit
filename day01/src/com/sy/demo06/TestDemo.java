package com.sy.demo06;

/**
 * @Title: TestDemo
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/6/16 0016 11:43
 */
public class TestDemo {

    public static void main(String[] args) {
        // 1 创建一个学生
        Student stu = new Student();
        stu.name = "小明";
        stu.eat();

        Teacher t = new Teacher();
        t.address = "xxxx";
        t.work();
        t.eat();

        Person p = new Person();
        p.name = "我是人";
        p.eat();

    }
}
