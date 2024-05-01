package com.example.emailapp;

import com.example.emailapp.service.EmailService;
import jakarta.mail.MessagingException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

@SpringBootTest
public class TestEmailSender {
    @Autowired
    private EmailService emailService;

    @Test
    void TestSendEmail() {
        String to = "wajihulhasan0104@gmail.com";
        String subject = "Test email";
        String text = "This is a test email";

        emailService.SendMail(to, subject, text);
    }

    @Test
    void TestSendEmails() {
        String[] to = new String[]{"wajihulhasan0104@gmail.com","sabih00525@gmail.com"};
        String subject = "Test email";
        String text = "This is a test email";

        emailService.SendMail(to, subject, text);
    }

    @Test
    void TestSendWithHtmlMail() throws MessagingException {
        String to = "wajihulhasan0104@gmail.com";
        String subject = "Test email";
        String htmlContent = "<h1>This is a test Spring Boot email</h1>" +
                "<p>It can contain <strong>HTML</strong> content.</p>";

        emailService.SendWithHtmlMail(to, subject , htmlContent);
    }

    @Test
    void TestSendWithFile() throws MessagingException {
        String to = "wajihulhasan0104@gmail.com";
        String subject = "This email contains attachment";
        String text = "This is a test email with attachments";
        emailService.SendWithFile(to, subject ,text , new File("C:/Users/Affan/Desktop/fyp Frontend/Stepway-FrontEnd/img/a.png"));
    }
}
