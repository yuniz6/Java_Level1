package Lesson01.online;

//one line comment

/*
multi
line
comment
 */

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 07.04.2022
 */

public class FirstClass {

    public static int calculate3(int value1, int value2) {
        System.out.println("This is operation from calc3 > " + (value1 +value2));
        return value1 + value2; //40
    }

    public static void main(String[] args) {
//        System.out.print("Hello world 1!");
//        System.out.println("Hello world 2!");

//        //целые числа
//        byte myByte = 16; //1 byte <-128 .. +127>
//        short myShort = 160; //2 bytes <-32768 .. +32767>
//        int myInteger = 5678901; //4 bytes <-2.1mlrd .. + 2.1mlrd> DEFAULT
//        long myLong = 3000000000L; //8 bytes <-2^63 .. + 2^63>
//
//        //дробные (числа с запятой)
//        float myFloat = 15.436f; //4 bytes <>.00000000
//        double myDouble = 15.436; //8 bytes <>.0000000000000000 DEFAULT
//
//        //символы
//        char myChar = 'j'; // 2 bytes //ASCII...UTF
//
//        //logic
//        boolean myBooleanTrue = true; //2 bytes
//        boolean myBooleanFalse = false;
//
//        String myString = "qwerty";

//        System.out.println(myBooleanTrue);
//
//        //Math operations + - / * ^
//        System.out.println(myByte + myShort);

//        int a = 10;
//        int b = 3;
//        float c = a / b;
//        System.out.println(c);

//        char a1 = 'h';
//        char a2 = 'i';
//        System.out.println(a1 + "" + a2);
//        System.out.println("hi" + " world"); //конкатенация
//        System.out.println("result: " + 4 + 6);
//        System.out.println("result: " + (4 + 6) + myBooleanFalse + myBooleanTrue);

        //10+6 > 35 - YES, NO
//        if ((10 + 6) > 35) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//
//        int a2 = 1;
//        int b2 = 3;
//        if ((a2 + b2) < 10) {
//            System.out.println("HELLO");
//        }

//        int abc = 100;
//        if (abc > 200) {
//            System.out.println("ABC > 200");
//        } else if (abc == 150) {
//            System.out.println("ABC = 150");
//        } else if (abc < 110) {
//            System.out.println("ABC < 110");
//        } else {
//            System.out.println("Something wrong!");
//        }

//        System.out.println("End program");
//        taskEveryDay();
//        welcomeUser();

        calculate2(12, 9);
        calculate1(6.5f, 3.5f);
        welcomeUser("Alex");
        welcomeUser("Olga");

        int result = calculate3(15, 25);
        System.out.println("Result > " + result);

        int result2 = calculate3(15, 25) + 150;

        System.out.println("Result > " + calculate3(15, 25));

        System.out.println(enterLogin("MyBigJavaLogin"));

    }

    public static void taskEveryDay() {
        System.out.println("Drink coffee");
        System.out.println("go to work");
        System.out.println("working ...");
        System.out.println("go to home");
        System.out.println("sleep");
    }

    public static void calculate1(float value1, float value2) {
        System.out.println(value1 + value2);
    }

    public static void calculate2(int value1, int value2) {
        System.out.println(value1 + value2);
    }

    public static void welcomeUser(String name) {
        System.out.println("Hello " + name);
    }

    public static String enterLogin(String inputValue) {
        return "Your login is " + inputValue;
    }


}
