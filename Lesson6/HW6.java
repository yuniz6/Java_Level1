public class HW6 {
    public static void main(String[] args) {
        System.out.println("����:");
        Cat cat1 = new Cat("������");
        cat1.run(200);
        cat1.swim(1);
        System.out.println();

        Cat cat2 = new Cat("����");
        cat2.run(150);
        cat2.swim(0);
        System.out.println();

        Cat cat3 = new Cat("�����");
        cat3.run(455);
        cat3.swim(8);
        System.out.println();

        System.out.println("����:");
        cat1.info();
        cat2.info();
        cat3.info();

        System.out.println();
        Cat.getCount();

        System.out.println("********************");

        System.out.println("������:");
        Dog dog1 = new Dog("�����");
        dog1.run(333);
        dog1.swim(11);
        System.out.println();

        Dog dog2 = new Dog("ϸ�");
        dog2.run(600);
        dog2.swim(3);
        System.out.println();

        System.out.println("����:");
        dog1.info();
        dog2.info();

        System.out.println();
        Dog.getCount();
    }


}
