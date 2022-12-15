package BehavioralPatterns.ChainsOfResponsibility;

public class ChainsOfResponsibilityRunner {
    public static void main(String[] args) {
        Notifier messageNotifier = new SimpleMessageNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        messageNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        messageNotifier.notifyClient("The operation was carried out successfully", Priority.ROUTINE);
        messageNotifier.notifyClient("The operation was delayed", Priority.IMPORTANT);
        messageNotifier.notifyClient("The operation was cancelled", Priority.ASAP);
    }
}
