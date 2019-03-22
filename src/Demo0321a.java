/**
 * @program: Demo
 * @Date: 2019/3/21 11:23
 * @Author: Mr.Ran
 * @Description:
 */
/*
静态：static
用法：是一个修饰符，用于修饰成员（成员变量，成员函数）
当成员被静态修饰后，就多了一个调用方式，除了可以被对象调用外，还可以直接被类名调用，类名.静态成员。
 */
class Person{
    String name;
    static String country = "CN";//静态修饰
    public void show(){
        System.out.println(name+"::"+country);
    }
}

class Demo0321a {
    public static void main(String[] args) {
//        Person p = new Person();
//        p.name = "zhangsan";
//        p.show();
//        System.out.println(p.country);
        System.out.println(Person.country);//static修饰以后可以被类名调用
    }
}

