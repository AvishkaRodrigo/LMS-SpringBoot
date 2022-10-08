package com.springboot.LMS_Backend.Service;

import com.springboot.LMS_Backend.model.Email;

public interface EmailSenderService {
    void sendEmail(String toEmail, String subject, String text);
}
