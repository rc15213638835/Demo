/**
 * @program: Demo
 * @Date: 2019/3/25 10:48
 * @Author: Mr.Ran
 * @Description:
 */
/*
静态代码块。
格式：
static{
静态代码块中的执行语句。
}
特点：随着类的加载而执行，只执行一次。
用于给类进行初始化的。
 */

class StaticCode{
    int num = 9;
    void staticCode(){
        System.out.println("b");
    }
    static{
        System.out.println("a");
    }
    {
        System.out.println("c"+this.num);
    }
    StaticCode(int x){
        System.out.println("d");
    }
    public static void show(){
        System.out.println("show run");
    }
}
class StaticCodeDemo {
    static {
//        System.out.println("b");
    }
    public static void main(String[] args) {
        new StaticCode(4);//a c d
//        new StaticCode();
//        new StaticCode();
//        System.out.println("over");
//        StaticCode.show();
//        StaticCode s = null;
    }
    static {
//        System.out.println("c");
    }
}
// b c a over 先运行主函数。