/**
 * @program: Demo
 * @Date: 2019/3/13 9:48
 * @Author: Mr.Deng
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        //定义变量的格式
        //数据类型  变量名 = 变量值
        /*
        int a = 5;
        System.out.println(a);
        a = 10;
        System.out.println(a);

        //演示其他数据类型

        byte b = 2;//-128-127
        System.out.println(b);

        short s = 30000;
        System.out.println(s);

        char ch1 = 'a';
        System.out.println(ch1);

        boolean c = true;
        System.out.println(c);
        boolean c1 = false;
        System.out.println(c1);
        */
        /*

        */
        //类型转换
        /*byte b = 3;
        b = (byte) (b+2);
        System.out.println(b);*/

        //System.out.println((char)98);

        //算术运算
        /*
        int x = 4270;
        x = x/1000*1000;
        System.out.println(x);
        */
        //System.out.println(5%-1);
        /*
        int a = 3,b,b1;
        //-->a = a+1;

        b = a++;//a先赋值给b，然后再自增加一
        b1 = ++a;//a先自增加一，然后再赋值给b
        System.out.println(b1);
        System.out.println(b);
        System.out.println(a);
        */
        //字符串数据和任何数据使用+都是相连接，最终都会变成字符串
        //System.out.println("5+5"+(5+5));//5+5=55;

        //转义字符
        /*System.out.print("hello\nworld");
        System.out.println("hello java");*/

        //赋值运算
        /*int x = 3;
        //*= -= /= %=
        x+=4;//x = x + 4;
        short s =4;
        //s = s + 5;
        s+=5;
        System.out.println(x);
        System.out.println(s);*/

        //System.out.println(3>4);//比较运算的结果都是Boolean类型不是true，就是false；

        //逻辑运算符
        //int x = 4;
        //逻辑连接Boolean类型的表达式
        //x>3 & x<6 = true & true = true;
        /*
        true & true = true;
        true & false =false;
        false & true =false;
        false & false =false;
        &:只要两边的Boolean表达式结果，有一个为false，那么结果就为false；
          只要两边都为true，结果为true。
         */

        /*
        true | true = true;
        true | false = true;
        false | true = true;
        false | false = false;
        */
        /*
        ^:异或 和|有点不一样，当两边都是true，结果为false
         */
        //System.out.println(true^true);
        //int a = 4;

        //System.out.println(a>3 & a<6);
        //&和&&的特点
        /*
        &：无论左边是true是false，右边都运算
        &&：当左边为false时，右边不运算。
        */
        /*
        |:两边都参与运算
        ||：当左边为true，右边不运算
         */

        /*
        int x = 3,y;
        y = (x>1)?100:200;
        System.out.println("y="+y);
        */

        /*
        int x = 3;
        if(x>1){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        */
       /* int num = 1;
        if(num==1)
            System.out.println("monday");
        else if(num==2)
            System.out.println("tsd");
        else
            System.out.println("nono");
        //需求2：根据用于指定月份，打印该月份所属的季节
        //3，4，5春季6，7，8夏季9，10，11秋季12，1，2冬季
        int x = 4;

        if (x==3 || x==4 || x==5)
            System.out.println(x+"春季");
        else if (x==6 || x==7 || x==8)
            System.out.println(x+"夏季");
        else if (x==9 || x==10 || x==11)
            System.out.println(x+"秋季");
        else if (x==12 || x==1 || x==2)
            System.out.println(x+"冬季");
        else
            System.out.println(x+"该季节不存在");
        */
       //switch语句
       /*
       int x = 2;
       switch (x){
           case 4:
               System.out.println("a");
               break;
           case 6:
               System.out.println("b");
               break;
           case 2:
               System.out.println("c");
               break;
           default:
                   System.out.println("d");
       }
       */
       /*
       定义初始化表达式
       while(条件表达式)
       ｛
        循环体（执行语句）；
       ｝
        */
      /*
       int x = 1;
       while (x<3){
           System.out.println("x="+x);
            x++;

       }
       */
      /*
      int x = 1;
             do {
          System.out.println("do : x="+x);
          x++;
      }
      while (x<3);

      int y = 1;
      while (y<0){
          System.out.println("y="+y);
          y++;
      }
      */
      /*
      while:先判断条件，只有条件满足才执行循环体。
      do while:先执行循环体，再判断条件，条件满足，再执行循环体。
      简单一句话:do while:无论条件是否满足，循环体至少执行一次。
       */

      /*
      for循环

      for(初始化表达式:循环条件表达式:循环后的操作表达式){
        执行语句;
      }
       */
      /*
      for (int x =0;x<3;x++){
        System.out.println("x="+x);
      }
      */
      /*int sum = 0;
      for(int a = 1;a<=10;a++){
          sum +=a;
      }
        System.out.println("sum="+sum);*/

      //练习
        /*
        for (int x=0;x<5;x++){
            for (int y=x;y<5;y++){
                System.out.print("-");
            }
            for (int z=0 ;z<=x;z++){
                System.out.print("* ");
            }
            System.out.println();
        }
        */
        /*
        修饰符 返回值类型 函数名（参数类型 形式参数1，参数类型 形式参数2）{
            执行语句;
            return 返回值;
        }
        */

    }

}
