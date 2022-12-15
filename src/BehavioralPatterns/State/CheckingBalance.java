package BehavioralPatterns.State;

public class CheckingBalance implements Activity{
    @Override
    public void doIt() {
        System.out.println("Checking balance...");
    }
}
