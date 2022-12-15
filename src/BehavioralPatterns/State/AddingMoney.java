package BehavioralPatterns.State;

public class AddingMoney implements Activity{
    @Override
    public void doIt() {
        System.out.println("Adding money if needed...");
    }
}
