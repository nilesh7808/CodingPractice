package CodingProblems.OOPs.Abstractions;

interface NotificationService{
    void sendNotification(String message);
}

class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification(String message) {
        System.out.println(message);
    }
}

class SMSNotificationService implements NotificationService{
    @Override
    public void sendNotification(String message){
        System.out.println(message);
    }
}

class WhatsAppNotification implements NotificationService{
    @Override
    public void sendNotification(String message){
        System.out.println(message);
    }
}


public class AbstractionMicroservice {

    public static void main(String[] args) {
        NotificationService notificationService = new EmailNotificationService();
        notificationService.sendNotification("You have received a new mail.");

        NotificationService notificationService1 = new WhatsAppNotification();
        notificationService1.sendNotification("This notification is from WhatsApp.");

        NotificationService notificationService2 = new SMSNotificationService();
        notificationService2.sendNotification("This Notification is from SMS.");

    }

}
