package com.example.demo.service;

import com.example.demo.model.Item;
import com.example.demo.model.Offer;
import com.example.demo.model.User;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
@Profile("{!common}")
public class UserServiceImpl implements UserService {

    private static Logger logger = Logger.getLogger(UserServiceImpl.class.getName());

    @Override
    public boolean createUser(User user) {
        logger.info("Received user "+user.toString());
        return true;
    }

    @Override
    public boolean updateUser(User user) {
        logger.info("Received user "+user.toString());
        return true;
    }

    @Override
    public boolean deleteUser(Integer id) {
        logger.info("Received id for user "+id);
        return true;
    }

    @Override
    public boolean createItem(Item item) {
        logger.info("Received user "+item.toString());
        return true;
    }

    @Override
    public boolean updateItem(Item item) {
        logger.info("Received user "+item.toString());
        return true;
    }

    @Override
    public boolean deleteItem(Integer id) {
        logger.info("Received id for item "+id);
        return true;
    }

    @Override
    public boolean createOffer(Offer offer) {
        logger.info("Received user "+offer.toString());
        return true;
    }

    @Override
    public boolean updateOffer(Offer offer) {
        logger.info("Received user "+offer.toString());
        return true;
    }

    @Override
    public boolean deleteOffer(Integer id) {
        logger.info("Received id for offer "+id);
        return true;
    }

    @Override
    public boolean sendOffer(Offer offer) {
        logger.info("Received user "+offer.toString());
        return true;
    }
}
