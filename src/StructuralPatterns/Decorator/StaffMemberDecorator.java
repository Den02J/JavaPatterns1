package StructuralPatterns.Decorator;

public class StaffMemberDecorator implements StaffMember{
    StaffMember employee;

    public StaffMemberDecorator(StaffMember employee) {
        this.employee = employee;
    }

    @Override
    public String doTheJob() {
        return employee.doTheJob();
    }
}
