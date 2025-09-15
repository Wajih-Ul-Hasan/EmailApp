package com.example.emailapp.service;

import jakarta.mail.MessagingException;

import java.io.File;

public interface EmailService {

    void SendMail(String to , String subject , String text);

    void SendMail(String[] to , String subject , String text);

    void SendWithHtmlMail(String to , String subject , String htmlContent) throws MessagingException;

    void SendWithFile(String to , String Subject , String Text , File file) throws MessagingException;
}

