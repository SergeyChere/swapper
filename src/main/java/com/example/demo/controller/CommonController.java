package com.example.demo.controller;

import com.example.demo.model.Item;
import com.example.demo.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class CommonController {

    private static Logger logger = Logger.getLogger(CommonController.class.getName());

    @Autowired
    private CommonService commonService;

    @GetMapping("/getItems")
    public List<Item> getItems(Integer scrollNumber) {
        logger.info("Request received");
        return commonService.scrollHistory(scrollNumber);
    }

    @GetMapping("/getItemsById/{id}")
    public Item getItemById(@PathVariable("id") Integer id) {
        logger.info("Request received");
        return commonService.getItem(id);
    }
}
