package StructuralPatterns.Decorator;

public class CustomerServiceRepresentative implements StaffMember{
    @Override
    public String doTheJob() {
        return "Work with customers. ";
    }
}
