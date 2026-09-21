package heima.test.way;
import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组的长度：");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
       int max =  maxArr(arr);
        System.out.println("最大值为：" + max);
    }
   public static int maxArr(int[] arr){
       int max = arr[0];
       for (int i = 0; i <arr.length ; i++) {
           if (arr[i] > max) {
               max = arr[i];
           }
       }
           return max;
       }
}
