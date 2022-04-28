public class Employee {

        public String fullName;
        public String position;
        public String email;
        public int phoneNumber;
        public int salary;
        public int age;

        public int getAge() {
            return age;
        }

    public Employee(String fullName, String position, String email, int phoneNumber, int salary, int age){
            this.fullName = fullName;
            this.position = position;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.salary = salary;
            this.age = age;
            info();
        }

        public void info () {
            System.out.println("ФИО: " + fullName + " | " + "Должность: " + position + " | " + "email: " + email + " | " + "Телефон: " + phoneNumber + " | " + "ЗП: " + salary + " | " + "Возраст: " + age);
        }
    }

