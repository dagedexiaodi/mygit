package com.sy.demo04;

import java.util.Random;

/**
 * @Title: ClassName
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/6/16 0016 10:11
 *
 * 班级
 */
public class ClassName {

    private Student[] stus = new Student[5];


    /**
     * 增加学生
     */
    public void add(int index,Student student) {
        stus[index] = student;
    }

    /**
     * 预览学生 [遍历]
     */
    public void printStu() {

        for(int i =0;i < stus.length;i++) {
            Student stu = stus[i];
            System.out.println("学号:"+stu.getId()+"\t姓名:"+stu.getName()+"\t年龄:"+stu.getAge());
        }

    }

    /**
     * 随机点名
     */
    public void callName() {
        // 1 随机获取一个 数组索引   0-4
        Random random = new Random();
        int index = random.nextInt(stus.length);
        // 2 获取学生
        Student stu = stus[index];

        System.out.println("随机点名:学号:"+stu.getId()+"\t姓名:"+stu.getName()+"\t年龄:"+stu.getAge());


    }

//    public static void main(String[] args) {
//        // 1 随机获取一个 数组索引   0-4
//        Random random = new Random();
//        int index = random.nextInt(1);
//        System.out.println(index);
//    }




}
