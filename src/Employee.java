public class Employee extends Person {
    double daySalary;

    public Employee(String name, int age, boolean isMan, double daySalary) {
        super(name, age, isMan);
        this.setDaySalary(daySalary);
    }

    void setDaySalary(double daySalary) {
        if (daySalary < 0) {
            throw new IllegalArgumentException("Day salary cannot be negative.");
        }
        this.daySalary = daySalary;
    }

    public double getcalculateOvertime(double hours) {
        if (super.age > 18) {
            double moneyPerHour = daySalary / 8;
            return hours*(moneyPerHour*1.5);
        }
        return daySalary;
    }



    public void showEmployeeInfo() {

        System.out.println(super.getName() + super.getAge() + isMan + this.daySalary);
    }
}

