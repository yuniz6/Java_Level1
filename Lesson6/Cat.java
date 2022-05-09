public class Cat extends Animal {

    private static int count;

    public Cat(String name) {
        super(name);
        this.type = "Кот";
        this.maxRun = 200;
        count++;
    }

    public static void getCount() {
        System.out.println("Количество котов: " + count);
    }

    @Override
    public void swim(int dist) {
        System.out.println("Коты не плавают!");
    }
}
