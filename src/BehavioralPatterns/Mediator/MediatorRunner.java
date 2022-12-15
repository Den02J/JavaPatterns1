package BehavioralPatterns.Mediator;

public class MediatorRunner {
    public static void main(String[] args) {
        CustomServiceChat chat = new CustomServiceChat();

        User admin = new Admin(chat, "ADMIN");
        User user1 = new SimpleUser(chat, "User1");
        User user2 = new SimpleUser(chat, "user2");
        User user3 = new SimpleUser(chat, "user3");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);
        chat.addUserToChat(user3);

        user2.sendMessage("Hello!");
    }
}
