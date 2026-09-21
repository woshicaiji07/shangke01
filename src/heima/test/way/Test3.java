package heima.test.way;

import java.util.Scanner;


public class Test3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int []arr = {11,22,33,44,55,66};
    int m = sc.nextInt();
        System.out.println("请输入一个数字：" + m);
    boolean exit = t3(arr,m);
        if(exit){
            System.out.println("存在这个数");
        }else{
            System.out.println("不存在这个数");
        }
    }
    public static boolean t3(int[] arr,int n){
        for (int i = 0; i <arr.length ; i++) {
            if (n == arr[i]) {
                return true;
            }
        }
        return false;
    }
}
