package BehavioralPatterns.Command;

public class SelectCommand implements Command{
    BankDatabase bankDatabase;

    public SelectCommand(BankDatabase bankDatabase) {
        this.bankDatabase = bankDatabase;
    }

    @Override
    public void execute() {
        bankDatabase.select();
    }
}
