/**
 * @program: Demo
 * @Date: 2019/3/22 16:32
 * @Author: Mr.Ran
 * @Description:
 */
/*
??????

????????????????
?????????????????
????

????????ArrayTool??????????????????
??????
1??????????????ArrayTool???????????
2????????????????ArrayTool?????????

?????????????????????
???ArrayTool????????static?????????????

????????????????????????????????
??????????????????
???????????????


 */

/*
?????Arraytool.class?????????????????????classpath???????????????
???????????????????????????

???????????java??????????????

*/
/**
????????????????????????????????????
@author ??
@version v1.1
 */


public class ArrayTool{
    /**
     * ????????
     */
    private ArrayTool(){}//????????

    /**
    ??????????????
    @param arr ????int??????
    @return??????????????
     */
    public static int getMax(int[] arr){
        int max = 0;
        for (int x=1;x<arr.length;x++){
            if (arr[x]>arr[max])
                max = x;
        }
        return arr[max];
    }

    /**
     ??????????????
     @param arr ????int??????
     @return ??????????????
     */
    public static int getMin(int[] arr){
        int min = 0;
        for (int x=1;x<arr.length;x++){
            if (arr[x]<arr[min])
                min = x;
        }
        return arr[min];
    }

    /**
     * ?int?????????
     * @param arr ????int??????
     */
    public static void selectSort(int[] arr){
        for (int x=0;x<arr.length-1;x++){
            for (int y=x+1;y<arr.length;y++){
                if (arr[x]>arr[y]){
                    swap(arr,x,y);
                }
            }
        }
    }

    /**
     * ?int?????????
     * @param arr ????int??????
     */
    public static void bubbleSort(int[] arr){
        for (int x=0;x<arr.length-1;x++){
            for (int y=0;y<arr.length-x-1;y++){
                if (arr[x]>arr[y+1]){
                    swap(arr,y,y+1);
                }
            }
        }
    }

    /**
     * ???????????????
     * @param arr ????int??????
     * @param a ???????
     * @param b ???????
     */
    private static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    /**
     * ?????????????????[element1,element2,...]
     * @param arr ????int??????
     */
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int x=0;x<arr.length;x++){
            if (x!=arr.length-1)
                System.out.print(arr[x]+",");
            else
                System.out.print(arr[x]+"]");
        }
    }
}


/*
???????????????????
???????????????????
??????public??????????????public????
??????public????????????????public???

???????????????????????
 */


















/*class Demo0322c {
    public static void main(String[] args) {
        int[] arr = {3,4,1,8};


        int max = getMax(arr);
        System.out.println("max="+arr[max]);
    }

    public static int getMax(int[] arr){

        int max = 0;
        for (int x=1;x<arr.length;x++){
            if (arr[x]>arr[max])
                max = x;
        }
        return arr[max];

    }

    class Test{
        public  int getMax(int[] arr) {
            int max = 0;
            for (int x=1;x<arr.length;x++){
                if (arr[x]>arr[max])
                    max = x;
            }
            return arr[max];
        }

    }
}*/
