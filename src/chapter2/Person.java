package chapter2;
//定义Person类
public class Person {
    private String name;
    private int age;

    //getter方法
    public String getName(){
        return name;
    }
    //setter方法
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public Person(){
        this("宝宝",0);
    }

    public Person(String name){
        this.name= name;
    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void tell(){//this 隐含的对象//
        System.out.println("姓名：" + name + "，年龄：" + age);
    }

    public static void main(String[] args) {
        //实例化对象
        Person p1 = new Person("张三",18);
        Person p2 = new Person("李四",20);
        Person p3 = new Person("狗蛋");
        p1.tell();
        p2.tell();
        p3.tell();
    }
}
