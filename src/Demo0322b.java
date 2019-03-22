/**
 * @program: Demo
 * @Date: 2019/3/22 16:21
 * @Author: Mr.Ran
 * @Description:
 */
/*
什么时候使用静态？

要从两方面下手：
因为静态修饰的内容有成员变量和函数。
什么时候定义静态变量（类变量）呢？
    当对象中出现共享数据时（此处指值，不是属性），该数据被静态所修饰。
    对象中的特有数据要定义成非静态存在于堆内存中。
什么时候定义静态函数呢？
    当功能内部没有访问到非静态数据（对象的特有数据），那么该功能可以定义成静态的。
 */
class Person{
    String name;
    public static void show(){
        System.out.println("haha");
    }
}
public class Demo0322b {
    public static void main(String[] args) {
//        Person p = new Person();
//        p.show();
        Person.show();
    }
}
