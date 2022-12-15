package BehavioralPatterns.ChainsOfResponsibility;

public class EmailNotifier extends Notifier{
    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}
