package Lesson06.online.models;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 25.04.2022
 */

public abstract class Hero {

    protected String name;
    protected int health;
    protected int attackPower;
    protected int speed;

    public Hero(String name, int health, int attackPower, int speed) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.speed = speed;
    }

    public Hero(String name) {
        this.name = name;
    }

    public Hero(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void speak() {
        System.out.println(name + " says hello");
//        System.out.println(name + " says hello");
    }

    public void run() {
        System.out.println(name + " run with speed " + speed);
    }

    public void sleep() {
        System.out.println("sleep");
    }

    public void attack() {
        System.out.println(name + " give damage " + attackPower + " points");
    }

    public abstract void getDamage(int incomingValue);

}
