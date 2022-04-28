package Lesson05.test;

import Lesson05.Door;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 21.04.2022
 */

public class Car {

    public static String voice = "beeeep";

    private String brand; //поля класса
    private String color;
    private String number;
    private int power;
    private float maxSpeed;
    private float acceleration;
    private int fuel;

    private Wheel wheel;
    private Door door;

    public Car() {
        brand = "Honda";
        color = "Red";
        maxSpeed = 250.0f;
        wheel = new Wheel();
        door = new Door();
//        giveSignal();
//        drive();
//        System.out.println("construct complete");
    }

    public Car(String msg) {
        System.out.println(msg);
        giveSignalStatic();
    }

    public Car(String brand, String color, float maxSpeed) {
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public class Wheel {
        int radius;
        String color;
        String season;

        public Wheel() {
//            System.out.println("This is construct from Wheels");
        }
    }

    private int getWheelRadius() {
        return wheel.radius;
    }

    void giveSignal() {
        System.out.println(brand + " beep-beep");
        drive();
    }

    public static void giveSignalStatic() {
        System.out.println(" beep-beep");
    }

    void drive() {
        System.out.println(brand + " move with speed " + maxSpeed);
    }

    void refueling(int count) {
        fuel = fuel + count;
        System.out.println("Refuel on " + count + " fuel. " + brand + " has fuel is " + fuel);
    }

//    void repaint(String newColor) {
//        color = newColor;
//    }

}
