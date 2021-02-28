package com.example.demo.model;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@ToString
public class Offer {
    private Integer id;
    private OfferStatus offerStatus;
    private List<Item> items;
    private Integer totalEstimatedPrice;
    private List<Group> groups;
    private User recipient;
    private User sender;
}
