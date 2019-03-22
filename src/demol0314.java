/**
 * @program: Demo
 * @Date: 2019/3/14 9:31
 * @Author: Mr.Deng
 * @Description:
 */
public class demol0314 {

    //getResult方法
    //public static int getResult(int num){
    //    return num*3+5;
    //}







    public static void main(String[] args) {
        //int x = getResult(4);//getResult方法
        //System.out.println("x="+x);
        //getResult(5);

        /*int sum = getSum(4,6);
        System.out.println("sum="+sum);
        sum = getSum(2,7);
        System.out.println("sum="+sum);*/

        //compare(3,4);

        /*draw(5,6);
        printHr();
        draw(7,9);
        printHr();*/
        //print99();
//        System.out.println(add(4,5));
//        System.out.println(add(4,5,6));

        //元素类型[] 数组名 = new 元素类型[元素个数或数组长度];

        //需求:想定义一个可以存储3个整数的容器。




        int[] x = new int[3];
        x[0] = 59;
        x = null;

        //打印数组中角标为0的元素的值。
        System.out.println(x[0]);


    }








    //当函数运算后,没有具体的返回值时,这是返回值类型用一个特殊的关键字来标识。
    //该关键字时void,void:代表的时函数没有具体返回值的情况。
    //当函数的返回值类型时void时,函数中的return语句可以省略不写。
    /*public static void getResult(int num){
        //System.out.println(num*3+5);
        //return;//当函数的返回值类型时void时,函数中的return语句可以省略不写。
    }*/
    /*
    函数的格式:
        修饰符 返回值类型 函数名(参数类型 形式参数1,参数类型 形式参数2)
        {
            执行语句;
            return返回值;
        }
     返回值类型:函数运行后的结果的数据类型.
     参数类型:是形式参数的数据类型.
     形式参数:是一个变量,用于存储调用函数时传递给函数的实际参数。
     return:用于结束函数。
     返回值:该值会返回给调用者。
     */
    //需要定义功能,完成一个整数的*3+5的运算。


    /*
    如何定义一个函数呢？
    1,既然函数是一个独立的功能,那么该功能的运算结果是什么先明确。
    2,在明确在定义该功能的过程中是否需要未知的内容参与运算
     */
    //需求:定义一个功能,完成3+4的运算,并将结果返回给调用者。
    /*
    1,明确功能的结果:时一个整数的和。
    2,明确函数的参数列表(参数的类型和参数的个数)。
    */

    /*public static int getSum(int x,int y){
        return x+y;
    }*/

    /*
    以上这个函数的功能结果是固定的，毫无扩展性而言。
    为了方便用户需求,由用户来指定加数和被加数。这样,功能才有意义。
    思路:
    1,功能结果时一个和,返回值类型是int。
    2,有未知内容参与运算,有两个。
     */

    /*
    需求:判断两个数是否相同。
    思路:
    1,明确功能的结果:结果是:boolean。
    2,功能是否有未知内容参与运算。
     */
    /*public static boolean compare(int x,int y){
       *//* if (x==y)
            return true;
        else
            return false;*//*
        //return (x==y)?true:false;
        return x==y;
    }*/
    /*
    需求:定义功能,对两个数进行比较获取较大的数。
     */
    /*public static int getMax(int a,int b){
        *//*if (a>b)
            return a;
        else
            return b;*//*
        return (a>b)?a:b;
    }*/

    /*
    定义一个功能,用于打印矩形。
    思路:
    1,确定结果:没有,因为直接打印,所以返回值类型是void。
    2,有未知内容吗？有,两个，因为矩形的列和行不确定
     */
    /*public static void draw(int row,int col){
        for (int x=0;x<row;x++){
            for (int y=0;y<col;y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printHr(){
        System.out.println("-----------------------");
    }*/

    //定义一个打印99乘法表功能的函数。
    /*public static void print99(){
        for (int x=1;x<=9;x++){
            for (int y=1;y<=x;y++){
                System.out.print(y+"*"+x+"="+y*x+"\t");
            }
            System.out.println();
        }
    }*/

    //定义一个加法运算,获取两个整数的和。
    /*public static int add(int x,int y){
        return x+y;
    }
    //定义一个加法运算,获取三个整数的和。
    public static int add(int x,int y,int z){
        return x+y+z;
    }*/


}





