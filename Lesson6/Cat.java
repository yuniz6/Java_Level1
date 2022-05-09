public class Cat extends Animal {

    private static int count;

    public Cat(String name) {
        super(name);
        this.type = "���";
        this.maxRun = 200;
        count++;
    }

    public static void getCount() {
        System.out.println("���������� �����: " + count);
    }

    @Override
    public void swim(int dist) {
        System.out.println("���� �� �������!");
    }
}
