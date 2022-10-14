package com.springboot.LMS_Backend.controller;

import com.springboot.LMS_Backend.Service.EmailSenderService;
import com.springboot.LMS_Backend.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
@CrossOrigin
public class EmailController {
    @Autowired
    private EmailSenderService emailSenderService;

    public EmailController(EmailSenderService emailSenderService){
        this.emailSenderService = emailSenderService;
    }

    @PostMapping("/announcement")
    public String sendNew(@RequestBody Email email) {
        this.emailSenderService.sendEmail(email.getToEmail(),email.getSubject(), email.getText());
        return "Email sent!";
    }

}
