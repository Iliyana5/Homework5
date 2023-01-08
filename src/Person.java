
public class Person {
    String name;
    int age;
    boolean isMan;

    public Person(String name, int age, boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isMan() {
        return isMan;
    }

    public String toString() {
        return getName() + " " + getAge() + "" + isMan();
    }

    Object ShowPersonInfo() {
        System.out.printf("Name: %s%n" +
                "Age: %d%n", this.name, this.age);
        if (isMan) {
            System.out.println("isMan: male");
        } else {
            System.out.println("isMan: female");
        }
        return null;
    }}





















