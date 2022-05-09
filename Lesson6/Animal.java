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
        if (this.maxRun >= dist) System.out.println(this.name + " �������� " + dist + " �");
        else System.out.println(this.name + " �� ����� ������ ��� ������");
    }

    public void swim(int dist) {
        if (this.maxSwim >= dist) System.out.println(this.name + " ������� " + dist + " �");
        else System.out.println(this.name + " �� ����� ����� ��� ������");
    }

    public void info() {
        System.out.println(this.type + " " + this.name + " ��������: " + maxRun + " � | �������: " + maxSwim + " �");
    }
}
