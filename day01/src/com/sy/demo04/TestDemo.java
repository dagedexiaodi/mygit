package com.sy.demo04;

import java.util.Scanner;

/**
 * @Title: TestDemo
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/6/16 0016 10:20
 */
public class TestDemo {


    public static void main(String[] args) {
       // 1 创建一个班级
        ClassName className = new ClassName();

        // 手动录入学生信息【只需要实例化一次】
        Scanner scanner =  new Scanner(System.in);
        // 变量定义一般都定义在循环外面
        String  id;
        String  name;
        int  age;
        Student stu;

        // 2  为班级添加学生[5个]
        for(int i = 0;i<5;i++) {


            System.out.println("请输入学生编号:");
            id = scanner.next();
            System.out.println("请输入学生姓名:");
            name = scanner.next();
            System.out.println("请输入学生年龄:");
            age = scanner.nextInt();

            //  创建学生对象
            //stu = new Student(); // 空对象
            // 为空对象赋值
//            stu.setId(id);
//            stu.setName(name);
//            stu.setAge(age);
            // 为对象赋值的方式
            // 1- get/set
            // 2 - 构造方法
            // 生成对象的同时 就已经将对象中的值赋值了
            stu = new Student(id,name,age);

            // 将创建好的学生存储到班级中
            className.add(i,stu);

        }

        // 3  预览班级的学生
        className.printStu();

        // 4 随机点名
        className.callName();




    }
}
