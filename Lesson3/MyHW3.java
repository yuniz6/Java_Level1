import java.util.Random;

public class MyHW3 {
    public static void main(String[] args) {
        task1();
        System.out.println("-----------------------");
        task2();
        System.out.println("-----------------------");
        task3();
        System.out.println("-----------------------");
        task4();
        System.out.println("-----------------------");
        task5(2,5);
    }


    public static void task1() {
        int[] array = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
                   System.out.print(array[i] + " ");
            }
      }
        System.out.println();
    }

    public static void task2() {
        int[] empty = new int[100];
        for (int i = 0; i < empty.length; i++) {
            empty[i] = i + 1;
            System.out.print(empty[i] + " ");
        }
        System.out.println();
    }

    public static void task3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i< arr.length;i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void task4() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void task5(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }
}
