

package com.example.walktracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(String status) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("rohinipatilg95@gmail.com");
        message.setSubject("Daily Walk Tracker");
        message.setText("Today's walk status: " + status);

        mailSender.send(message);
    }
}
