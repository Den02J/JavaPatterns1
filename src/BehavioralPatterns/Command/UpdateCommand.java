package BehavioralPatterns.Command;

public class UpdateCommand implements Command{
    BankDatabase bankDatabase;

    public UpdateCommand(BankDatabase bankDatabase) {
        this.bankDatabase = bankDatabase;
    }

    @Override
    public void execute() {
        bankDatabase.update();
    }
}
