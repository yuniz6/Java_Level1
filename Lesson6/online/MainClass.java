package Lesson06.online;

import Lesson06.online.models.Hero;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 25.04.2022
 */

public class MainClass {

    public static void main(String[] args) {
        Warrior warrior = new Warrior("Warrior", 100, 20, 10, 5.5f);
        Archer archer = new Archer("Archer", 70, 30, 15, 2.5f);
        Titan titan = new Titan("Titan", 700, 300, 150, 210.5f);

        Hero[] army = {warrior, archer, titan};

        for (int i = 0; i < army.length; i++) {
            army[i].speak();
            army[i].attack();

            if (army[i] instanceof Archer) {
                Archer tmp = (Archer) army[i];
                tmp.escape();
            }
        }

//        warrior.speak();
//        warrior.run();
//        warrior.attack();
//        warrior.getDamage(35);
//
//        archer.speak();
//        archer.attack();
//        archer.getDamage(150);
//        archer.escape();
//
//        titan.attack();
//        titan.speak();
//        titan.sleep();

    }
}
