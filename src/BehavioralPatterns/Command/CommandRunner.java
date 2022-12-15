package BehavioralPatterns.Command;

public class CommandRunner {
    public static void main(String[] args) {
        BankDatabase bankDatabase = new BankDatabase();
        Accountant accountant = new Accountant(
                new InsertCommand(bankDatabase),
                new UpdateCommand(bankDatabase),
                new SelectCommand(bankDatabase),
                new DeleteCommand(bankDatabase)
        );
        accountant.insertRecord();
        accountant.updateRecord();
        accountant.selectRecord();
        accountant.deleteRecord();
    }
}
