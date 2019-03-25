package new_model;

/**
 * @program: Demo
 * @Date: 2019/3/25 13:56
 * @Author: Mr.Ran
 * @Description:
 */

/*
设计模式：
Java中23中设计模式
单例设计模式：解决一个类在内存中只有一个对象。

想要保证对象唯一。
1、为了避免其他程序过多建立该类对象。先控制禁止其他程序建立该类对象。
2、还为了让其他程序可以访问到该类对象，只好在本类中，自定义一个对象。
3、为了方便其他程序对自定义对象的访问，可以对外提供一些访问方式。

这三步怎么用代码体现呢？
1、将构造函数私有化。
2、在类中创建一个本类对象。
3、提供一个方法获取到该对象。

对于事物该怎么描述，还怎么描述。
当需要将该事物的对象保证在内存中唯一时，就将以上三步加上即可。
*/
public class SingleDemo {
    public static void main(String[] args) {
//        Single ss = Single.getInstance();
//        Single s1 = new Single();//创建一个新的对象
//        Single s2 = new Single();
//        s1.setNum(30);
//        System.out.println(s2.getNum());
//        Single s1 = Single.getInstance();//只有一个对象
//        Single s2 = Single.getInstance();
//        s1.setNum(23);
//
//        System.out.println(s2.getNum());

//        Student s1 = new Student();
//        Student s2 = new Student();
//        s2.setAge(12);

        Student s1 = Student.getAge();
        Student s2 = Student.getAge();

    }
}

/*
class Single{
    private int num;
    public void setNum(int num){
        this.num = num;
    }
    public int getNum(){
        return num;
    }

    private Single(){}//构造函数私有化
    private static Single s = new Single();
//    public static Single getInstance(){//因为只有一个对象，所以只有get没有set
//        return s;
//    }
}
*/

class Student{
    private int age;
    private static Student s = new Student();
    private Student(){}
//    public void setAge(int age){
//        this.age = age;
//    }
    public static Student getAge(){
        return s;
    }
}
