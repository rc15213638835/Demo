/**
 * @program: Demo
 * @Date: 2019/3/20 15:27
 * @Author: Mr.Ran
 * @Description:
 */


/*
this:看上去，是用于区分局部与成员变量之间同名情况
this为什么可以解决这个问题呢？
this到底代表的是什么呢？
this:代表本类的对象
this代表它所在函数所属对象的引用。
简单说：哪个对象在调用this所在函数，this就代表哪个对象。

this语句只能构造函数的第一行。因为初始化的动作要先执行。

this的应用：当定义类中功能时，该函数内部要用到调用该函数的对象时，这时用this来表示这个对象。
但凡本类功能内部使用到了本类对象都用this表示。
 */
/*
对象一建立就会调用与之对应的构造函数。

构造函数的作用：可以用于给对象进行初始化。
当一个类中没有定义构造函数时，那么系统会默认给该类加入一个空参数的构造函数。

当在类中自定义了构造函数后，默认的构造函数就没有了。

构造函数和一般函数在写法上有不同

在运行上也有不同
构造函数是在对象一建立就运行，给对象初始化
而一般方法是对象调用才执行，是给对象添加对象具备的功能。

一个对象建立，构造函数只运行一次。
而一般方法可以被该对象调用多次。

什么时候定义构造函数呢
当分析事物时，该事物存在具备一些特性或者行为，那么将这些内容定义在构造函数中。
 */
/*class Person {
    private String name;
    private int age;

    Person(){

    }

    Person(int age) {
        this.age = age;

    }

    *//*
    构造代码块
    作用：给对象进行初始化
    对象一建立就运行，而且优先于构造函数执行。
    和构造函数的区别：
    构造代码块是给所有对象进行统一初始化，而构造函数是给对应的对象初始化
     *//*
    *//*{
        System.out.println("person code run");
    }*//*
    Person(String name) {
        this.name = name;
    }

    Person(String name, int age) {
        this(name);//p(name);
        this.age = age;
//        System.out.println("B:name="+name+",,age="+age);
//        cry();
    }
    *//*Person(String n,int a){
        name = n;
        age = a;
        System.out.println("C:name="+name+",,age="+age);
        cry();
    }*//*

    *//*
    需求：给人定义一个用于比较年龄是否相同的功能。也就是说是否是同龄人。
     *//*
    public void speak(){
        System.out.println("name="+this.name+"age="+this.age);
        this.show();
    }
    public void show(){
        System.out.println(this.name);
    }
    public boolean compare(Person p){
        return this.age == p.age;

    }



}*/

    /*class Demo0320b{
        public static void main(String[] args) {
            *//*Person p1 = new Person(20);
            Person p2 = new Person(25);
            boolean b = p1.compare(p2);
            System.out.println(b);*//*
            Person p = new Person("lisi",30);
            Person p1 = new Person("lisi2",36);

        }
    }*/








