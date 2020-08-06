package com.sy.demo01;

/**
 * @Title: Student
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/6/16 0016 09:15
 *
 * 学生类
 */
public class Student {
    /**
     * 成员变量  【属性】
     *   权限修饰符  类型  属性名
     *
     *   四大权限修饰符
     *     public 公共的
     *     protected 受保护的
     *     default 默认 【什么都不写]
     *     private 私有的  【封装性】
     *
     *    java 编程
     *      方法对外公开
     *      属性对内私有
     *
     */

     private String id;

     private String name;

     private int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <=0 || age >= 150) {
            age = 18;
        }
        this.age = age;
    }


    public static void main(String[] args) {
        Student stu = new Student();
        stu.setAge(-1);
        System.out.println(stu.getAge());
    }

}
