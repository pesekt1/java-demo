package demo;

public class Person {
    private int salary;
    private String name;
    private String address;
    private String phoneNumber;

    public Person(String name, String address, String phoneNumber, int salary) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public double calculate_tax() {
        return salary * 0.4;
    }
}
