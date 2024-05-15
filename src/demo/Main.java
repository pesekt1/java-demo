package demo;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        int sum = MyMath.add(1, 2);
        System.out.println(sum);

        MyMath math1 = new MyMath();
        MyMath math2 = new MyMath();
        MyMath math3 = new MyMath();

        System.out.println(MyMath.count);
        System.out.println(math1.count);
        System.out.println(math2.count);
        System.out.println(math3.count);



        Person person = new Person("John", "1234", "123456789", 1000);
        System.out.println(person.calculate_tax());

        ArrayList<Customer> customerList = new ArrayList<>();

        Customer customer1 = new Customer("John", "pesek@gmail.com", "1234", "123456789");
        Customer customer2 = new Customer("Tomas", "tomas@gmail.com", "sauntesvej", "000456789");

        customer1.updateName("John");

        customerList.add(customer1);
        customerList.add(customer2);

        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Tomas");
        names.add("Petr");

        for (String name : names) {
            System.out.println(name);
        }

        Example ex = new Example("Tomas");
        ex.print();

        //mortgage calculator
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1000 and 1000000");
        }



    }
}
