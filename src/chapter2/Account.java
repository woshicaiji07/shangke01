package chapter2;

import java.util.Scanner;

public class Account {
    private String accNo;
    private String accName;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public String getAccName() {
        return accName;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }



    public Account(){
        this("000","未知",0);
    }

    public Account(String accNo,String accName){
        this(accNo,accName,0);
    }

    public Account(String AccNo,String AccName,double balance){
       this.accNo=AccNo;
       this.accName=AccName;
       this.balance=balance;
    }

    public void deposit(double amount){
        this.balance+=amount;
        System.out.println("您账户有"+amount+"元");
        this.printInfo();
    }

    public void withdraw(double amount){
        if(amount>0&&balance>=amount){
            balance-=amount;
            System.out.println("本次存入"+amount+"元");
            this.printInfo();
        }else{
            System.out.println("余额不足");
        }
    }

    public void printInfo(){
        System.out.println("账户号:"+accNo+"，账户名："+accName+"，余额；"+balance);
    }

    public static void main(String[] args) {
        //实例化3个对象
        Account a1 = new Account();
        Account a2 = new Account("1001","小欢");
        Account a3 = new Account("1002","小小欢",5000);

        System.out.println("====对象1（无参）====");
        a1.printInfo();
        a1.deposit(1000);
        a1.withdraw(200);
        a1.printInfo();

        System.out.println("\n====对象2（两个参数）====");
        a2.printInfo();
        a2.deposit(2000);
        a2.withdraw(500);
        a2.printInfo();

        System.out.println("\n====对象3（三个参数）====");
        a3.printInfo();
        a3.withdraw(1000);
        a3.printInfo();
    }
}