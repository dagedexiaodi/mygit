package com.sy.demo02;

/**
 * @Title: Student
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/6/16 0016 09:25
 * 学生类
 */
public class Student {
    /**
     * 访问权限修饰符
     */
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

    // 定义学生的姓名和年龄
    /**
     *  public 修饰符 公开
     *  protected 受保护的  权限和默认几乎一样 都是同包下的
     *                     非同包下  但是有父子关系的 也是可以访问的
     *
     *  默认    修饰符  访问同包下的
     *
     *  私有的
     *     封装性  只能访问当前文件下的
     *
     *  对齐进行 属性的暴露
     *    提供 get /set 方法
     *
     *   alt+insert
     *
     *
     */
     public  String name;

     private int age;


    /**
     * 设置年龄
     * @param age
     * age = 30
     */
//    public void setAge(int age) {
//        // 设置的时候  为属性指定标准 年龄的范围 0 -120
//         if(age < 0 || age > 120) {
//             age = 20;
//         }
//         // 30 = 30
//        // this 代指  当前的对象   age 为当前对象的成员变量进行赋值
//        this.age = age;
//     }
//
//     public int getAge() {
//
//         if(this.age < 0 || this.age > 120) {
//             this.age = 20;
//         }
//
//        return this.age;
//     }


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
