package HW2;

public class HW2 {
    public static void main(String[] args) {
        System.out.println(task1(17, 3));
        System.out.println("----------------------");
        task2(23);
        System.out.println("----------------------");
        System.out.println(task3(-13));
        System.out.println("----------------------");
        task4("TEST",3);
    }

  public static boolean task1(int a, int b) {
        return ((a + b) >= 10 && (a + b) <= 20);
    }

    public static void task2(int c) {
        if (c >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public static boolean task3(int d) {
        return (d <= 0);
    }

    public static void task4(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(str);
        }
    }

}
