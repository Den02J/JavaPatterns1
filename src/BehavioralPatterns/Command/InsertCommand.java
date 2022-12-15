package BehavioralPatterns.Command;

public class InsertCommand implements Command{
    BankDatabase bankDatabase;

    public InsertCommand(BankDatabase bankDatabase) {
        this.bankDatabase = bankDatabase;
    }

    @Override
    public void execute() {
        bankDatabase.insert();
    }
}
