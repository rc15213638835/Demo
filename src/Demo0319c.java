/**
 * @program: Demo
 * @Date: 2019/3/19 16:08
 * @Author: Mr.Ran
 * @Description:
 */
public class Demo0319c {
    public static void main(String[] args) {
        //生产汽车，在JAVA中通过new操作符来完成。
        //其实就是在堆内存产生一个实体。
//        Car c = new Car();//c就是一个类类型变量。记住类类型变量指向对象。

        //需求:将已有的车的颜色改成蓝色。指挥该对象做使用。在java指挥对象方式是:对象.对象成员。
//        c.color = "blue";
//        c.run();

        //匿名对象：针对只使用一次的对象。
        /*new Car().num = 5;
        new Car().color = "blue";*/
        //调用属性没用以上
        //调用方法有用一下

        /*Car c = new Car();
        c.run();
        c.num = '4';
        //匿名对象使用方式一：当对对象的方法只调用一次时，可以用匿名对象来完成，这样写比较简化。
        //如果对一个对象进行多个成员调用，必须给这个对象起名字
        new Car().run();*/
//        Car q = new Car();
//        show(q);
        show(new Car());//new Car()为匿名对象
    }


    //需求：汽车修配厂。对汽车进行改装，将来的车改成黑车，三个轮胎。
    public static void show(Car c){
        c.num = '3';
        c.color = "black";
        c.run();
    }
}



//需求:描述汽车。描述事物其实就是在描述事物的属性和行为。

//属性对应是类中的变量，行为对应类中的函数（方法）。
//其实定义类，就是在描述事物，就是在定义属性和行为。属性和行为共同称为类中的成员（成员变量和成员方法）。
/*
成员变量和局部变量
成员变量作用于整个类中。
局部变量作用用于函数中，或者语句中。
在内存中的位置：
成员变量：在堆内存中，因为对象的存在，才在内存中存在。
局部变量：存在栈内存中。
 */
class Car{
    //描述颜色
    String color = "红色";
    //描述轮胎数
    int num = 4;

    //运行行为。
    void run(){
        System.out.println(color+".."+num);
    }
}


