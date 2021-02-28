package com.example.demo.service;

import com.example.demo.model.Item;

import java.util.List;

public interface CommonService {
    List<Item> scrollHistory(Integer scrollNum);
    Item getItem(Integer id);
}
