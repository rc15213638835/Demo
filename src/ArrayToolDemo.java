/**
 * @program: Demo
 * @Date: 2019/3/22 16:54
 * @Author: Mr.Ran
 * @Description:
 */
public class ArrayToolDemo {
    public static void main(String[] args) {
        int [] arr ={3,1,87,32,8};
//        ArrayTool tool = new ArrayTool();

        int max = ArrayTool.getMax(arr);
        System.out.println("max="+max);

        int min = ArrayTool.getMin(arr);
        System.out.println("min="+min);


        /*ArrayTool tool = new ArrayTool();

        int max = tool.getMax(arr);
        System.out.println("max="+max);

        int min = tool.getMin(arr);
        System.out.println("min="+min);
        tool.printArray(arr);
        tool.selectSort(arr);
        tool.printArray(arr);

        int[] arr1 = {};
        ArrayTool tool1 = new ArrayTool();*/
    }
}
