package com.example.walktracker;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/walk")
@CrossOrigin(origins = "*")
public class WalkController {

    private final EmailService emailService;

    public WalkController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/status")
    public String receiveStatus(@RequestBody WalkStatusRequest request) {
        emailService.sendEmail(request.getWalkStatus());
        return "Status saved: " + request.getWalkStatus();
    }
}
