package StructuralPatterns.Decorator;

public class Bookkeeper extends StaffMemberDecorator{
    public Bookkeeper(StaffMember employee) {
        super(employee);
    }

    public String countSomething(){
        return "Count something. ";
    }

    @Override
    public String doTheJob() {
        return super.doTheJob() + countSomething();
    }
}
