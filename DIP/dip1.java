// Define the abstraction
interface MessageService {
    void sendMessage(String message);
}

// Implement the abstraction for Email
class EmailService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Email sent: " + message);
    }
}

// Implement the abstraction for SMS
class SMSService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("SMS sent: " + message);
    }
}

// High-level module depends on the abstraction
class NotificationService {
    private MessageService messageService;

    public NotificationService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendNotification(String message) {
        messageService.sendMessage(message);
    }
}

public class Main {
    public static void main(String[] args) {
        MessageService emailService = new EmailService();
        MessageService smsService = new SMSService();

        NotificationService emailNotificationService = new NotificationService(emailService);
        NotificationService smsNotificationService = new NotificationService(smsService);

        emailNotificationService.sendNotification("Hello via Email!");
        smsNotificationService.sendNotification("Hello via SMS!");
    }
}
