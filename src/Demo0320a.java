/**
 * @program: Demo
 * @Date: 2019/3/20 11:09
 * @Author: Mr.Ran
 * @Description:
 */


/*
private:私有，权限修饰符：用于修饰类中的成员（成员变量，成员函数）
私有只有在本类中有效。

将age私有化以后，类以外即使建立了对象也不能直接访问。
但是人应该有年龄，就需要在person类中提供对应访问age的方法

注意：私有仅仅是封装的一种表现形式。

之所以对外提供访问方式，就因为可以在访问方式中加入逻辑判断等语句。
对访问的数据进行操作。提高代码的健壮性。
 */
class Demo0320a {
    //private int age;//只能在Demo0320a本类中使用，在此类以外不能使用。
    private int age;
    public void setAge(int a){
        age = a;
    }


    public int getAge(){
        return age;
    }
    void speak(){
        System.out.println("age="+age);
    }
}

class PersonDemo{
    public static void main(String[] args) {
        Demo0320a p = new Demo0320a();

        //p.age = -20;
        p.setAge(-40);
        p.speak();
    }
}
