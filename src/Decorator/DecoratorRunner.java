package Decorator;

public class DecoratorRunner {
    public static void main(String[] args) {
        StaffMember employee = new FinancialManager(new Bookkeeper(new CustomerServiceRepresentative()));
        System.out.println(employee.doTheJob());
    }
}
