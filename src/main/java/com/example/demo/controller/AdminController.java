package com.example.demo.controller;

import com.example.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@Profile("admin")
public class AdminController {

    private static Logger logger = Logger.getLogger(AdminController.class.getName());

    @Autowired
    private AdminService adminService;

    @GetMapping("/testAdmin")
    public String helloAdmin() {
        logger.info("Request received");
        return adminService.getHello();
    }
}
