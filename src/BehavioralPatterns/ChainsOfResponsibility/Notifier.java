package BehavioralPatterns.ChainsOfResponsibility;

public abstract class Notifier {
    private final int priority;
    private Notifier nextNotifier;

    public Notifier(int priority) {
        this.priority = priority;
    }

    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    public void notifyClient(String message, int level){
        if(level >= priority){
            send(message);
        }
        if(nextNotifier != null){
            nextNotifier.notifyClient(message, level);
        }
    }

    public abstract void send(String message);
}
