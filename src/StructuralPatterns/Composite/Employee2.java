package StructuralPatterns.Composite;

public class Employee2 implements Employee{
    @Override
    public void carryOutTransaction() {
        System.out.println("Employee taking a break");
    }
}
