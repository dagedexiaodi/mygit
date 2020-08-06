package com.sy.demo04;

/**
 * @Title: Student
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/6/16 0016 10:09
 */
public class Student {

    // 定义私有属性
    private String id;

    private String name;

    private int age;


    public Student() {

    }


    public Student(String id,String name,int age) {
       this.id = id;
        this.name = name;
        this.age = age;
    }



    // 生成get/set


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
        this.age = age;
    }
}
