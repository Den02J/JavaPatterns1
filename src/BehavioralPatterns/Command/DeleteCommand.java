package BehavioralPatterns.Command;

public class DeleteCommand implements Command{
    BankDatabase bankDatabase;

    public DeleteCommand(BankDatabase bankDatabase) {
        this.bankDatabase = bankDatabase;
    }

    @Override
    public void execute() {
        bankDatabase.delete();
    }
}
