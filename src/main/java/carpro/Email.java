package carpro;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Email {

    private static final String SMTP_HOST = "smtp.gmail.com"; // Replace with your SMTP host
    private static final String SMTP_PORT = "587"; // Replace with your SMTP port
    private static final String SENDER_EMAIL = "s12042862@stu.najah.edu"; // Replace with your email

    public static void sendConfirmationEmailToCustomer(String customerEmail, String orderDetails) {
        String subject = "Order Confirmation";
        String body = "Thank you for your order!\n" + orderDetails;
        sendEmail(customerEmail, subject, body);
    }

    public static void sendNotificationEmailToInstaller(String installerEmail, String orderDetails) {
        String subject = "New Order Notification";
        String body = "A new order has been placed!\n" + orderDetails;
        sendEmail(installerEmail, subject, body);
    }

    private static void sendEmail(String to, String subject, String body) {
        Properties properties = new Properties();
        properties.put("mail.smtp.host", SMTP_HOST);
        properties.put("mail.smtp.port", SMTP_PORT);

        Session session = Session.getInstance(properties, null);

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(SENDER_EMAIL));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(subject);
            message.setText(body);

            Transport.send(message);

            // You can add logging or assertions for successful email sending here
            System.out.println("Email sent successfully to: " + to);
        } catch (MessagingException e) {
            e.printStackTrace(); // Handle exceptions appropriately

            // Log failure or assert failure
            System.err.println("Failed to send email to: " + to);
        }
    
}
}