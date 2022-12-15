package BehavioralPatterns.ChainsOfResponsibility;

public class SMSNotifier extends Notifier{
    public SMSNotifier(int priority) {
        super(priority);
    }

    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
