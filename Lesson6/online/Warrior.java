package Lesson06.online;

import Lesson06.online.models.Hero;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 25.04.2022
 */

public class Warrior extends Hero {

    private float defence;

    public Warrior(String name, int health, int attackPower, int speed, float defence) {
        super(name, health, attackPower, speed);
        this.defence = defence;
    }

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void getDamage(int incomingDamage) {
        health -= incomingDamage;
        System.out.println(name + " get damage " + incomingDamage + " point. My HP is " + health);
    }
}
