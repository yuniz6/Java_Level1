package Lesson06.online;

import Lesson06.online.models.Hero;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 25.04.2022
 */

public class Archer extends Hero {

    private float agility;

    public Archer(String name, int health, int attackPower, int speed, float agility) {
        super(name, health, attackPower, speed);
        this.agility = agility;
    }

    public void escape() {
        if (health < 80) {
            System.out.println(name + " will escape battle");
        }
    }

    @Override
    public void run() {
        System.out.println(name + " run with speed " + speed);
    }

    @Override
    public void getDamage(int incoming) {
        float realDamage= incoming / agility;
        health -= realDamage;
        System.out.println(name + " get damage " + realDamage + " points. My HP = " + health);
    }
}
