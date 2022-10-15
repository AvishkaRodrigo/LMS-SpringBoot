package com.springboot.LMS_Backend.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderServiceImplementation implements EmailSenderService {

    @Autowired
    private JavaMailSender mailSender;

    public EmailSenderServiceImplementation(JavaMailSender mailSender){
        this.mailSender = mailSender;
    }

    @Override
    public void sendEmail(String[] toEmail, String subject, String text){
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("institute.akura@gmail.com");
        message.setTo(toEmail);
        message.setText(text);
        message.setSubject(subject);

//        String[] members = {"avish.rodrigo11@gmail.com", "avishkachathuranga98@gmail.com"};


        for(String to : toEmail){
            message.setTo(to);
            System.out.println(to);
            mailSender.send(message);
        }

        System.out.println("Sent!");

    }

//    public void sendEmail(Email email){
//        SimpleMailMessage message = new SimpleMailMessage();
//
////        email.setToEmail("institute.akura@gmail.com");
////        email.setSubject("Subject Test");
////        email.setBody("Body ");
//
//        message.setFrom("institute.akura@gmail.com");
//        message.setTo(email.getToEmail());
//        message.setText(email.getBody());
//        message.setSubject(email.getSubject());
//
//        mailSender.send(message);
//        System.out.println("Sent!");
//
//    }

}
