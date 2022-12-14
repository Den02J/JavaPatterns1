package Composite;

public class CompositeRunner {
    public static void main(String[] args) {
        BankSystem system = new BankSystem();

        Employee firstEmployee1 = new Employee1();
        Employee secondEmployee1 = new Employee1();
        Employee firstEmployee2 = new Employee2();
        Employee secondEmployee2 = new Employee2();

        system.addEmployee(firstEmployee1);
        system.addEmployee(secondEmployee1);
        system.addEmployee(firstEmployee2);
        system.addEmployee(secondEmployee2);

        system.startWork();
    }
}
