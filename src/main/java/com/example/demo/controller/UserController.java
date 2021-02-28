package com.example.demo.controller;

import com.example.demo.model.Item;
import com.example.demo.model.Offer;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@Profile("{!common}")
public class UserController {

    private static Logger logger = Logger.getLogger(UserController.class.getName());

    @Autowired
    private UserService userService;

    @PostMapping("/createUser")
    public boolean createUser(@RequestBody User user) {
        logger.info("Request received");
        return userService.createUser(user);
    }

    @PutMapping("/updateUser")
    public boolean updateUser(@RequestBody User user) {
        logger.info("Request received");
        return userService.updateUser(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public boolean deleteUser(@PathVariable("id") Integer id) {
        logger.info("Request received");
        return userService.deleteUser(id);
    }

    @PostMapping("/createItem")
    public boolean createItem(@RequestBody Item item) {
        logger.info("Request received");
        return userService.createItem(item);
    }

    @PutMapping("/updateItem")
    public boolean updateItem(@RequestBody Item item) {
        logger.info("Request received");
        return userService.updateItem(item);
    }

    @DeleteMapping("/deleteItem/{id}")
    public boolean deleteItem(@PathVariable("id") Integer id) {
        logger.info("Request received");
        return userService.deleteItem(id);
    }

    @PostMapping("/createOffer")
    public boolean createOffer(@RequestBody Offer offer) {
        logger.info("Request received");
        return userService.createOffer(offer);
    }

    @PutMapping("/updateOffer")
    public boolean updateOffer(@RequestBody Offer offer) {
        logger.info("Request received");
        return userService.updateOffer(offer);
    }

    @DeleteMapping("/deleteOffer/{id}")
    public boolean deleteOffer(@PathVariable("id") Integer id) {
        logger.info("Request received");
        return userService.deleteOffer(id);
    }

    @PostMapping("/sendOffer")
    public boolean sendOffer(@RequestBody Offer offer) {
        logger.info("Request received");
        return userService.sendOffer(offer);
    }
}
