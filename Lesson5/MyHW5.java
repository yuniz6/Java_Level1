public class MyHW5 {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("������ �.�.", "java Developer", "jd@y.ru", 1234567, 90000, 43);
        employeeArray[1] = new Employee("������� �.�.", "QA automation", "qaa@y.ru", 464583747, 60000, 42);
        employeeArray[2] = new Employee("������ �.�.", "QA Lead", "qal@y.ru", 4389734, 70000, 39);
        employeeArray[3] = new Employee("������� �.�.", "Java Developer", "jd2@y.ru", 9897667, 50000, 32);
        employeeArray[4] = new Employee("������ �.�.", "QA engineer", "qae@y.ru", 787657, 50000, 33);

        System.out.println();
        System.out.println("���������� ������ 40 ���");
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getAge() > 40) {
                employeeArray[i].info();
            }
        }
    }
}
