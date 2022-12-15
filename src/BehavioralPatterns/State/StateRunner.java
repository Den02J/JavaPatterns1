package BehavioralPatterns.State;

public class StateRunner {
    public static void main(String[] args) {
        Activity activity = new CheckingBalance();
        BankCustomer bankCustomer = new BankCustomer(activity);

        for (int i = 0; i < 8; i++) {
            bankCustomer.doIt();
            bankCustomer.changeActivity();
        }
    }
}
