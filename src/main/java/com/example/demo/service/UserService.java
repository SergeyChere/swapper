package com.example.demo.service;

import com.example.demo.model.Item;
import com.example.demo.model.Offer;
import com.example.demo.model.User;

public interface UserService {
    boolean createUser(User user);
    boolean updateUser(User user);
    boolean deleteUser(Integer id);
    boolean createItem(Item item);
    boolean updateItem(Item item);
    boolean deleteItem(Integer id);
    boolean createOffer(Offer offer);
    boolean updateOffer(Offer offer);
    boolean deleteOffer(Integer id);
    boolean sendOffer(Offer offer);
}
