public interface INotification
{
    void Send(string message);
}

public class EmailNotification : INotification
{
    public void Send(string message)
    {
        // Send email
    }
}

public class SMSNotification : INotification
{
    public void Send(string message)
    {
        // Send SMS
    }
}

public class PushNotification : INotification
{
    public void Send(string message)
    {
        // Send push notification
    }
}

public class NotificationService
{
    private readonly INotification notification;
    
    public NotificationService(INotification notification)
    {
        this.notification = notification;
    }
    
    public void Notify(string message)
    {
        notification.Send(message);
    }
}

// Client code
INotification notification = new EmailNotification(); // Or new SMSNotification(), new PushNotification()
NotificationService notificationService = new NotificationService(notification);
notificationService.Notify("This is a notification message");
