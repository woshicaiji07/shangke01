package chapter2;

import java.util.Scanner;

public class zuoye2 {
   static   String[] terms = new String[]{"立春","雨水","惊蛰","春分","清明","谷雨","立夏","小满","芒种","夏至","小暑","大暑","立秋","处暑","白露","秋分","寒露","霜降","立冬","小雪","大雪","冬至","小寒","大寒"};
     public static void printTerms(){
         for(int i = 0;i< terms.length;i++){
             System.out.print(terms[i] + " ");
         }
            System.out.println();
        }
        public static void searchTerms(int num){
     int index = num - 1;
     if(index>=0 && index < terms.length){
         System.out.println("节气名称是：" + terms[index]);
     }else{
         System.out.println("该编号超出范围！");
        }
        }
        public static void main(String[] args){
     printTerms();
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入要查询的节气索引(1~24): ");
            int n = sc.nextInt();
            searchTerms(n);
            sc.close();
    }}
