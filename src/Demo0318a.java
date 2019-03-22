/**
 * @program: Demo
 * @Date: 2019/3/18 11:09
 * @Author: Mr.Ran
 * @Description:
 */

/*
数组的查找操作。
 */

/*
练习:有一个有序的数组,想要将一个元素插入到该数组中。
还要保证该数组是有序的。如何获取该元素在数组中的位置。
 */
public class Demo0318a {
    public static void main(String[] args) {
        //int[] arr = {3,1,5,4,2,9};//定义一个数组，静态的。
        //int index = getIndex(arr,1);//获取getIndex方法。
        //System.out.println("index="+index);//输出。


//        int[] arr = {1,3,4,6,8,9};
//        int index = halfSearch(arr,320);//获取halfSearch方法
//        System.out.println("index="+index);

//        int[] arr = {1,3,4,6,8,9};//7
//        int index = halfSearch_2(arr,1);//获取halfSearch方法
//        System.out.println("index="+index);

//        int[] arr = {1,3,4,6,8,9};//7
//        int index = getIndex_2(arr,7);//获取getIndex_2方法
//        System.out.println("index="+index);

//        toBin(6);
//        System.out.println(Integer.toBinaryString(60));
//        toHex(60);
//        toHex1(60);
//        toHex1(60);
        toBin(15);
    }


    /*
    练习
     */
    public static int getIndex_2(int[] arr,int key){
        int min = 0,max = arr.length-1,mid;

        while(min<=max){
            mid = (max+min)>>1;

            if (key>arr[mid])
                min = mid + 1;
            else if (key<arr[mid])
                max = mid - 1;
            else
                return mid;
        }
        return min;
    }


    /*
    折半查找。提高效率，但是必须要保证该数组是有序的数组。
     */
    public static int halfSearch(int[] arr,int key){
        int min,max,mid;
        min = 0;
        max = arr.length;
        mid = (min+max)/2;

        while (arr[mid]!=key){
            if (key>arr[mid])
                min = mid + 1;
            else if (key<arr[mid]);
                max = mid - 1;
                if (min>max)
                    return -1;
                mid = (max+min)/2;
        }
        return mid;
    }

    /*
    折半的第二种方式
     */
    public static int halfSearch_2(int[] arr,int key){
        int min = 0,max = arr.length-1,mid;

        while(min<=max){
            mid = (max+min)>>1;

            if (key>arr[mid])
                max = mid - 1;
            else if (key<arr[mid])
                max = mid - 1;
            else
                return mid;
        }
        return -1;
    }


    //定义功能,获取key第一次出现在数组中的位置，如果返回是-1，那么代表该key在数组中不存在。
    public static int getIndex(int[] arr,int key){
        for (int x=0;x<arr.length;x++){
            if (arr[x]==key)
                return x;
        }
        return -1;
    }


    /*
    十进制-->二进制
     */
   /* public static void toBin(int num){
        //创建字符串缓冲区对象
        StringBuffer sb = new StringBuffer();//能添加数据的容器
        while(num>0){
            //System.out.print(num%2);
            sb.append(num%2);
            num = num / 2;
        }
        System.out.println(sb.reverse());//reverse具有翻转功能:011-->110
    }*/

    /*
    十进制-->十六进制
     */
    public static void toHex(int num){
        //创建字符串缓冲区对象
        StringBuffer sb = new StringBuffer();//能添加数据的容器
        for (int x=0;x<8;x++){
            int temp = num & 15;
            if (temp>9)
                //System.out.println((char)(temp-10+'A'));
                sb.append((char)(temp-10+'A'));
            else
                //System.out.print(temp);
                sb.append(temp);

            num = num>>>4;
        }
        System.out.println(sb.reverse());//reverse具有翻转功能:011-->110
    }

    /*
     0 1 2 3 4 5 6 7 8 9  A  B   C   D   E   F 十六进制中的元素
     0 1 2 3 4 5 6 7 8 9 10  11  12  13  14  15
     查表法:将所有的元素临时存储起来。建立对应关系。
     每一次&15后的值作为索引去查建立好的表。就可以找到对应元素。
     这样比-10+'a'简单的多。

     这个表这么建立呢？
     可以通过数据的形式来定义
     发现终于出结果了，但是是反着的，想要正过来就用StringBuffer sb = new StringBuffer();功能来完成
     但是这个工具还没有学校

     所以可以使用已经学过的容器:数组来完成。
     */

    public static void toHex1(int num){
        //StringBuffer sb = new StringBuffer();
        //将其实现存储到数组里，然后从数组中获取。
        char[] chs = {'0','1','2','3'
                     ,'4','5','6','7'
                     ,'8','9','A','B'
                     ,'C','D','E','F',};
        //定义一个临时容器。
        char[] arr = new char[8];
        int pos = arr.length;

        while (num!=0){
           int temp = num & 15;
            //System.out.print(chs[temp]);
            //sb.append(chs[temp]);
            arr[--pos] = chs[temp];

            num = num >>> 4;
        }
        System.out.println("pos="+pos);
        //System.out.println(sb.reverse());
        //存储数据的arr数组遍历一下。
        for (int x=pos;x<arr.length;x++){
            System.out.print(arr[x]+",");
        }
    }

    public static void toBin(int num){
        //定义二进制的表。
        char[] chs = {'0','1'};

        //定义一个临时容器
        char[] arr = new char[32];

        //定义一个操作数组的指针
        int pos = arr.length;

        while (num!=0){
            int temp = num & 1;
            arr[--pos] = chs[temp];
            num = num>>>1;
        }
        for (int x=0;x<arr.length;x++){
            System.out.print(arr[x]);
        }
    }


}
