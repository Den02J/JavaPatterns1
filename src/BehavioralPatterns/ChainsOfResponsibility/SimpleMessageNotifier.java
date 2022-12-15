package BehavioralPatterns.ChainsOfResponsibility;

public class SimpleMessageNotifier extends Notifier{
    public SimpleMessageNotifier(int priority) {
        super(priority);
    }

    @Override
    public void send(String message) {
        System.out.println("Simple message notification: " + message);
    }
}
