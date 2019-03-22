import java.util.Arrays;

/**
 * @program: Demo
 * @Date: 2019/3/18 10:00
 * @Author: Mr.Ran
 * @Description:
 */
/*
对给定数组进行排序
{5,1,6,4,2,8,9}
 */
public class Demo0318 {


    public static void main(String[] args) {
        int[] arr = {5,1,6,4,2,8,9};
        //在排序前打印
        printArray(arr);
        //排序
        //selectSort(arr);
        //冒泡
        //bubbleSort(arr);
        //真实开发常用，但面试不用。一般让写冒泡和排序。哈希排序是效率最高，时间最短的。
        Arrays.sort(arr);//java中已经定义好的一种排序方式。开发中对数组排序要使用该种代码。
        //排序后
        printArray(arr);

    }


    //输出格式设置
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int x=0;x<arr.length;x++){
            if (x!=arr.length-1)
                System.out.print(arr[x]+",");
            else
                System.out.println(arr[x]+"]");
        }
    }


    /*
    选择排序
    内循环结束一次，最值出现在头角标位置上。
     */
    public static void selectSort(int[] arr) {
        for (int x=0;x<arr.length-1;x++){//因为当其他5个数的位置确定以后，最后一个数的位置就自动确定了，所以只需要循环到arr.length-1。
            for (int y=x+1;y<arr.length;y++){//因为是两个数比较，所以是两个未知数x,y。
                if (arr[x]>arr[y]){
//                    int temp = arr[x];
//                    arr[x] = arr[y];
//                    arr[y] = temp;
                    swap(arr,x,y);
                }
            }
        }
    }


    /*
    冒泡排序:相邻的两个元素进行比较,如果符合条件换位。
     */
    public static void bubbleSort(int[] arr){
        for (int x=0;x<arr.length-1;x++){
            for (int y=0;y<arr.length-x-1;y++){//-x:让每一次比较少的元素减少。-1：避免角标越界。
                if (arr[y]>arr[y+1]) {
//                    int temp = arr[y];
//                    arr[y] = arr[y+1];
//                    arr[y+1] = temp;
                    swap(arr,y,y+1);
                }
            }
        }
    }


    /*
    发现无论什么排序，都需要对满足条件的元素进行置换。
    所以可以把这部分相同的代码提取出来，单独封装一个函数。
     */
    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
