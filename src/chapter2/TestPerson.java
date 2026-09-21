package chapter2;

public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("张三",18);
        Person p2 = new Person("李四",20);
        p1.tell();
        p2.tell();
        p1.setName("张三丰");
        p1.setAge(18);
        System.out.println("欢迎您." + p1.getName() + "您今年" + p1.getAge());
    }
}
