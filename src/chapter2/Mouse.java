package chapter2;

public class Mouse {
        private String name;
        private boolean alive;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        alive = true;
    }

    public void setAlive(boolean alive){
        this.alive = alive;
    }

    public void printflo(){
        if(alive)
            System.out.println(name+"还活着");
        else
            System.out.println(name+"鼠生已剧终");
    }

    public void squeak(){
        System.out.println(name + "吱吱叫");
    }

    public void stealFood(){
        System.out.println(name + "偷吃鱼");
    }

    public static void main(String[] args) {
        Mouse p1 = new Mouse();
        Mouse p2 = new Mouse();
        p2.setName("jerry");
        p1.setName("jerry");
        p1.stealFood();
        p2.stealFood();
        p2.squeak();
        p1.squeak();
        p2.printflo();
        p1.printflo();
    }
}
