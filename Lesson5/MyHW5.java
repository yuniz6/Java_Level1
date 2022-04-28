public class MyHW5 {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Петров М.В.", "java Developer", "jd@y.ru", 1234567, 90000, 43);
        employeeArray[1] = new Employee("Сидоров А.Н.", "QA automation", "qaa@y.ru", 464583747, 60000, 42);
        employeeArray[2] = new Employee("Иванов А.К.", "QA Lead", "qal@y.ru", 4389734, 70000, 39);
        employeeArray[3] = new Employee("Кузьмин Н.В.", "Java Developer", "jd2@y.ru", 9897667, 50000, 32);
        employeeArray[4] = new Employee("Чирков С.М.", "QA engineer", "qae@y.ru", 787657, 50000, 33);

        System.out.println();
        System.out.println("Сотрудники старше 40 лет");
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getAge() > 40) {
                employeeArray[i].info();
            }
        }
    }
}
