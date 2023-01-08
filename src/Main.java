public class Main {
    public static void main(String[] args) {
        Person m = new Person("Anna", 25, false) {
        System.out.println(m.ShowPersonInfo());
        }



        Person persons[] = new Person[10];

        persons[0] = new Employee("A", 10, true, 45);
        persons[1] = new Employee("B", 15, false, 50);
        persons[2] = new Person("C", 20, true);
        persons[3] = new Person("D", 25, false);
        persons[4] = new Student("E", 30, true, 4.5);
        persons[5] = new Student("F", 40, false, 5.5);

        for (Person person : persons) {

            if (persons[0] != null) {

                if (persons[0] instanceof Person) {
                    ((Person) persons[0]).ShowPersonInfo();
                }
                if (persons[1] instanceof Employee) {
                    ((Employee) persons[1]).showEmployeeInfo();
                }
                if (persons[4] instanceof Student) {
                    ((Student) persons[4]).showStudentinfo();
                }
            }
        }
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null) {
                if (persons[6] instanceof Employee) {
                    ((Employee) persons[6]).getcalculateOvertime(2);
                }
            }
        }
    }
}
