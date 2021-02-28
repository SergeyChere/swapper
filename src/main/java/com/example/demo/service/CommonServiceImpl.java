package com.example.demo.service;

import com.example.demo.model.Condition;
import com.example.demo.model.Group;
import com.example.demo.model.Item;
import com.example.demo.model.ItemStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

@Service
public class CommonServiceImpl implements CommonService {

    private static Logger logger = Logger.getLogger(CommonServiceImpl.class.getName());

    @Override
    public List<Item> scrollHistory(Integer scrollNum) {
        logger.info("Received scroll number "+scrollNum);
        List<Item> items = new ArrayList<>();
        Item item1 = Item.builder()
                .id(123123)
                .title("Rolex")
                .description("Good condition. Swap because don't need")
                .condition(Condition.USED_GREAT)
                .estimatedPrice(8000)
                .groups(Collections.singletonList(Group.builder()
                        .title("watch")
                        .build()))
                .photos(Collections.singletonList(null))
                .status(ItemStatus.OPEN)
                .build();
        Item item2 = Item.builder()
                .id(123123)
                .title("Rolex")
                .description("Good condition. Swap because don't need")
                .condition(Condition.USED_GREAT)
                .estimatedPrice(8000)
                .groups(Collections.singletonList(Group.builder()
                        .title("watch")
                        .build()))
                .photos(Collections.singletonList(null))
                .status(ItemStatus.OPEN)
                .build();
        items.add(item1);
        items.add(item2);
        return items;
    }

    @Override
    public Item getItem(Integer id) {
        logger.info("Received id number "+id);
        return Item.builder()
                .id(123123)
                .title("Rolex")
                .description("Good condition. Swap because don't need")
                .condition(Condition.USED_GREAT)
                .estimatedPrice(8000)
                .groups(Collections.singletonList(Group.builder()
                        .title("watch")
                        .build()))
                .photos(Collections.singletonList(null))
                .status(ItemStatus.OPEN)
                .build();
    }
}
