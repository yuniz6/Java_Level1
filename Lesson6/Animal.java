import java.util.Random;

public class Animal {
    protected String name;
    protected String type;
    protected int maxRun;
    protected int maxSwim;

    public Animal(String name) {
        this.name = name;
    }

    public void run(int dist) {
        if (this.maxRun >= dist) System.out.println(this.name + " пробежал " + dist + " м");
        else System.out.println(this.name + " не может бежать так далеко");
    }

    public void swim(int dist) {
        if (this.maxSwim >= dist) System.out.println(this.name + " проплыл " + dist + " м");
        else System.out.println(this.name + " не может плыть так далеко");
    }

    public void info() {
        System.out.println(this.type + " " + this.name + " пробежал: " + maxRun + " м | Проплыл: " + maxSwim + " м");
    }
}
