package chapter2;

import java.util.concurrent.Callable;

public class CatTest {
    private String name;
    String food;

    //get方法
    public String getName(){
        return name;
    }

    //set方法
    public void setName(String name){
        this.name = name;
    }

    void printlnfo(){
        System.out.println("大家好，我是" + name);
    }
    void mnew(){
        System.out.println(name + "在喵喵喵");
    }
    void eat(String food){
        System.out.println(name + "在吃" + food);
    }
    void catchMouse(Mouse m1 ){
        System.out.println(this.name +"抓住了"+ m1.getName());
        mnew();
        m1.squeak();
        m1.setAlive(false);
    }

    public static void main(String[] args) {
        CatTest p1 = new CatTest();
        CatTest p2 = new CatTest();
        p1.setName("Tom");
        p2.setName("Kitty");
        p1.printlnfo();
        p2.printlnfo();
        p1.eat("鳕鱼汉堡");
        p2.mnew();
    }
}
