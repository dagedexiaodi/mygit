package com.sy.demo02;

/**
 * @Title: StudentTest
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/6/16 0016 09:25
 */
public class StudentTest {


    /**
     * 快捷生成 main方法 入口函数
     * psvm
     */
    public static void main(String[] args) {
        // 1  创建学生对象
        //  创建对象   公式    类名  对象名 = new 类名();
        Student student = new Student();
        // 2 为对象的属性赋值
        // 公式  对象名.属性名 = value
        student.name = "小明";
       // student.age = -1;
        student.setAge(30);
        // 3  打印 获取属性   value = 对象名.属性
        // 打印快捷键 sout
        System.out.println("姓名:"+student.name+"\t年龄:"+student.getAge());

    }
}
