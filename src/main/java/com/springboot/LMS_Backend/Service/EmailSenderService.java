package com.springboot.LMS_Backend.Service;

public interface EmailSenderService {
    void sendEmail(String[] toEmail, String subject, String text);
}
