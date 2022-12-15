package StructuralPatterns.Decorator;

public class FinancialManager extends StaffMemberDecorator{

    public FinancialManager(StaffMember employee) {
        super(employee);
    }

    public String makeReport(){
        return "Makes a report. ";
    }

    @Override
    public String doTheJob() {
        return super.doTheJob() + makeReport();
    }
}
