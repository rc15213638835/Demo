package new_model;

/**
 * @program: Demo
 * @Date: 2019/3/25 14:43
 * @Author: Mr.Ran
 * @Description:
 */
/*
这个是先初始化对象。
称为：饿汉式。
Single类进内存，就已经创建好了对象。
开发一般用饿汉式，理由：简单、安全。
*/
/*class Single{
    private static Single s = new Single();
    private Single(){}
    public static Single getInstance(){
        return s;
    }
}*/

/*对象是方法被调用时，才初始化，也叫延时加载。称为：懒汉式。
Single类进内存，对象还没有存在，只有调用了getInstance方法是，才建立对象。
*/
class Single{
    private static Single s = null;
    private Single(){}
    public static Single getInstance(){
        if (s==null)
            s = new Single();
        return s;
    }
}


public class SingleDemo2 {
}
