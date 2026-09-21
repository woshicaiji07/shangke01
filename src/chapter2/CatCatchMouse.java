package chapter2;

public class CatCatchMouse {
    public static void main(String[] args) {
        CatTest p1 = new CatTest();
        p1.setName("Tom");
        Mouse p3 = new Mouse();
        Mouse p2 = new Mouse();
        p3.setName("mandy");
        p2.setName("jerry");
        p2.stealFood();
        p1.catchMouse(p2);
        p2.printflo();
        p3.printflo();
    }
}
