public class Dog extends Animal {
    private static int count;

    public Dog(String name) {
        super(name);
        this.type = "Собака";
        this.maxRun = 500;
        this.maxSwim = 10;
        count++;
    }

    public static void getCount() {
        System.out.println("Количество собак: " + count);
    }
}
