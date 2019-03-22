/**
 * @program: Demo
 * @Date: 2019/3/19 10:49
 * @Author: Mr.Ran
 * @Description:
 */

/*
二维数组
 */
public class Demo0319b {
    public static void main(String[] args) {
//        int[] arr = new int[3];//一维数组

//        int[][] arr = new int[3][4];//定义了一个名称为arr的二维数组。二维数组中有3个一维数组。
                                    //每个一维数组中有四个元素。
        /*int[][] arr = new int[3][];//定义一个二维数组，里边有三个一维数组，其中的值未定义，所以查询结果为null。
        arr[0] = new int[3];//手动添加数组的元素
        arr[1] = new int[1];
        arr[2] = new int[2];
        System.out.println(arr.length);//打印二维数组的长度：3
        System.out.println(arr[0].length);//打印二维数组中第一个一维数组的长度。*/

        int[][] arr = {{3,5,1,7},{2,3,5,8},{6,1,8,2}};
        int sum = 0;

        for (int x=0;x<arr.length;x++){
            for (int y=0;y<arr[x].length;y++){
                sum = sum + arr[x][y];
            }
        }
        System.out.println("sum="+sum);



    }


}
