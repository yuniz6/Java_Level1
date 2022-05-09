package Lesson06.online;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 25.04.2022
 */

public class Titan extends Warrior {

    public Titan(String name, int health, int attackPower, int speed, float defence) {
        super(name, health, attackPower, speed, defence);
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("Go attack");
    }

}
