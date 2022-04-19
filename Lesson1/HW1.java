package Lesson1;

public class HW1 {
    public static void main(String[] args) {
        printThreeWords();
        int a = 25;
        int b = 10;
        checkSumSign(a, b);
        printColor();
        compareNumbers();

    }
    //task 2
    public static void printThreeWords() {
        System.out.println ("Orange");
        System.out.println ("Banana");
        System.out.println ("Apple");
    }
    //task3
    static void  checkSumSign(int a, int b) {
        int c = a + b;
        System.out.println(c);

        if (c >= 0) {
            System.out.println("����� �������������");
        } else {
            System.out.println("����� �������������");
        }
    }
    //task 4
    public static void printColor() {
        int value = 67;

        if (value <= 0) {
            System.out.println("�������");
        } else if (value > 0 && value <= 100) {
            System.out.println("������");
        } else {
            System.out.println("�������");
        }
    }
    // task 5
    public static void compareNumbers() {
        int a = 13;
        int b = 17;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
